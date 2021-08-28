package treino2;
//Ler (10) numeros somar, mostrar o maior e o menor deles..
import java.util.Scanner;

public class ContadorSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menor = 10000 ;
		int maior = 0;
		int soma = 0;
		int cont = 1;
		while (cont <= 9) {
			System.out.print("Digite o " + cont + "o. Valor: ");
			int n = sc.nextInt();
			if (n > maior) {
				maior = n;
			}
			if (n < menor) {
				menor = n;
			}
			soma = soma + n;
			cont++;

		}
		System.out.println("A soma é: " + soma);
		System.out.println("O maior numero foi: " + maior);
		System.out.println("O menor numero foi: " + menor);

	}

}