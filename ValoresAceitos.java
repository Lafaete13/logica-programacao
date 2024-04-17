import java.util.Scanner;

public class ValoresAceitos {
	public static void main(String[] args) {
		
		double a=0, b=0, c = 0, d=0;
	
		Scanner entrada = new Scanner(System.in);
		
			a = entrada.nextDouble();
			b = entrada.nextDouble();
			c = entrada.nextDouble();
			d = entrada.nextDouble();
		
		entrada.close();
		
		if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
			System.out.println("Valores aceitos");
		    }
		else {
			System.out.println("Valores nao aceitos");
		}
	}
}