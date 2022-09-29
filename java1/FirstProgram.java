public class FirstProgram {
    public static String firstName = "Rishav";
    public static String lastName = "Jha";
    public static int age = 22;

    public static void method(){
        System.out.println("In static method");
        System.out.println("Rishav Jha 22");

    }

    public static void main(String[] args) {
        System.out.println("In static main");
        System.out.println(firstName + ' ' + lastName + ' ' + age);
        method();
    }
    
    static{
        System.out.println("In static block");
        System.out.println("Rishav Jha 22");
        
    }
}