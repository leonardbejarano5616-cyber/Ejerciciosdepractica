package EstructuraSecuencial;
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese los grados a celsius");
            double c = sc.nextDouble();
            double f = (double)(c*9/5) + 32;
            double k = (double)c+273.15;
            System.out.println("los grados en kelvil son: " + k + "k");
            System.out.println("los grados en fahrenheit: " + f + "f");
            sc.close();
    }
}
