//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number_for_guess = generateNumber();
        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                int number = scanner.nextInt();
                if(number < 0 || number > 100) {
                    throw new IllegalArgumentException("Неверный ввод, Введите число от 0 до 100");
                }
//                System.out.println(number);
//                System.out.println(number_for_guess);
                if (number == number_for_guess){
                    System.out.printf("Вы угадали число!");
                    break;
                }
                else if(number > number_for_guess){
                    System.out.println("Искомое число меньше вашего");
                }
                else{
                    System.out.println("Искомое число больше вашего");
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод, введите целое число от 0 до 100");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
            }
    public static int generateNumber(){
        Random random = new Random();
        return random.nextInt(100);
    }
}