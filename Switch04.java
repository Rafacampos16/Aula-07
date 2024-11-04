import java.util.Scanner;
public class Switch04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String mes;
		
		System.out.println("Entre com as 3 primeiras letras do mes: ");
		mes = leia.nextLine();
		
		switch (mes){
			case "fev":
			System.out.println("28 dias");
			break;
			
			case "abr":
			case "jun":
			case "set":
			case "nov":
			System.out.println("30 dias");
			break;
			
			case "jan":
			case "mai":
			case "jul":
			case "ago":
			case "out":
			case "dez":
			System.out.println("31 dias");
			break;
			
			default:
			System.out.println("O mes nao existe");
		}
		
	}
}

