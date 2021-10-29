package ListaLigadaSimple;

import javax.swing.JOptionPane;

public class Main {
    static int eleccion;
    
    public static void main(String[] args) {

    Estudiante alumno;
    ListaLigada lista = new ListaLigada();
    
        do {
            menu();
            switch (eleccion){
                case 1:
                    alumno = insertarDatos();
                    lista.addNuevo(alumno);
                    JOptionPane.showMessageDialog(null,"Estudiante ingresado.");
                    break;
                case 2:
                    if (lista.listaVacia()) {
                        JOptionPane.showMessageDialog(null,"La lista no tienen datos");
                    } else {
                        listar(lista);
                    }
                    break;
                case 3:
                    if (lista.listaVacia()) {
                        JOptionPane.showMessageDialog(null,"No existen datos para realizar el calculo");
                    } else {
                        matriculaMax(lista);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Hasta pronto!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta");
                    menu();
                break;
            }
        } while (eleccion != 4);

    }
    
    public static void menu() {
        eleccion = Integer.parseInt(JOptionPane.showInputDialog("Por favor inserte el número que corresponda a la acción que desea, luego presione Aceptar\n \n"
        + "1. Crear estudiante.\n"
        + "2. Listar el valor de matricula de cada estudiante.\n"
        + "3. Ver el carnet del estudiante que más paga por la matricula\n"
        + "4. Salir")); 
    }
    
    static void listar(ListaLigada lista) {
        Estudiante alumno = lista.recorrerLista();
        String datos = "";
        int contador = 0;
        while (alumno != null) {
                datos += "\nNúmero de carné: " + alumno.getNumCarne() + "\n" + "Cantidad de creditos: " + alumno.getCantCreditos() + "\n" + "Valor matricula: $ " + alumno.calcularMatricula() + "\n";
                alumno = lista.recorrerLista();
                contador ++;
        }
        if (contador <= 3) {
            JOptionPane.showMessageDialog(null,datos);
        } else {
            JOptionPane.showMessageDialog(null,"La cantidad de alumnos supera la cantidad maxima que se debe mostrar por pantalla por lo que los datos se mostraran por consola");
            System.out.println(datos);
        }
    }
    
    static void matriculaMax(ListaLigada lista) {
        Estudiante alumno = lista.recorrerLista();
        double maxValor = 0;
        String carnet = "";
        while (alumno != null) {
                if (maxValor < alumno.calcularMatricula()) {
                    maxValor = alumno.calcularMatricula();
                    carnet = alumno.getNumCarne();
                }
                alumno = lista.recorrerLista();
        }
        JOptionPane.showMessageDialog(null,"\nEl número de carné del estudiante que más paga por matricula es " + carnet + ", el valor de su matricula es $ " + maxValor + "\n");
    }
    
    static Estudiante insertarDatos() {
        String numCarne;
        double valorCredito;
        int cantCreditos;
        double descuento;
        numCarne = JOptionPane.showInputDialog("\nIngrese el número de carné que corresponde al estudiante:");
        valorCredito = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor que corresponde a un credito del estudiante:"));
        cantCreditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de creditos que va a matricular el estudiante: "));
        descuento = Double.valueOf(JOptionPane.showInputDialog("Ingrese el valor del descuento, especifique el porcentaje, en caso de no tener descuento, ingrese el número 0. (Ejemplo: 15.3):"));
        Estudiante alumno = new Estudiante(numCarne,cantCreditos,valorCredito,descuento);
        return alumno;
    }
}
