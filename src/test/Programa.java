package test;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ListaLigada lista = new ListaLigada();

                lista.IngresarNuevo(2);
                lista.IngresarNuevo(3);
                
                
                Nodo actual = lista.MostrarListado();
		while (actual != null) {
                    System.out.println(actual.GetNumero());
                    actual = lista.MostrarListado();
		}
		System.out.println("");
		leer.close();
	}
}
