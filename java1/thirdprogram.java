import java.util.Scanner;
public class secondprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pai = 3.14;
        double r;
        System.out.println("*** Menu ***");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate circumference of a circle");
        System.out.println("3. exit");

        int n = sc.nextInt();
        switch(n){
            case 1: {
                System.out.println("Enter the radius");
                r = sc.nextDouble();
                System.out.println("Area of Circle: "+ (pai*r*r));
                break;
            
            }
            case 2:{
            case 3: {
                System.out.println("Exit");

            }
        }
    }
    
}
