
import java.util.Scanner;

/**Es el lugar en el que se desarrollan todos los metodos creados por el equipo de trabajo
 * @author Gualoto.Erick,Gualpa.Nayeli,Guaman.Jonathan,Guanochanga.David,Hernandez.Lizeth,Zambrano.Jhojan
 * @version 1.0
 */
public class App {
	public static void main(String[] args) throws Exception {
		//variables
		Scanner ingresoDatos = new Scanner(System.in);
		int numRepNum=0;
		int numRepCar=0;
		int numRepFig=0;
		String tipoCaracter;
		Boolean banderaRep;
		//Declaracion
		GuamanJonathan gj = new GuamanJonathan();
		//Operaciones
		System.out.println("________________________________________Grupo3________________________________________");
		System.out.println("Gualoto.Erick");
		System.out.println("Gualpa.Nayeli");
		System.out.println("Guaman.Jonathan");
		System.out.println("Guanochanga.David");
		System.out.println("Hernandez.Lizeth");
		System.out.println("Zambrano.Jhojan");
		System.out.println();
		System.out.println("|1| Indique el numero de repeticiones de las series numéricas");
		do {
			try {
				numRepNum=Integer.parseInt(ingresoDatos.nextLine());
				banderaRep=false;
			} catch (NumberFormatException e){
				System.out.println("Por favor Ingrese UN NUMERO");
				banderaRep=true;
			}
		}while(banderaRep);
		System.out.println("|2| Indique el numero de repeticiones de las series de caracteres");
		do {
			try {
				numRepCar=Integer.parseInt(ingresoDatos.nextLine());
				banderaRep=false;
			} catch (NumberFormatException e){
				System.out.println("Por favor Ingrese UN NUMERO");
				banderaRep=true;
			}
		}while(banderaRep);
		System.out.println("|3| Indique el caracter a usar en las series de caracteres (solo uno)");
		tipoCaracter=ingresoDatos.nextLine();
		while(tipoCaracter.length()!=1) {
			System.out.println("SOLO UNO");
			tipoCaracter=ingresoDatos.nextLine();
		}
		System.out.println("|4| Indique el numero de repeticiones de las series de figuras");
		do {
			try {
				numRepFig=Integer.parseInt(ingresoDatos.nextLine());
				banderaRep=false;
			} catch (NumberFormatException e){
				System.out.println("Por favor Ingrese UN NUMERO");
				banderaRep=true;
			}
		}while(banderaRep);
		//Series numéricas
		System.out.println("________________________________________Series Numéricas________________________________________________________________________________");
		System.out.println();
		System.out.print("SN1: ");
		gj.jgSN1(numRepNum);
		System.out.println();
		System.out.print("SN2: ");
		gj.jgSN2(numRepNum);
		System.out.println();
		System.out.print("SN3: ");
		System.out.println();
		System.out.print("SN4: ");
		System.out.println();
		System.out.print("SN5: ");
		System.out.println();
		System.out.print("SN6: ");
		System.out.println();
		System.out.print("SN7: ");
		System.out.println();
		System.out.print("SN8: ");
		System.out.println();
		System.out.print("SN9: ");
		System.out.println();
		System.out.print("SN10: ");
		System.out.println();
		System.out.print("SN12: ");
		//Series de caracteres
		System.out.println();
		System.out.println("________________________________________Series de caracteres________________________________________________________________________________");
		System.out.println();
		System.out.print("SC1: ");
		gj.jgSC1(numRepCar,tipoCaracter);
		System.out.println();
		System.out.print("SC2: ");
		System.out.println();
		System.out.print("SC3: ");
		System.out.println();
		System.out.print("SC4: ");
		System.out.println();
		System.out.print("SC5: ");
		System.out.println();
		System.out.print("SC6: ");
		System.out.println();
		System.out.print("SC7: ");
		System.out.println();
		System.out.print("SC8: ");
		System.out.println();
		System.out.print("SC9: ");
		//Series de Figuras
		System.out.println();
		System.out.println("________________________________________Series de figuras________________________________________________________________________________");
		System.out.println();
		System.out.println("F1:");
		gj.jgF1(numRepFig);
		System.out.println();
		System.out.println("F2:");
		System.out.println();
		System.out.println("F3:");
		System.out.println();
		System.out.println("F4: ");
		System.out.println();
		System.out.println("F5: ");
		System.out.println();
		System.out.println("F6: ");
		System.out.println();
		System.out.println("F7: ");
		gj.jgF7(numRepFig);
		System.out.println();
		System.out.println("F8: ");
		System.out.println();
		System.out.println("F9: ");
		System.out.println();
		System.out.println("F10: ");
		System.out.println();
		System.out.println("F11: ");
		System.out.println();
		System.out.println("F12: ");
		System.out.println();
		System.out.println("F13: ");
		gj.jgF13(numRepFig);
		System.out.println();
		System.out.println("F14: ");
		System.out.println();
		System.out.println("F15: ");
		System.out.println();
		System.out.println("F16: ");
		System.out.println();
		System.out.println("F17: ");
		System.out.println();
		System.out.println("F18: ");
		System.out.println();
		System.out.println("F19: ");
		gj.jgF19(numRepFig);
		ingresoDatos.close();
	}
}