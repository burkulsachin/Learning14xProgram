package ex_07_Switch;


public class Lab0055_Switch {
    public static void main(String[] args) {
        int day =4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            default:
                System.out.println("enter the valid day");
        }

    }
}

// Output: Thursday
