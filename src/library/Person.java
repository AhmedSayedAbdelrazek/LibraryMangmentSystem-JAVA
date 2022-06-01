
package library;


public abstract class  Person {
    
    private String F_Name;
    private String L_Name;
    private String Adress;
    private String callphone;
    private String E_Mail;
    private String type;
    
    
    // get function 
      public String getF_Name() {
        return F_Name;
    }

    public String getL_Name() {
        return L_Name;
    }

    public String getAdress() {
        return Adress;
    }

    public String getCallphone() {
        return callphone;
    }

    public String getE_Mail() {
        return E_Mail;
    }

   

    public String getType() {
        return type;
    }
    //setting 
     public void setF_Name(String F_Name) {
        this.F_Name = F_Name;
    }

    public void setL_Name(String L_Name) {
        this.L_Name = L_Name;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setCallphone(String callphone) {
        this.callphone = callphone;
    }

    public void setE_Mail(String E_Mail) {
        this.E_Mail = E_Mail;
    }


    public void setType(String type) {
        this.type = type;
    }
    
    public abstract void displaydata();
}
