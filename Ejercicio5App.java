/**
	 * 5 - Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
	 * A continuación escribe las instrucciones necesarias para que:
	 * B tome el valor de C
	 * C tome el valor de A
	 * A tome el valor de D
	 * D tome el valor de B
	 * @author Jose Luis Padilla Gonzalez
	 * 07-07-2021
	 */
public class Ejercicio5App {

	public static void main(String[] args) {
		int a=4;
		int b=6;
		int c=1;
		int d=3;
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
		//B toma el valor de C
		b=c;
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
		//C toma el valor de A
		c=a;
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
		//A tome el valor de D
		a=d;
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
		//D tome el valor de B
		d=b;
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
	}

}
