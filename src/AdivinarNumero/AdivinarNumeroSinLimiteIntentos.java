package AdivinarNumero;

import java.util.Scanner;

public class AdivinarNumeroSinLimiteIntentos {
	public static void main(String[] args) {
		//INICIALIZAMOS EL SCANNER
		Scanner s= new Scanner (System.in);
		
		//DECLARAMOS VARIABLES
		int numero;
		int numeroAdivinar;
		
		//DAMOS VALOR AL NUMERO QUE TENEMOS QUE ADIVINAR	
		numeroAdivinar=(int) (Math.random()*101);
		
		//ADIVINAR UN NUMERO DEL 0 AL 100
		 System.out.println("TIENES QUE ADIVINAR UN NÚMERO QUE ESTÁ ENTRE EL 0 Y EL 100");
		 
		 
		 //HACEMOS EL BUCLE
		 
		 do
		 {
			 //DAMOS EL NÚMERO POR TECLADO
			 System.out.print("Introduce un número: ");
			 numero= Integer.parseInt(s.nextLine());
			 
			 //RESPUESTA DEL PROGRAMA
			 if (numero<numeroAdivinar)
				 System.out.println("EL NÚMERO INTRODUCIDO ES MENOR");
			 else if (numero>numeroAdivinar)
				 System.out.println("EL NÚMERO INTRODUCIDO ES MAYOR");
			 else
				 System.out.println("HAS ACERTADO");
			 
		 } while (numero!=numeroAdivinar);
		 
		 System.out.println("PROGRAMA TERMINADO");
		 
		 s.close();
	}
}
