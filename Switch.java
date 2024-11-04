import java.util.Scanner;
public class Switch {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Entre com um numero: ");
		numero = leia.nextInt();
		
		switch (numero){
			case 26:
			System.out.println("VINTE E SEIS");
			break;
			
			case 1:
			System.out.println("UM");
			break;
			
			case 8:
			System.out.println("OITO");
			
			default:
			System.out.println("Outro numero");
		}
		
	}
}

