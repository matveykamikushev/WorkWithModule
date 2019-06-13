import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner module = new Scanner(System.in);
        System.out.println("Введите x в модуле...");
        double modulex = module.nextDouble();
        System.out.println("Введите x...");
        Scanner x2 = new Scanner(System.in);
        double x = x2.nextDouble();
        Double result = Math.abs(modulex)+5.0*x;
        System.out.println(result);
    }
}
