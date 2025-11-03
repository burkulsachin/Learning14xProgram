package ex_20__OOPs_accessModifer.superkeyword;

public class Lab0150 {
    public static void main(String[] args) {
        BaseClass b = new BaseClass();
        TestCase t = new TestCase();


    }

}
class  BaseClass {


        BaseClass(){
            System.out.println("DC - Parent class Consructor");
        }
        BaseClass(String browser){
            System.out.println("Parameterised Con - Parent");
        }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;


    void openBrowser(){
        System.out.println("Opening Browser!!");

    }
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class  TestCase extends  BaseClass{
        void testTC(){
            }
    TestCase(){
            super("Chrome");
            super.openBrowser();;
            super.closeBrowser();
        System.out.println(super.getBrowser());
            super.setBrowser("FF");

        }
}