package ListaLigadaSimple;

public class Nodo {
    private Estudiante alumno;
    private Nodo liga;

    //Constructor
    public Nodo(Estudiante alumno) {
        this.alumno = alumno;
        this.liga = null;
    }
        
    //Getter y Setter de Nodo
    public Estudiante getAlumno() {
        return alumno;
    }
    public void setAlumno(Estudiante alumno) {
        this.alumno = alumno;
    }
    public Nodo getLiga() {
    	return liga;
    }
    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

}