package test;

public class Nodo {
	int numero;
	Nodo liga;

	public Nodo(int num) {
		this.numero = num;
		this.liga = null;
	}

	public int GetNumero() {
		return numero;
	}

	public void SetNumero(int num) {
		this.numero = num;
	}
        
        
	public void AsignaLiga(Nodo liga) {
		this.liga = liga;
	}

	public Nodo RetornaLiga() {
		return liga;
	}
        
}
