package library;

public class Books {

    private String Book_name;
    private int Book_Id;
    private String Rent_price;
    private String Book_Type;
    private String nameAuther;
    private int Book_Copies;
    private int date_day;
    private int date_month;

    public Books(){
     Book_name=null;
     Rent_price=null;
     Book_Type=null;
     nameAuther=null;
     Book_Id=0;
     Book_Copies=0;
    }
    
    public Books(int id,int copies){
     Book_name=null;
     Rent_price=null;
     Book_Type=null;
     nameAuther=null;
     Book_Id=id;
     Book_Copies=copies;
    }
    
    public int getDate_day() {
        return date_day;
    }

    public int getDate_month() {
        return date_month;
    }

    //getting 
    public String getBook_name() {
        return Book_name;
    }

    public int getBook_Id() {
        return Book_Id;
    }

    public String getRent_price() {
        return Rent_price;
    }

    public String getBook_Type() {
        return Book_Type;
    }

    public String getNameAuther() {
        return nameAuther;
    }

    public int getBook_Copies() {
        return Book_Copies;
    }

    //setting 
    public void setBook_name(String Book_name) {
        this.Book_name = Book_name;
    }

    public void setBook_Id(int Book_Id) {
        this.Book_Id = Book_Id;
    }

    public void setRent_price(String Rent_price) {
        this.Rent_price = Rent_price;
    }

    public void setBook_Type(String Book_Type) {
        this.Book_Type = Book_Type;
    }

    public void setNameAuther(String nameAuther) {
        this.nameAuther = nameAuther;
    }

    public void setBook_Copies(int Book_Copies) {
        this.Book_Copies = Book_Copies;
    }

    public void setDate_day(int date_day) {
        this.date_day = date_day;
    }

    public void setDate_month(int date_month) {
        this.date_month = date_month;
    }

}
