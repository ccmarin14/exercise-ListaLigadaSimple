package ListaLigadaSimple;

public class ListaLigada {
    private Nodo cab;
    private Nodo actual; //Nodo auxiliar para recorrer la lista

    //Constructor
    public ListaLigada() {
    	cab = null;
    }

    public void addNuevo(Estudiante alumno) {
    	Nodo nuevo = new Nodo(alumno);
        nuevo.setLiga(cab);
        cab = nuevo;
        actual = cab;
    }
    
    public boolean listaVacia() {
        if (cab == null) {
            return true;
        } else {
            return false;
        }
    }

    public Estudiante recorrerLista() {
        Estudiante alumno;
        if (actual == null) {
            actual = cab;
            alumno = null;
	    } else { 
            alumno = actual.getAlumno();
            actual = actual.getLiga();
        }
        return alumno;
    }
}
