public class Calc {

	public static void main(String arg[]) {

		String frase0 = arg[0];
		String frase1 = arg[1];

		System.out.println("\nARG[0]: " + frase0);
		System.out.println("\nARG[1]: " + frase1);

		int x = 40;
		int y = 10;

		ops(x, y);

		float f = 2.97f;
		int   i = (int) f;

		casting(f, i);

	}

	public static void ops(int a, int b) {
	

		System.out.println();
		System.out.println("a adicao de " + a + " e " + b + " e igual a " + (a+b));
		System.out.println("a subtra de " + a + " e " + b + " e igual a " + (a-b));
		System.out.println("a multip de " + a + " e " + b + " e igual a " + (a*b));
		System.out.println("a divisa de " + a + " e " + b + " e igual a " + (a/b));		

	}

	public static void casting(float a, int b) {

		b = (int) a;

		System.out.println();
		System.out.println("float: " + a);
		System.out.println("int..: " + b);		

	}

}
