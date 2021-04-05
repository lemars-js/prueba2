package icc.primitivos;

public class PruebasPrimitivos {

    public static void main(String[] args) {

	System.out.println("Ejercicio 1");

       	int entero = 456;
 	long enterobig = (long) entero;
	float decimal = (float) entero;
	double decimalbig = (double) entero;

	ImpresoraBinario ej;
	ej = new ImpresoraBinario();

	ej.imprime(entero);
	System.out.println(entero);
       	ej.imprime(enterobig);
	System.out.println(enterobig);
	ej.imprime(decimal);
	System.out.println(decimal);
	ej.imprime(decimalbig);
	System.out.println(decimalbig);

	System.out.println("Ejercicio 2");

       	entero = -456;
 	enterobig = (long) entero;
	decimal = (float) entero;
	decimalbig = (double) entero;

	ImpresoraBinario ej2;
	ej2 = new ImpresoraBinario();

	ej2.imprime(entero);
	System.out.println(entero);
       	ej2.imprime(enterobig);
	System.out.println(enterobig);
	ej2.imprime(decimal);
	System.out.println(decimal);
	ej2.imprime(decimalbig);
	System.out.println(decimalbig);

    }

}
