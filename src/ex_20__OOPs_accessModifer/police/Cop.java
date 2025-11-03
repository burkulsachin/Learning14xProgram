package ex_20__OOPs_accessModifer.police;

public class Cop {
    public   int gun;
    private   String icard;

    public Cop(int bullet) {
        this.gun=bullet;
    }
protected void canIShoot(){
    System.out.println("yes You can");
}




}
