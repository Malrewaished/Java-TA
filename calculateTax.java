import java.util.Scanner;

public class calculateTax {

public static void main(String[] args){

    Scanner sc= new Scanner(System.in);
    System.out.println("Plz enter price between 100 - 500: ");
    int num = sc.nextInt();
    System.out.println(calculateTax(num));

}
//    Create method called " calculateTax "
    public static int calculateTax(int num)
    {
        int tax = 0;
        if (num < 100 || num > 500){
            System.out.println("The price should be BTW 100 -500");
        }
        else {
            tax = num * 15 / 100;
        }
        return tax;
    }
}