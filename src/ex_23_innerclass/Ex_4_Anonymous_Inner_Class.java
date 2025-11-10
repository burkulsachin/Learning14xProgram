package ex_23_innerclass;

public class Ex_4_Anonymous_Inner_Class {
    public static void main(String[] args) {
        WebEvent btn = new WebEvent() {
            @Override
            public void click() {
                System.out.println("Button Clicked");
            }
        };
        btn.click();
    }
}

interface WebEvent{
    void  click();

}
