import java.util.Scanner;
public class Pag68ExA {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3, n4, n5;
		
		System.out.print("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		
		System.out.print("Entre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		System.out.print("Entre com o quarto numero: ");
		n4 = leia.nextInt();
		
		System.out.print("Entre com o ultimo numero: ");
		n5 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			System.out.println("N1 eh o maior: " + n1);
		}else {
			if (n2 > n3 && n2 > n4 && n2 > n5) {
			System.out.println("N2 eh o maior: " + n2);
		}else {
			if (n3 > n4 && n3 > n5) {
			System.out.println("N3 eh o maior: " + n3);
		}else {
			if (n4 > n5) {
			System.out.println("N4 eh o maior: " + n4);
		}else{
			System.out.println("N5 eh o maior: " + n5);
					}
				}
			}
		}
		
			if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
			System.out.println("N1 eh o menor: " + n1);
		}else {
			if (n2 < n3 && n2 < n4 && n2 < n5) {
			System.out.println("N2 eh o menor: " + n2);
		}else {
			if (n3 < n4 && n3 < n5) {
			System.out.println("N3 eh o menor: " + n3);
		}else {
			if (n4 < n5) {
			System.out.println("N4 eh o menor: " + n4);
		}else{
			System.out.println("N5 eh o menor: " + n5);
					}
				}
			}
		}
	}
}
