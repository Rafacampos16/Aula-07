import java.util.Scanner;
public class Switch02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Entre com o numero do mes: ");
		mes = leia.nextInt();
		
		switch (mes){
			case 1:
			System.out.println("31 dias");
			break;
			
			case 2:
			System.out.println("28 dias");
			break;
			
			case 3:
			System.out.println("31 dias");
			break;
			
			case 4:
			System.out.println("30 dias");
			break;
			
			case 5:
			System.out.println("31 dias");
			break;
			
			case 6:
			System.out.println("30 dias");
			break;
			
			case 7:
			System.out.println("31 dias");
			break;
			
			case 8:
			System.out.println("31 dias");
			break;
			
			case 9:
			System.out.println("30 dias");
			break;
			
			case 10:
			System.out.println("31 dias");
			break;
			
			case 11:
			System.out.println("30 dias");
			break;
			
			case 12:
			System.out.println("31 dias");
			break;
			
			default:
			System.out.println("O mes nao existe");
		}
		
	}
}

