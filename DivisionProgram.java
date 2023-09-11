import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            
            double result = divideNumbers(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static double divideNumbers(double num1, double num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        
        return num1 / num2;
    }
}

