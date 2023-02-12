/*
 Crie um algoritmo usando DoWhile que solicite ao usuário a entrada de N números inteiros e mostre na tela se
este número é positivo ou negativo e só encerre o programa quando o usuário digitar o número 0.
 */

package QuestionFive;

import java.util.Locale;
import java.util.Scanner;

public class QuestionFive {

	public static int numero;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		do{System.out.print("Digitite um número inteiro (Digite 0 para encerrar): ");
		numero = sc.nextInt();
		if(numero == 0) {
			System.out.println("Programa Encerrado!");
			break;
		}
		if(numero > 0) {
			System.out.print("O número" + numero + "é positivo.\n\n");
		}
		else {
			System.out.print("O número" + numero + "é negativo.\n\n");
		}
		}
		while(numero != 0);
	}

}