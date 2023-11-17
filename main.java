import Recta.recta;

public class main{
	public static void main(String args[]){
		recta R1 = new recta(1,1);
		System.out.println("Esto funciona");
		System.out.println("Pendiente de la recta R1: " + R1.getm());
		System.out.println("Ordenada al origen de la recta R1: " + R1.getb());
		R1.tabla_positivo(1,4);
	}
}
