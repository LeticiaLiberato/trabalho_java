import java.util.Scanner;

public class questao_1 {
	public static void main(String[] args) {
		
		System.out.println("digite o valor do raio");
		Scanner scan = new Scanner (System.in);

		double r = scan.nextFloat();
		double a = Math.PI * r * r;

		System.out.println("o valor da área é: "+ a);

	}
	
}
