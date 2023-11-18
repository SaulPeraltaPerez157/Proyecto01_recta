package Perpendicular;
import Recta.recta;
public class Per{
	public static boolean is_perp(recta R1, recta R2){
		if((R1.getm() * R2.getm()) == -1.0){
			return true;
		}
		else{
			return false;
		}
	}
}

