package ex_18_OOPs_Polymorphism.methodoverriding;

public class Lab0147_Methodoverrding_Automation {
    static void main(String[] args) {
        ChromeTC ch = new ChromeTC();
        ch.openBrowser();

        FireFoxTC ff = new FireFoxTC();
        ff.openBrowser();

        CommonToAll ca = new CommonToAll();
        ca.openBrowser();

        // Dynamic Dispatch
        CommonToAll cch = new ChromeTC();
        cch.openBrowser();

        CommonToAll cff = new FireFoxTC();
        cff.openBrowser();
    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Starting the IE Browser");
    }
}
class  ChromeTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Starting Chrome Browser");
    }
}
class FireFoxTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Starting FireFox Browser");
    }

}

