package test;

public class ListaLigada {
	private Nodo cab;
        private Nodo actual;

	public ListaLigada() {
		this.cab = null;
	}

	public void IngresarNuevo(int num) {
		Nodo nuevo = new Nodo(num);
		nuevo.AsignaLiga(cab);
		cab = nuevo;
	}

	public Nodo MostrarListado() {
		actual = actual.RetornaLiga();
		return actual;
        }
}

