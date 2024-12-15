import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Результат деления: " + result);
        }
        catch (InputMismatchException e){
            System.out.println("this should be int");
        }
        catch (ArithmeticException e){
            System.out.println("you can't divide by zero");
        }
    }
}
