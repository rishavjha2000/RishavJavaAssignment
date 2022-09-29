import java.util.Scanner;
public class secondprogram {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        String a;
        String r = "";
        do{
            System.out.println("Enter the string");
            a = sc.next();
            r = r+a;

        }while(!"XDONE".equals(a));
        System.out.println(r);
        
    }
    
}
