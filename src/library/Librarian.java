package library;

import java.util.Scanner;

public class Librarian {

    User admans[] = new User[6];
    User reader[] = new User[300];
    public static int NumberOFReader = 0;
    Books_data datas = new Books_data();
    int n = 0;
    public static int NumberOfBooks = 12;
    Scanner input = new Scanner(System.in);

    public Librarian() {

        admans[0] = new User();
        admans[0].setUserId("2568508");
        admans[0].setPassword("yehia@010");
        admans[0].setF_Name("yehia");
        admans[0].setL_Name("hassanain");
        admans[0].setAdress("egypt");
        admans[0].setCallphone("01028648289");
        admans[0].setE_Mail("yehiahassanain@gmail.com");
        admans[0].setType("male");

        admans[1] = new User();
        admans[1].setUserId("482648");
        admans[1].setPassword("ali@010");
        admans[1].setF_Name("ali");
        admans[1].setL_Name("mohamed");
        admans[1].setAdress("egypt");
        admans[1].setCallphone("01146784463");
        admans[1].setE_Mail("alimohamed@gmail.com");
        admans[1].setType("male");

        admans[2] = new User();
        admans[2].setUserId("854972");
        admans[2].setPassword("mohamed@010");
        admans[2].setF_Name("mohame");
        admans[2].setL_Name("hany");
        admans[2].setAdress("egypt");
        admans[2].setCallphone("01012102371");
        admans[2].setE_Mail("mohamedhany@gmail.com");
        admans[2].setType("male");

        admans[3] = new User();
        admans[3].setUserId("8721065");
        admans[3].setPassword("mohamed@pop");
        admans[3].setF_Name("mohamed");
        admans[3].setL_Name("zaki");
        admans[3].setAdress("egypt");
        admans[3].setCallphone("01001145969");
        admans[3].setE_Mail("mohamedzaki@gmail.com");
        admans[3].setType("male");

        admans[4] = new User();
        admans[4].setUserId("987462");
        admans[4].setPassword("ahmed@010");
        admans[4].setF_Name("ahmed");
        admans[4].setL_Name("sayed");
        admans[4].setAdress("egypt");
        admans[4].setCallphone("01553737644");
        admans[4].setE_Mail("ahnedsayed@gmail.com");
        admans[4].setType("male");

        admans[5] = new User();
        admans[5].setUserId("1250364");
        admans[5].setPassword("ahmed@015");
        admans[5].setF_Name("ahmed");
        admans[5].setL_Name("fahmy");
        admans[5].setAdress("egypt");
        admans[5].setCallphone("01003069836");
        admans[5].setE_Mail("ahnedfahmy@gmail.com");
        admans[5].setType("male");

    }

    public void displaydata() {

        for (int i = 0; i < 6; i++) {
            System.out.println("the name of adman " + (i + 1) + ":" + admans[i].getF_Name() + " " + admans[i].getL_Name());
            System.out.println("the address of adman " + (i + 1) + ":" + admans[i].getAdress());
            System.out.println("the number phone of adman " + (i + 1) + ":" + admans[i].getCallphone());
            System.out.println("the e_mail of adman " + (i + 1) + ":" + admans[i].getE_Mail());
            System.out.println("the gender of adman " + (i + 1) + ":" + admans[i].getType());
            System.out.println("-----------------------------------------------");
        }
    }

