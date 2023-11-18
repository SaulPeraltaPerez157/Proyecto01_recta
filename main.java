import Recta.recta;
import Perpendicular.Per;
import java.util.Scanner;

public class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la pendiente de la recta");
		double m = sc.nextDouble();
		System.out.println("Ingrese la ordenada al origen de la recta");
		double b = sc.nextDouble();
		recta R1 = new recta(m,b);
		recta R2 = new recta((-1/m),b);
		System.out.println(R1.getm() * R2.getm());
		System.out.println("Esto funciona");
		System.out.println("Pendiente de la recta R1: " + R1.getm());
		System.out.println("Ordenada al origen de la recta R1: " + R1.getb());
		R1.tabla_positivo(1,4);
		System.out.println("Angulo respecto al eje x: " + R1.angulo_grados());
		System.out.println("Son perpendiculares?");
		if (Per.is_perp(R1,R2)==true){
			System.out.println("Si son perpendiculares");
		}
		else{
			System.out.println("No son perpendiculares");
		}
	}
}
