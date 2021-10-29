package ListaLigadaSimple;

public class Estudiante {
    private String numCarne;
    private int cantCreditos;
    private double valorCredito;
    private double descuento;
    
    //Constructor
    public Estudiante(String numCarne, int cantCreditos, double valorCredito, double descuento) {
        this.numCarne = numCarne;
        this.cantCreditos = cantCreditos;
        this.valorCredito = valorCredito;
        this.descuento = descuento;
    }
    
    //Getter y Setter de Estudiante
    public String getNumCarne() {
        return numCarne;
    }
    public void setNumCarne(String numCarne) {
        this.numCarne = numCarne;
    }
    public int getCantCreditos() {
        return cantCreditos;
    }
    public void setCantCreditos(int cantCreditos) {
        this.cantCreditos = cantCreditos;
    }
    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double calcularMatricula() {
       double total;
       total = (cantCreditos * valorCredito) * (1 - (descuento/100));
       return total;
    }
}
