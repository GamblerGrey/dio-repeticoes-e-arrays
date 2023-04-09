package exercicio;

import java.util.Scanner;

public class ex3 {
    

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int numero = 0;
            int soma = 0;
            int count =0; 
            int maior = 0;

            do{
                System.out.println("Numero: ");
                numero = scan.nextInt();
                
                soma = soma + numero;
                if(numero > maior) maior = numero;

                count = count + 1;
            }while(count < 5);

            System.out.println("Maior: " + maior);
            System.out.println("Média: " + soma/count); 
            // fiz uma alteração do código para ficar mais fácil de adaptar para outras situações//
            // Ao inves de 5 coloquei count//    
        }
    }




}
