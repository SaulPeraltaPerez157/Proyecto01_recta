import Recta.recta;
import java.util.Scanner;

public class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la pendiente de la recta");
		int m = sc.nextInt();
		System.out.println("Ingrese la ordenada al origen de la recta");
		int b = sc.nextInt();
		recta R1 = new recta(m,b);
		System.out.println("Esto funciona");
		System.out.println("Pendiente de la recta R1: " + R1.getm());
		System.out.println("Ordenada al origen de la recta R1: " + R1.getb());
		R1.tabla_positivo(1,4);
		System.out.println("Angulo respecto al eje x: " + R1.angulo_grados());
	}
}
