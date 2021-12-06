
import java.util.Locale;
import java.util.Scanner;

public class GuardaDadosNoVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite a Quantidade:");
		int n = sc.nextInt();

		// Criando vetor
		String[] nomes = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		// Guardando os dados no vetor
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite os dados  Nome, Idade, Altura");
			nomes[i] = sc.nextLine();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();

		}
		// Tirando a media da altura
		double media = 0;
		for (int i = 0; i < n; i++) {
			media += altura[i] / n;
		}
		System.out.println();
		System.out.printf("Altura média %.2f%n ", media);
		System.out.println();

		// porecentagem de idade
		double cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}

		double porc = cont / n * 100;
		System.out.println("Pessoas com menos de 16 anos:" + porc + "%");
		System.out.println();

		// Todos os dados
		for (int i = 0; i < n; i++) {
			System.out.println("Nome: " + nomes[i] + " Idade: " + idade[i] + " Peso: " + altura[i]);
		}

		sc.close();
	}

}
