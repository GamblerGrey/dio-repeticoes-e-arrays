package exercicio;
import java.util.Scanner;

public class parImpar { // desenvolvi comforme o peguei a ideia com a cami-la//
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int quantNumeros = 0;
        int quantPares = 0, quantImpares = 0;
        int numero = 0;

        System.out.println("Quantidade de números: "  );
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Nuemro: "); 
            numero = scan.nextInt();

            if( numero % 2 == 0) quantPares++;
            else quantImpares++;
            count++;
        }while(count < quantNumeros);

        System.out.println("Quantidade de numeros pares: " + quantPares);
        System.out.println("Quantidade de numeros impares: " + quantImpares);


    }

}
