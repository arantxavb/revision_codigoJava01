package com.generation;
//importe la clase
import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//mostarmos la pregunta en consola
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
//consumimos la respuesta y el salto de linea con nextLinea()
		String jugador1 = sc.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String jugador2 = sc.nextLine();

// podemos agregar toLowerCase() para evitar si el usuario hace cosas de usuario jaja 
		if (jugador1.toLowerCase().equals(jugador2.toLowerCase())) {
			System.out.println("Empate");
/*
 * usaremos switch para cada caso del jugador 1 
 * dentro de cada caso solocaremos if-else if 
 * con las opciones del jugador 2 que no arrojan empate
 * 
 */
			
		} else {
			int ganador = 0;

			switch (jugador1) {

			case "piedra":
				if (jugador2.equals("tijeras")) {
					ganador = 1;
				} else if (jugador2.equals("papel")) {
					ganador = 2;
				}
				break;

			case "papel":
				if (jugador2.equals("piedra")) {
					ganador = 1;
				} else if (jugador2.equals("tijeras")) {
					ganador = 2;
				}
				break;

			case "tijera":

				if (jugador2.equals("papel")) {
					ganador = 1;
				} else if (jugador2.equals("piedra")) {
					ganador = 2;
				}
				break;

			default:
			}
			System.out.println("Gana el jugador " + ganador);

		}
		//buena pratica: cerrar la clase = liberar el recurso
		sc.close();
	
	}
	
	

}
