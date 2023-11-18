package Recta;
import java.lang.Math;

public class recta{
	private double m;
	private double b;
	public recta(double m, double b){
		this.m = m;
		this.b = b;
	}

	public double getm(){
		return this.m;
	}

	public double getb(){
		return this.b;
	}

	public void tabla_positivo(int value_i, int value_f){
		if(value_i <= 0){
			System.out.println("Ingrese un valor mayor a 0");
		}
		else{
			System.out.println("----X---- |---- Y ----");
			for(int i=value_i; i<value_f;i++){
				System.out.print(i + "                ");
				System.out.println((m*i)+b);
			}
		}
	}

	public double angulo_grados(){
		return (Math.atan(this.m))*(180/Math.PI);
	}
}

