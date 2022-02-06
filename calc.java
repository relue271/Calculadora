import java.util.Scanner;

public class exemplo{
    public static void main(String[] args){
        
        Scanner integerValueA = new Scanner(System.in);
        int intValA = integerValueA.nextInt();
        

        Scanner integerValueB = new Scanner(System.in);
        int intValB = integerValueB.nextInt();
        

        int PROD = intValA * intValB;

        System.out.println("PROD = " + PROD);

        return;
    }
}
