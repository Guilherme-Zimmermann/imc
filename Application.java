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
                Double imc = pessoa.calcularIMC();
                System.out.printf("Seu imc é: %.2f%n", imc);
                loop = false;
                
                if (imc < 17) {
                    System.out.println("De acordo com o seu IMC, sua situação é: Muito abaixo do peso");
                }
                if (imc >= 17 && imc < 18.5) {
                    System.out.println("De acordo com o seu IMC, sua situação é: Abaixo do peso");
                }
                if (imc >= 18.5 && imc < 25){
                    System.out.println("De acordo com o seu IMC, sua situação é: Peso normal");
                }
                if (imc >= 25 && imc < 30) {
                    System.out.println("De acordo com o seu IMC, sua situação é: Acima do peso");
                }
                if (imc >= 30 && imc < 35){
                    System.out.println("De acordo com o seu IMC, sua situação é: Obesidade");
                }
                if (imc >= 35 && imc < 40) {
                    System.out.println("De acordo com o seu IMC, sua situação é: Obesidade severa");
                }
                if (imc >= 40) {
                    System.out.println("De acordo com o seu IMC, sua situação é: Obesidade mórbida");
                }

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