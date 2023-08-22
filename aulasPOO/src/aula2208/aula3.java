package src.aula2208;

public class aula3 {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 5.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.printf("Raiz quadrada de 'x(%.1f)' = %.2f\n", x, A);
		System.out.printf("Raiz quadrada de 'y(%.1f)' = %.2f\n", y, B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); //3^5 ou 35
		B = Math.pow(x, 2.0); //3^2
		C = Math.pow(5.0, 2.0); //5^2
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		A = x + y;
		B = (x * y) + z;
		System.out.printf("X(%.1f) + Y(%.1f) = %.1f\n", x, y, A);
		System.out.printf("(X[%.1f]*Y[%.1f])-Z[%.1f] = %.2f", x, y, z, B);
	}

}
