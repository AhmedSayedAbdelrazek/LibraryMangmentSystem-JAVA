package library;

import java.util.Scanner;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reader extends Librarian {

    Scanner input = new Scanner(System.in);
    String blocked[] = new String[100];
    public static int Numberofblocked = 0;
    // Librarian readers=new Librarian();

    public void sign_up(Librarian readers, String Id) {
        boolean checks = false;

        for (int i = 0; i < NumberOFReader; i++) {
            if (readers.reader[i].getUserId().equals(Id)) {
                checks = true;
                System.out.println("if you want search of book please enter id of this book :");
                int id = input.nextInt();
                readers.Searchofbooks(id);
                System.out.println("........................................................\n\n");
                System.out.println("Do you want to search another book ? (y/n)");
                char choice = input.next().charAt(0);
                if (choice == 'y') {
                    System.out.println("pleace entre id of this book :");
                    int _id = input.nextInt();
                    readers.Searchofbooks(_id);
                    System.out.println("........................................................\n\n");
                } else {
                    System.out.println("thank you......");
                }
                break;
            }
        }
        if (checks == false) {
            System.out.println("this is invalid id of the reader.....");
        }
    }

    public void return_book(Librarian id_reader, Librarian id_book, String reader_id) {
        boolean Day = false;
        boolean month = false;

        Date setdate = new Date();
        SimpleDateFormat formate_date = new SimpleDateFormat("dd/MM");
        String info = formate_date.format(setdate);
        int date_day = (info.charAt(0) - 48) * 10 + (info.charAt(1) - 48);
        int date_month = (info.charAt(3) - 48) * 10 + (info.charAt(4) - 48);

        System.out.println("please enter the id of book :");
        int ID_book = input.nextInt();
        for (int i = 0; i < NumberOfBooks; i++) {
            if (id_book.datas.data_books[i].getBook_Id() == ID_book) {
                if (date_month < id_book.datas.data_books[i].getDate_month()) {
                    month = true;
                    break;
                }
                if (date_month == id_book.datas.data_books[i].getDate_month()) {
                    month = true;
                    if (date_day <= id_book.datas.data_books[i].getDate_day()) {
                        Day = true;
                    }
                }

            }
        }
        if (month == false && Day == false || month == true && Day == false) {
            {
                System.out.println("this is user will be bloced and cannot enter the libaray again......\n\n");
                for (int i = 0; i < 300; i++) {
                    if (blocked[i] == null && id_reader.reader[i].getUserId().equals(reader_id)) {
                        blocked[i] = id_reader.reader[i].getE_Mail();
                        id_reader.reader[i] = null;
                        Numberofblocked += 1;
                        NumberOFReader -= 1;
                        break;
                    }
                }
            }
        }
    }

    public void blocked_user() {
        if (Numberofblocked == 0) {
            System.out.println("there is no any user is blocked :");
        } else {
            for (int i = 0; i < Numberofblocked; i++) {
                System.out.println(blocked[i] + "\n");
            }
        }
    }
}
