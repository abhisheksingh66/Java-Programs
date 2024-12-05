class UserRegistration {
    String username;
    String password;
    long phoneno;
    String emailid;

    UserRegistration(String username, String password, long phoneno) {
        this.username = username;
        this.password = password;
        this.phoneno = phoneno;

    }

    UserRegistration(String username, String password, String emailid) {
        this.username = username;
        this.password = password;
        this.emailid = emailid;
    }

    UserRegistration(String username, String password, long phoneno, String emailid) {
        this.username = username;
        this.password = password;
        this.phoneno = phoneno;
        this.emailid = emailid;
    }
    void display(){
    // System.out.println("UserName " + username +" Password " + password+ " Email " + emailid + " PhoneNo " + phoneno);
     
        System.out.println("username: " + username + " password: " + password + "phone number : " + phoneno + " Email: " + emailid );
    
    }
}

public class code23 {
    public static void main(String[] args) {
        System.out.println("Main Method Started !");

        UserRegistration user1 = new UserRegistration("abhishek", "1224", 48746121);
        UserRegistration user2 = new UserRegistration("abhishek", "1224", "abhishek@4654.com");
        UserRegistration user3 = new UserRegistration("abhishek", "1224", 48746121, "abhishek@4654.com");
        user1.display();
        user2.display();
        user3.display();
    }
}
