package CLASSES_OBJECTS;

class Bankaccount {
    private String password;
    public String username;
     
    void setuser(String username){
        this.username = username;
   }

    String getuser(){
         return username;
    }

    void setpass(String password){
         this.password = password;
    }

    String getpass(){
        return password;
   }


}
public class class_code2 {
    public static void main(String[] args) {
        Bankaccount b = new Bankaccount();
       
        b. setuser("Amrinder singh");
        b.setpass("Amxr@inder");

        System.out.println("My username is : " + b.getuser());
        System.out.println("My username password is : " + b.getpass());
    }
}
