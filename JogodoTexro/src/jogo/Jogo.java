package jogo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
	
		System.out.println("Você está em uma casa na floresta...");
		System.out.println("Escolha uma direção(w,d,s,a):");
		
		try (Scanner scan = new Scanner(System.in)) {
			String op=scan.nextLine();
			 
			do {
				
				op = scan.nextLine();
				
				if(op.equals("d")) {
				       System.out.println("parede! voce bateu a cabeça e morreu!");
				  }
				 else if(op.equals("s")) {
				       System.out.println("lobos selvagens! voce foi devorado!");
			  }
				 else if(op.equals("a")) {
				       System.out.println("cuidado, monstro! você foi devorado!");
				  }
				 else if(op.equals("w")) {
				       System.out.println(" você encontrou a saída! Parábens");
				 }
			}while(!op.equals("w"));
		}
	}

}
