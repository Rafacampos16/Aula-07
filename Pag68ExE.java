import java.util.Scanner;
public class Pag68ExE {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1;
			
		System.out.print("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		if (n1 % 2 == 0 ){
			System.out.println("\teh par!");
		}else {
			System.out.println("\teh impar!");
		}
	}
}
