package icc.primitivos;

public class Prueba {

    public static void main(String[] args) {

 System.out.println("parte 1 de la practica");

 
	int max = Integer.MAX_VALUE;
	++max;
	
		System.out.println("Decimal  " + max);
       		 System.out.println("Binario " + Integer.toBinaryString(max)); // https://www.geeksforgeeks.org/java-lang-integer-tobinarystring-method/ (use esta pagina)


	
 System.out.println("parte 2 de la practica");


	double nan = Double.NaN;
	  	System.out.println(nan); 
	double minf = Double.NEGATIVE_INFINITY;
	        System.out.println(minf);
	double pinf = Double.POSITIVE_INFINITY;
		System.out.println(pinf);
	double cero = 0.0;
		System.out.println(cero);
	double mcero = -0.0;
		System.out.println(mcero);

	
	ImpresoraBinario p;
	    p = new ImpresoraBinario();
	
	        p.imprime(nan);
		p.imprime(minf);
		p.imprime(pinf);
		p.imprime(cero);
		p.imprime(mcero);

System.out.println("parte 3 de la practica");


short permisos = 0754;

System.out.println("permisos en binario es " + Integer.toBinaryString(permisos));
System.out.println("permisos en base 10 es  " + permisos);	
	

System.out.println("parte 4");

int permisos2 = (int) permisos << 1;

  p.imprime(permisos2);

permisos2 = (int) permisos << 3;

  p.imprime(permisos2);

permisos2 = (int) permisos >> 1;

  p.imprime(permisos2);

permisos2 = (int) permisos >> 3;

  p.imprime(permisos2);

permisos2 = (int) permisos >>> 1;

  p.imprime(permisos2);

permisos2 = (int) permisos >>> 1;

System.out.println("permisos en binario es " + Integer.toBinaryString(permisos2));

permisos2 = (int) permisos >> 1;

System.out.println("permisos en binario es " + Integer.toBinaryString(permisos2));


  //permisos2 = (int) permisos <<< 1; no hay triple a la izquierda



System.out.println("parte 5");

permisos = 0776;


p.imprime(permisos);

System.out.println("permisos en binario es " + Integer.toBinaryString(permisos));
System.out.println("permisos en base 10 es  " + permisos);	


    }
 
}
