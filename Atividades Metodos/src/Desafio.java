import java.util.Scanner;

public class Desafio {
	public static void fib() {
		int n1 = 1, n2 =0;
		int n, i = 0, num=0 ;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite quantos termos devem ser mostrados:");
		n = ler.nextInt();
		while (i < n) {
			System.out.println("A sequencia de fibonacci eh: " + num);
			num = n1 + n2;
			n2 = n1;
			n1 = num;
			i++;
		}
	}

	public static void main(String[] args) {
		fib();
	}

}
