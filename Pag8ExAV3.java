import java.util.Scanner;
public class Pag8ExAV3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, n3, n4, n5, maior, menor;
		
		String nomeDoMaior, nomeDoMenor;
		
		System.out.print("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		maior = menor = n1;
		nomeDoMaior = nomeDoMenor = "N1";
		
		System.out.print("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		
		if(n2 > maior){
			maior = n2; 
			nomeDoMaior = "N2";
		}
		
		if(n2 < menor){
			menor = n2;
			nomeDoMenor = "N2";
		}
		
		System.out.print("Entre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		if(n3 > maior){
			maior = n3;
			nomeDoMaior = "N3";
		}
		
		if(n3 < menor){
			menor = n3;
			nomeDoMenor = "N3";
		}
		
		System.out.print("Entre com o quarto numero: ");
		n4 = leia.nextInt();
		
		if(n4 > maior){
			maior = n4;
			nomeDoMaior = "N4";
		}
		
		if(n4 < menor){
			menor = n4;
			nomeDoMenor = "N4";
		}
		
		System.out.print("Entre com o ultimo numero: ");
		n5 = leia.nextInt();
		
		if(n5 > maior){
			maior = n5;
			nomeDoMaior = "N5";
		}
		
		if(n5 < menor){
			menor = n5;
			nomeDoMenor = "N5";
		}
		
		System.out.println(nomeDoMaior + " eh o maior: " + maior);
		System.out.println(nomeDoMenor + " eh o menor: " + menor);
		
	}
}