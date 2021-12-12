package exercicios;

import java.util.Scanner;

public class Media {
	
	@SuppressWarnings({ "resource" })
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double uni1, uni2, uni3, uni4;
		String name;
		
		System.out.printf("Insira o nome do aluno: ");
		name = ler.next();
		
		System.out.printf("Digite a nota da primeira unidade: ");
		uni1 = ler.nextDouble();
		
		System.out.printf("Digite a nota da segunda unidade: ");
		uni2 = ler.nextDouble();
		
		System.out.printf("Digite a nota da terceira unidade: ");
		uni3 = ler.nextDouble();
		
		System.out.printf("Digite a nota da quarta unidade: ");
		uni4 = ler.nextDouble();
		
		double quaseoresultadofinal = (uni1 + uni2 + uni3 + uni4);
		double mediafinal = quaseoresultadofinal / 4;
		
		System.out.println("\nA media final do aluno(a) " + name + " foi: " + mediafinal);
	}
}