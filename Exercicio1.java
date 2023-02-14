
import java.util.Scanner;

public class Exercicio1 {

	static Scanner scan = new Scanner(System.in);
	public static final int N = 4;

	public static void main(String[] args) {

		int rm[] = new int[N];
		double nota1[] = new double[N];
		double nota2[] = new double[N];
		int aprovados[] = new int[N];
		
		
		int y = entradaDados(rm, nota1, nota2);
		double media[] = calculaMedia(nota1, nota2, y);
		for (int i = 0; i < y; i++) {
			System.out.println("RM: " + rm[i] + "\t Media: " + media[i]);
		}

		geraListaAprovados(media,aprovados,rm, y);

	}//

	public static int entradaDados(int[] rm, double[] nota1, double[] nota2) {
		int aux = 0;
		int y = 0;
		System.out.println("Digite um número negativo para sair ou o RM do aluno  : " + (y + 1) + ":");
		aux = scan.nextInt();
		while (aux > 0 && y < N) {
			rm[y] = aux;
			System.out.println("Digite a primeira nota do aluno " + (y + 1) + ":");
			nota1[y] = scan.nextInt();

			System.out.println("Digite a segunda nota do aluno " + (y + 1) + ":");
			nota2[y] = scan.nextInt();
			y++;
			if (y == N) {
				break;
			}
			System.out.println("Digite um número negativo para sair ou o RM do aluno  : " + (y + 1) + ":");
			aux = scan.nextInt();
		}
		scan.close();
		return y;

	}// end

	public static double[] calculaMedia(double[] nota1, double[] nota2, int y) {
		double media[] = new double[N];

		for (int i = 0; i < y; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		return media;
	}

	public static void geraListaAprovados(double[] media, int[] aprovados, int[] rm, int y) {
		int nAp = 0;
		for (int i = 0; i < y; i++) {
			if (media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		for (int i = 0; i < nAp; i++) {
			System.out.println(aprovados[i]);

		}
	}
}