    public void Searchofbooks(int Id) {
        boolean check = false;
        for (int i = 0; i < NumberOfBooks; i++) {
            if ( datas.data_books[i] != null && datas.data_books[i].getBook_Id() == Id) {
                check = true;
                System.out.println("the name of book is " + datas.data_books[i].getBook_name());
                System.out.println("the price of book is " + datas.data_books[i].getRent_price());
                System.out.println("the type of book is " + datas.data_books[i].getBook_Type());
                System.out.println("the name of auther of the book is " + datas.data_books[i].getNameAuther());
                System.out.println("the copyies available of book is " + datas.data_books[i].getBook_Copies());
               // System.out.println("the end date the reader should be return this book is " + datas.data_books[i].getDate_day() + " " + datas.data_books[i].getDate_month());
            }
          
            
        }
        if (check == false) {
            System.out.println("sorry this is book is invalid :");
            System.out.println("Do you want to search another Book ? (y/n)");
            char choice = input.next().charAt(0);
            if (choice == 'y') {
                System.out.println("please enter the id of book :");
                int id = input.nextInt();
                Searchofbooks(id);
            } else {
                System.out.println("Thanks For search the Books....... :) ");
            }
        }
    }

    public void addbook() {

        for (int i = 0; i < 300; i++) {
            if (datas.data_books[i] == null) {
                datas.data_books[i] = new Books();
                System.out.println("please enter the name of book :");
                String book_name = input.next();
                datas.data_books[i].setBook_name(book_name);
                System.out.println("please enter the book id :");
                int book_id = input.nextInt();
                datas.data_books[i].setBook_Id(book_id);
                System.out.println("please enter the type of book :");
                String book_type = input.next();
                datas.data_books[i].setBook_Type(book_type);
                System.out.println("please enter the price of book :");
                String book_price = input.next();
                datas.data_books[i].setRent_price(book_price);
                System.out.println("please enter the auther of book :");
                String book_auther = input.next();
                datas.data_books[i].setNameAuther(book_auther);
                System.out.println("please enter the number of book :");
                int nomcopies = input.nextInt();
                datas.data_books[i].setBook_Copies(nomcopies);
                System.out.println("please enter the end date to take this is book :");
                int date_day = input.nextInt();
                datas.data_books[i].setDate_day(date_day);
                int date_month = input.nextInt();
                datas.data_books[i].setDate_month(date_month);
                break;
            }
        }
        NumberOfBooks += 1;
        System.out.println("Do you want to add another Book ? (y/n)");
        char choice = input.next().charAt(0);
        if (choice == 'y') {
            addbook();
        } else {
            System.out.println("Thanks For Adding the Books....... :) ");
        }

    }

    public void removeBook(String name) {
        for (int i = 0; i < NumberOfBooks; i++) {
            if (datas.data_books[i] != null && datas.data_books[i].getBook_name().equals(name)) {
                datas.data_books[i] = null;
                NumberOfBooks -= 1;
                break;
            }
        }

    }

    public void addreader() {
        for (int i = 0; i < 300; i++) {
            if (reader[i] == null) {
                reader[i] = new User();
                System.out.println("Please Enter your first name : ");
                String first_name = input.next();
                reader[i].setF_Name(first_name);
                System.out.println("Please Enter your last name : ");
                String last_name = input.next();
                reader[i].setL_Name(last_name);
                System.out.println("Please Enter your reader Id : ");
                String reader_Id = input.next();
                reader[i].setUserId(reader_Id);
                System.out.println("Please Enter your  address : ");
                String address = input.next();
                reader[i].setAdress(address);
                System.out.println("Please Enter your  phone number : ");
                String phonenom = input.next();
                reader[i].setCallphone(phonenom);
                System.out.println("Please Enter your  email: ");
                String email = input.next();
                reader[i].setE_Mail(email);
                System.out.println("Please Enter your  gender : ");
                String gender = input.next();
                reader[i].setType(gender);
                break;
            }
        }
        NumberOFReader += 1;

        System.out.println("Do you want to add another reader ? (y/n)");
        char choice = input.next().charAt(0);
        if (choice == 'y') {
            addreader();
        } else {
            System.out.println("Thanks For Adding the reader......... :) ");
        }
    }

    public void removereader(String Reader_Id) {
        for (int i = 0; i < NumberOFReader; i++) {

            if (reader[i] != null && reader[i].getUserId().equals(Reader_Id)) {
                reader[i] = null;
                NumberOFReader -= 1;
                break;
            }
        }

    }
    
}
