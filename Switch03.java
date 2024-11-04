import java.util.Scanner;
public class Switch03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Entre com o numero do mes: ");
		mes = leia.nextInt();
		
		switch (mes){
			case 2:
			System.out.println("28 dias");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:
			System.out.println("30 dias");
			break;
			
			case 1:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			System.out.println("31 dias");
			break;
			
			default:
			System.out.println("O mes nao existe");
		}
		
	}
}

