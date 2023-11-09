import java.util.Scanner;

import exceptions.ErroNumeroNegativo;

public class Application {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;

        while (loop) { 
            try {
                System.out.print("Por favor, insira o seu peso(kg): ");
                String s1 = sc.nextLine();

                if (s1.contains("-")) {
                    throw new ErroNumeroNegativo("Por favor, insira apenas valores positivos!");
                }

                String[] aux1 = s1.split(" ");
                Double peso = Double.parseDouble(aux1[0].replace(",", "."));
                
                System.out.print("Por favor, insira a sua altura(m): ");
                String s2 = sc.nextLine();

                if (s2.contains("-")) {
                    throw new ErroNumeroNegativo("Por favor, insira apenas valores positivos!");
                }

                String[] aux2 = s2.split(" ");
                Double altura = Double.parseDouble(aux2[0].replace(",", "."));

                Pessoa pessoa = new Pessoa(peso, altura);
                System.out.printf("Seu imc é: %.2f", pessoa.calcularIMC());
                loop = false;
            }
            catch (ErroNumeroNegativo e) {
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException e) {
                System.out.println("Por favor, insira um valor válido!!");
            }
        }
        sc.close();
    }
}