import java.util.*;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        float marks = sc.nextFloat();
        if(marks>95){
            System.out.println("Distinction");
        }else if(marks>80){
            System.out.println("First class");
        }else if(marks>60){
            System.out.println("second class");
        }else if(marks>40){
            System.out.println("Third class");
        }else{
            System.out.println("Fail");
        }
    }
}