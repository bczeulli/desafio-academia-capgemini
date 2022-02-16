package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a string: ");
        String n = leia.next();
		
		Anagrama(n);
		// TODO Auto-generated method stub

	}
	
	public static int Anagrama(String texto) {
		char[] t = texto.toCharArray(); //converte string numa array de caracteres
		
		ArrayList<String> anagramas = new ArrayList<String>(); //cria uma lista de array
		
		
		for (int i = 0; i < t.length; i++) { //percorrer cada um dos caracteres do string
			
			for (int j = 0; j < t.length; j++) { //percorrendo o mesmo array comparando em posições diferentes e armazenando dentra da array anagramas
				if (i!=j) {
					if (t[i] == t[j]) { 
						
						String tIgual = String.valueOf(t[i] + "-" + t[j]);
						if (!anagramas.contains(tIgual)) {
							anagramas.add(tIgual); 
							System.out.println(String.valueOf(t[i] + "-" + t[j]));
						}
						
					}
				}
			}
				
		}		
		
		System.out.println("Quantidade de anagramas " + anagramas.size());
		
		return anagramas.size();
	}

}
