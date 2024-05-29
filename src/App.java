
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
		char unCaracter;
		String tipoCaracter;
		Boolean banderaRep;
		//Declaracion
		GuamanJonathan gj = new GuamanJonathan();
		GualotoErick ge = new GualotoErick();
		GualpaNayeli gn = new GualpaNayeli();
		DavidGuanochanga gd = new DavidGuanochanga();
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
				do{
					System.out.println("Ingrese un numero mayor o igual a 0");
					numRepNum=Integer.parseInt(ingresoDatos.nextLine());
					banderaRep=false;
				}while(numRepNum<0);
			} catch (NumberFormatException e){
				System.out.println("Por favor Ingrese UN NUMERO");
				banderaRep=true;
			}
		}while(banderaRep);
		System.out.println("|2| Indique el numero de repeticiones de las series de caracteres");
		do {
			try {
				do{
					System.out.println("Ingrese un numero mayor o igual a 0");
					numRepCar=Integer.parseInt(ingresoDatos.nextLine());
					banderaRep=false;
				}while(numRepCar<0);
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
				do{
					System.out.println("Ingrese un numero mayor o igual a 0");
					numRepFig=Integer.parseInt(ingresoDatos.nextLine());
					banderaRep=false;
				}while(numRepFig<0);
			} catch (NumberFormatException e){
				System.out.println("Por favor Ingrese UN NUMERO");
				banderaRep=true;
			}
		}while(banderaRep);
		unCaracter=tipoCaracter.charAt(0);
		//Series numéricas
		System.out.println("________________________________________Series Numéricas________________________________________________________________________________");
		System.out.println();
		System.out.print("SN1: ");
		gj.gjSN1(numRepNum);
		System.out.println();
		System.out.print("SN2: ");
		gj.gjSN2(numRepNum);
		System.out.println();
		System.out.print("SN3: ");
		ge.geSN3(numRepNum);
		System.out.println();
		System.out.print("SN4: ");
		System.out.println();
		System.out.print("SN5: ");
		gn.gnSN5(numRepNum);
		System.out.println();
		System.out.print("SN6: ");
		gd.dgSN6(numRepNum);
		System.out.println();
		System.out.print("SN7: ");
		System.out.println();
		System.out.print("SN8: ");
		System.out.println();
		System.out.print("SN9: ");
		ge.geSN9(numRepNum);
		System.out.println();
		System.out.print("SN10: ");
		System.out.println();
		System.out.print("SN12: ");
		gn.gnSN12(numRepNum);
		//Series de caracteres
		System.out.println();
		System.out.println("________________________________________Series de caracteres________________________________________________________________________________");
		System.out.println();
		System.out.print("SC1: ");
		gj.gjSC1(numRepCar,tipoCaracter);
		System.out.println();
		System.out.print("SC2: ");
		ge.geSC2(numRepCar, tipoCaracter);
		System.out.println();
		System.out.print("SC3: ");
		System.out.println();
		System.out.print("SC4: ");
		gn.gnSC4(numRepCar, unCaracter);
		System.out.println();
		System.out.print("SC5: ");
		gd.dgSC5(numRepCar);
		System.out.println();
		System.out.print("SC6: ");
		System.out.println();
		System.out.print("SC7: ");
		gn.gnSC7(numRepCar, unCaracter);
		System.out.println();
		System.out.print("SC8: ");
		gd.dgSC8(numRepCar);
		System.out.println();
		System.out.print("SC9: ");
		//Series de Figuras
		System.out.println();
		System.out.println("________________________________________Series de figuras________________________________________________________________________________");
		System.out.println();
		System.out.println("F1:");
		gj.gjF1(numRepFig);
		System.out.println();
		System.out.println("F2:");
		ge.geF2(numRepFig, tipoCaracter);
		System.out.println();
		System.out.println("F3:");
		System.out.println();
		System.out.println("F4: ");
		gn.gnSF4(numRepFig, unCaracter);
		System.out.println();
		System.out.println("F5: ");
		gd.dgSF5(numRepFig);
		System.out.println();
		System.out.println("F6: ");
		System.out.println();
		System.out.println("F7: ");
		gj.gjF7(numRepFig);
		System.out.println();
		System.out.println("F8: ");
		ge.geF8(numRepFig);
		System.out.println();
		System.out.println("F9: ");
		System.out.println();
		System.out.println("F10: ");
		gn.gnSF10(numRepFig);
		System.out.println();
		System.out.println("F11: ");
		gd.dgSF11(numRepFig);
		System.out.println();
		System.out.println("F12: ");
		System.out.println();
		System.out.println("F13: ");
		gj.gjF13(numRepFig);
		System.out.println();
		System.out.println("F14: ");
		ge.geF14(numRepFig);
		System.out.println();
		System.out.println("F15: ");
		System.out.println();
		System.out.println("F16: ");
		gn.gnSF16(numRepFig);
		System.out.println();
		System.out.println("F17: ");
		gd.dgSF17(numRepFig);
		System.out.println();
		System.out.println("F18: ");
		System.out.println();
		System.out.println("F19: ");
		gj.gjF19(numRepFig);
		ingresoDatos.close();
	}
}