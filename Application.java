import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;

        while (loop) { 
            try {
                System.out.print("Por favor, insira o seu peso(kg): ");
                String s1 = sc.nextLine();

                String[] aux1 = s1.split(" ");
                Double peso = Double.parseDouble(aux1[0]);
                
                System.out.print("Por favor, insira a sua altura(m): ");
                String s2 = sc.nextLine();

                String[] aux2 = s2.split(" ");
                Double altura = Double.parseDouble(aux2[0]);

                Pessoa pessoa = new Pessoa(peso, altura);
                System.out.printf("Seu imc é: %.2f", pessoa.calcularIMC());
                loop = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido!");
                sc.nextLine();
            }
            catch (NumberFormatException e) {
                System.out.println("Por favor, utilize '.' ao invés de ','!");
            }
        }
        sc.close();
    }
}