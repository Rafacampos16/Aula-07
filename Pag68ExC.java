import java.util.Scanner;
public class Pag68ExC {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3, n4;
			
		System.out.print("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		if (n1 % 2 == 0 && n1 % 3 == 0){
			System.out.println("\teh divisivel por 2 e por 3!");
		}
		
		System.out.print("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		
		if (n2 % 2 == 0 && n2 % 3 == 0){
			System.out.println("\teh divisivel por 2 e por 3!");
		}
		
		
		System.out.print("Entre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		if (n3 % 2 == 0 && n3 % 3 == 0){
			System.out.println("\teh divisivel por 2 e por 3!");
		}
		
		
		System.out.print("Entre com o quarto numero: ");
		n4 = leia.nextInt();
		
		if (n4 % 2 == 0 && n4 % 3 == 0){
			System.out.println("\teh divisivel por 2 e por 3!");
		}
	}
}
