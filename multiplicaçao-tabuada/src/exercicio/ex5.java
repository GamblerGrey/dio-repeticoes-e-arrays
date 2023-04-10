package exercicio;

import java.util.Scanner;

public class ex5 {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
 

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
    
    
    for(int i = 1; i <= 10; i++ ){
        System.out.println(tabuada + " X " + i + " = "  + (tabuada*i));

    }
    
    
    
    
    }

}
