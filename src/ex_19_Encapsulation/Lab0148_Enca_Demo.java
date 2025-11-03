package ex_19_Encapsulation;

public class Lab0148_Enca_Demo {
    static void main(String[] args) {
        VWOLogin v= new VWOLogin("admin", "abc@123");
        v.password = "345";
        System.out.println(v.password);


        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
//        System.out.println(vwoLogin1.password);
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);
        vwoLogin1.setPassword("Pramodchild@123",false);
    }
}
class VWOLogin{
    public String username;
    public String password;

    public  VWOLogin(String username, String password){
        this.username=username;
        this.password= password;

    }
}
class GoodVWOLogin{
    private  String username;
    private  String password;

    GoodVWOLogin(String username,String password){
        this.password=password;
        this.username=username;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isGoodAunty) {
        if(isGoodAunty=true){
            this.password = password;
        }else{
            System.out.println("Not Allowed");
        }

    }




}
