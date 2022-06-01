package library;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Librarian user = new Librarian();
        Reader read = new Reader();

        int choise;
        do {
            System.out.println("if you want show the info of the admans to contact of them please enter 1:");
            System.out.println("if you want enter the library as a abmans please enter 2:");
            System.out.println("if you want enter the library as a reader please enter 3");
            System.out.println("If you want to exit the program press 4");
            System.out.print("Please Enter your Choice : ");

            choise = input.nextInt();

            if (choise == 1) {
                user.displaydata();
            } else if (choise == 2) {
                boolean check = false;
                do {
                    System.out.println("please enter your password :\n\n");
                    String password1 = input.next();
                    for (int i = 0; i < 6; i++) {

                        if (user.admans[i].getPassword().equals(password1)) {
                            check = true;
                            System.out.println("your password is vaild you can make :");
                            System.out.println("1) if you want search of book please enter 1:");
                            System.out.println("2) if you want add book please enter 2:");
                            System.out.println("3) if you want add reader please enter 3:");
                            System.out.println("4) if you want remove book please enter 4:");
                            System.out.println("5) if you want remove reader please enter 5:");
                            System.out.print("Please Enter your Choice : ");
                            int choise1 = input.nextInt();
                            if (choise1 == 1) {
                                System.out.println("please enter the id of book :");
                                int id = input.nextInt();
                                user.Searchofbooks(id);
                            } else if (choise1 == 2) {

                                user.addbook();
                            } else if (choise1 == 3) {
                                user.addreader();
                            } else if (choise1 == 4) {
                                System.out.println("please enter the name of book want to remove:");
                                String Name = input.next();
                                user.removeBook(Name);
                            } else if (choise1 == 5) {
                                System.out.println("please enter the reader id want to remove:");
                                String Readerid = input.nextLine();
                                user.removereader(Readerid);

                            }
                        }

                    }
                    if (check == false) {
                        System.out.println("your password invaild :");
                        System.out.println("Please Enter a Valid Password..........\n");
                    }
                    System.out.println("---------------------------------------------------------------");
                } while (check == false);
            } else if (choise == 3) {
                System.out.println("please enter the id of reader ");
                String Id = input.next();
                System.out.println("1) if you want search the book please enter 1:");
                System.out.println("2) if you want return the book please enter 2:");
                System.out.println("3) if you want show the emails of reader block please enter 3:");
                int Checked = input.nextInt();
                if (Checked == 1) {
                    read.sign_up(user, Id);
                } else if (Checked == 2) {
                    read.return_book(user, user, Id);
                } else if (Checked == 3) {
                    read.blocked_user();
                }

            } else if (choise == 4) {
                System.out.println("Exiting the Program .......");
            } else {
                System.out.println("Wrong Choice Please enter a valid Choice...");
            }
            System.out.println("---------------------------------------------------------------");
        } while (choise != 4);

    }
}
