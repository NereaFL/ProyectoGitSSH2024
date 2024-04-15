package PiedraPapelTijera;

import java.util.Scanner;

public class PiedraPapelTijera {
	public static void main(String[] args) {
		//DECLARAMOS EL SCANNER
		Scanner teclado=new Scanner (System.in);
		
		//DECLARAMOS LAS VARIABKES
		int numeroAleatorio;
		String resultadoOrdenador="";
		String respuestaJugador="";
		int contadorOrdenador=0, contadorJugador=0;
		
		//HACEMOS EL BUCLE FOR
		for (; contadorOrdenador<3 && contadorJugador<3; ) {
			//VAMOS A INTRODUCIR NUESTRA ELECCIÓN POR TECLADO
			System.out.print("Elige que quieres sacar (Piedra, papel o tijera): ");
			respuestaJugador=teclado.nextLine().toUpperCase();
			
			numeroAleatorio=(int) (1+Math.random()*3);
			
			switch (numeroAleatorio)
			{
			case 1:
				resultadoOrdenador="PIEDRA";
				break;
			case 2: 
				resultadoOrdenador="PAPEL";
				break;
			case 3: 
				resultadoOrdenador="TIJERA";
				break;
			}
			/* PIEDRA-PIEDRA EMPATE
			 * TIJERA-TIJERA EMPATE
			 * PAPEL-PAPEL EMPATE
			 * 
			 * 
			 * PIEDRA-TIJERA PUNTO JUGADOR
			 * TIJERA-PAPEL PUNTO JUGADOR
			 * PAPEL-PIEDRA PUNTO JUGADOR
			 * 
			 * TIJERA-PIEDRA PUNTO ORDENADOR
			 * PAPEL-TIJERA PUNTO ORDENADOR
			 * PIEDRA-PAPEL PUNTO ORDENADOR
			 * */
			
			System.out.println("El ordenador ha sacado "+resultadoOrdenador);
			
			if (respuestaJugador.equals(resultadoOrdenador))
			{
				System.out.println("Empate");
				System.out.printf("Contador Jugador %d - Ordenador %d\n" , contadorJugador, contadorOrdenador);
			}
			else if ((respuestaJugador.equals("PIEDRA") && resultadoOrdenador.equals("TIJERA")) ||
					(respuestaJugador.equals("TIJERA") && resultadoOrdenador.equals("PAPEL")) ||
					(respuestaJugador.equals("PAPEL") && resultadoOrdenador.equals("PIEDRA")))
			{
				contadorJugador+=1;
				System.out.printf("Contador Jugador %d - Ordenador %d\n" , contadorJugador, contadorOrdenador);
				
				
			}
			else if ((respuestaJugador.equals("TIJERA") && resultadoOrdenador.equals("PIEDRA")) ||
					(respuestaJugador.equals("PAPEL") && resultadoOrdenador.equals("TIJERA")) ||
					(respuestaJugador.equals("PIEDRA") && resultadoOrdenador.equals("PAPEL")))
			{
				contadorOrdenador+=1;
				System.out.printf("Contador Jugador %d - Ordenador %d\n" , contadorJugador, contadorOrdenador);
				
			}
		
		}
		
		if (contadorJugador>contadorOrdenador)
			System.out.println("HAS GANADO EL JUEGO");
		else
			System.out.println("EL ORDENADOR TE HA GANADO EL JUEGO");
		
		teclado.close();
			
	}
}


