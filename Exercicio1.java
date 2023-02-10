import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	static Scanner scan = new Scanner(System.in);
	 

 	public static void main(String[] args) {

		int rm[] = new int[10];
		double nota1[] = new double[10];
		double nota2[] = new double[10];
		int aprovados[] = new int[10];

		entradaDados(rm, nota1, nota2);
		double media[] = calculaMedia(nota1, nota2);
		geraListaAprovados(media, rm, aprovados);

	}//

	public static void entradaDados(int[] rm, double[] nota1, double[] nota2) {
		
		 Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o RM do aluno " + (i + 1) + ":");
			rm[i] = random.nextInt(1000);
			if (rm[i] < 0) {
				break;
			}

			System.out.println("Digite a primeira nota do aluno " + (i + 1) + ":");
			nota1[i] = random.nextInt(11);

			System.out.println("Digite a segunda nota do aluno " + (i + 1) + ":");
			nota2[i] = random.nextInt(11);
		}
	}

	public static double[] calculaMedia(double[] nota1, double[] nota2) {
		double media[] = new double[10];

		for (int i = 0; i < 10; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		return media;
	}

	public static void geraListaAprovados(double[] media, int[] aprovados, int[] rm) {
		for (int i = 0; i < 10; i++) {
			if (media[i] > 5) {
				aprovados[i] = rm[i];
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(aprovados[i]);

		}
	}
}
