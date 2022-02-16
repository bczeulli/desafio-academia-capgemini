package desafio;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, x, n2;
		

        Scanner leia = new Scanner(System.in);

        System.out.println("\nEntre com o tamanho da escada: ");
        n = leia.nextInt();
        
        for(x=1; x<=n; x++)
        {
        	n2=n-x;
        	System.out.println(" ".repeat(n2) +"*".repeat(x));
        }

        
	}

}

