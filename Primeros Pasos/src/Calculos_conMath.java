
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double raiz=Math.sqrt(9);
		
		float num1=5.85F;
		
		int resultado1=Math.round(num1);
		System.out.println(resultado1);
		
		double base=5;
		
		double exponente=3;
		
		int resultado2=(int)Math.pow(base, exponente);
		
		System.out.println("el resultado de "+ base + " elevado a " + exponente + " es " +resultado2);
	}

}
