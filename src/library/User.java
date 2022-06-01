
package library;


public class User extends Person {
    private String UserId;
    private String Password;
  
    
// this is function is getting data 
    public String getUserId() {
        return UserId;
    }

    public String getPassword() {
        return Password;
    }

  

    //this is function is setting data or displaydata
    
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
