package desafio;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		String n;
		
		Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite a senha desejada com no m�nimo seis digitos: ");
        n = leia.next();
        
        x = 6 - n.length();
        
        if (n.length()<6)
        {
        	System.out.println("\nVoc� digitou uma senha com menos de seis caracteres.\nAdicione mais " + x + " caracteres.");
        }
        
        System.out.println("\nN�mero m�nimo de caracteres ok.");

	}

}
