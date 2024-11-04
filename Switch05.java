import java.util.Scanner;
public class Switch05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String vogal;
		
		System.out.println("Entre com uma vogal: ");
		vogal = leia.nextLine();
		
		char v = vogal.charAt(0)                                                                                                                                                                                                                                                                                                                               ;
		
		switch (v){
			case 'a':
			System.out.println("letra \'a\'");
			break;
			
			case 'e':
			System.out.println("letra \'e\'");
			break;
			
			case 'i':
			System.out.println("letra \'i\'");
			break;
			
			case 'o':
			System.out.println("letra \'o\'");
			break;
			
			case 'u':
			System.out.println("letra \'u\'");
			break;
			
			default:
			System.out.println("Nao eh uma vogal");
		}
		
	}
}

