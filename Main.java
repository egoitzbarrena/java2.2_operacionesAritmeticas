import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el area y la circunferencia de un circulo 
 */
public class Main {

	public static void main (String args[]) {

		double radio, result, resultadoArea, resultadoCircunferencia ;
		Circulo circulo = new Circulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el radio del circulo: ");
		radio = sc.nextDouble();
		circulo.setRadio(radio);

		resultadoArea = circulo.area();

		System.out.println("\nEl AREA del circulo es: " + resultadoArea);

		resultadoCircunferencia = circulo.circunferencia();
		
		System.out.println("\nLa circunferencia del circulo es: " + resultadoCircunferencia);

	}
}
