
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //variables
        Scanner ingresoDatos = new Scanner(System.in);
        int numRepNum  =0;
        int numRepCar   =0;
        int numRepFig   =0;
        //Declaracion
        GuamanJonathan gj = new GuamanJonathan();
        //Operaciones
        System.out.println("Nombre del Grupo:........................");
        System.out.println("Gualoto.Erick");
        System.out.println("Gualpa.Nayeli");
        System.out.println("Guaman.Jonathan");
        System.out.println("Guanochanga.David");
        System.out.println("Hernandez.Lizeth");
        System.out.println("Zambrano.Jhojan");
        System.out.println();
        System.out.println("Indique el numero de repeticiones de las series numéricas");
        numRepNum=ingresoDatos.nextInt();
        System.out.println("Indique el numero de repeticiones de las series de caracteres");
        numRepCar=ingresoDatos.nextInt();
        System.out.println("Indique el numero de repeticiones de las series de figuras");
        numRepFig=ingresoDatos.nextInt();
        //Series numéricas alo
        System.out.println("Series Numéricas");
        gj.jgSN1(numRepNum);
        //Series de caracteres
        System.out.println("Series de caracteres");
        //Series de Figuras
        System.out.println("Series de figuras");

    }
}
