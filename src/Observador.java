/**
 * Clase en la que se ejecuta todo lo que ve el observador del proyecto
 */
public class Observador {
/**
 * Seleccionador de de los parametros y ejecución de los metodos
 */
    public void selecionarOpc(){
        int numRepNum=0;
	    int numRepCar=0;
	    int numRepFig=0;
	    char unCaracter;
	    String tipoCaracter;
	    Boolean banderaRep;
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
	    			numRepNum=Integer.parseInt(App.ingresoDatos.nextLine());
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
	    			numRepCar=Integer.parseInt(App.ingresoDatos.nextLine());
	    			banderaRep=false;
	    		}while(numRepCar<0);
	    	} catch (NumberFormatException e){
	    		System.out.println("Por favor Ingrese UN NUMERO");
	    		banderaRep=true;
	    	}
	    }while(banderaRep);
	    System.out.println("|3| Indique el caracter a usar en las series de caracteres (solo uno)");
	    tipoCaracter=App.ingresoDatos.nextLine();
	    while(tipoCaracter.length()!=1) {
	    	System.out.println("SOLO UNO");
	    	tipoCaracter=App.ingresoDatos.nextLine();
	    }
	    System.out.println("|4| Indique el numero de repeticiones de las series de figuras");
	    do {
	    	try {
	    		do{
	    			System.out.println("Ingrese un numero mayor o igual a 0");
	    			numRepFig=Integer.parseInt(App.ingresoDatos.nextLine());
	    			banderaRep=false;
	    		}while(numRepFig<0);
	    	} catch (NumberFormatException e){
	    		System.out.println("Por favor Ingrese UN NUMERO");
	    		banderaRep=true;
	    	}
	    }while(banderaRep);
	    unCaracter=tipoCaracter.charAt(0);
        imprimirEjerPartOne(numRepNum, numRepCar, numRepFig, unCaracter, tipoCaracter);
    }
/**
 * Clase que imprime la primera parte d elos metodos
 * @param numRepNum: numero de repeticiones de las series numericas
 * @param numRepCar: numero de repeticiones de las series de caracteres
 * @param numRepFig: numero de repeticiones de las series de figuras
 * @param unCaracter: tipo de caracter a usar en la serie de caracteres
 * @param tipoCaracter: el primer carctar en forma de string
 */
    private void imprimirEjerPartOne(int numRepNum, int numRepCar, int numRepFig, char unCaracter, String tipoCaracter) {
        //Declaracion
	    GuamanJonathan gj = new GuamanJonathan();
	    GualotoErick ge = new GualotoErick();
	    GualpaNayeli gn = new GualpaNayeli();
	    DavidGuanochanga gd = new DavidGuanochanga();
	    HernandezLizeth lh = new HernandezLizeth();
	    ZambranoJhojan zj = new ZambranoJhojan();
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
		lh.hlSN4(numRepNum);
		System.out.println();
		System.out.print(" ");
		gn.gnSN5(numRepNum);
		System.out.println();
		System.out.print("SN6: ");
		gd.dgSN6(numRepNum);
		System.out.print("SN7: ");
		zj.jzSN7(numRepNum);
		System.out.println();
		System.out.print("SN8: ");
		gj.gjSN8(numRepNum);
		System.out.println();
		System.out.print("SN9: ");
		ge.geSN9(numRepNum);
		System.out.println();
		System.out.print("SN10: ");
		lh.hlSN10(numRepNum);
		System.out.println();
		System.out.print(" ");
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
		lh.hlSC3(numRepCar, tipoCaracter);
		System.out.println();
		System.out.print(" ");
		gn.gnSC4(numRepCar, unCaracter);
		System.out.println();
		System.out.print("SC5: ");
		gd.dgSC5(numRepCar);
		System.out.print("SC6: ");
		zj.jzSC6(numRepCar);
		System.out.println();
		System.out.print(" ");
		gn.gnSC7(numRepCar, unCaracter);
		System.out.println();
		System.out.println();
		System.out.print("SC8: ");
		gd.dgSC8(numRepCar);
		System.out.print("SC9: ");
		zj.jzSC9(numRepCar);
		//Series de Figuras
		System.out.println();
		System.out.println("\n________________________________________Series de figuras________________________________________________________________________________");
		System.out.println();
		System.out.println("F1:");
		gj.gjF1(numRepFig);
		System.out.println();
		System.out.println("F2:");
		ge.geF2(numRepFig, tipoCaracter);
		System.out.println();
		System.out.println("F3:");
		lh.hlF3(numRepFig);
		System.out.println(" ");
		gn.gnSF4(numRepFig, unCaracter);
		System.out.println();
		System.out.println("F5: ");
		gd.dgSF5(numRepFig);
		System.out.println("F6: ");
		zj.jzF6(unCaracter,numRepFig*numRepFig,numRepFig);
		System.out.println();
		System.out.println("F7: ");
		gj.gjF7(numRepFig);
		System.out.println();
		System.out.println("F8: ");
		ge.geF8(numRepFig);
		System.out.println();
		System.out.println("F9: ");
		lh.hlF9(numRepFig);
		System.out.println();
		System.out.println(" ");
		gn.gnSF10(numRepFig);
		System.out.println();
		System.out.println("F11: ");
		gd.dgSF11(numRepFig);
		System.out.println("F12: ");
		zj.jzF12(numRepFig);
		System.out.println();
		System.out.println("F13: ");
		gj.gjF13(numRepFig);
		System.out.println();
		System.out.println("F14: ");
		ge.geF14(numRepFig);
		System.out.println();
		System.out.println("F15: ");
		lh.hlF15(numRepFig);
		System.out.println(" ");
		gn.gnSF16(numRepFig);
		System.out.println();
		System.out.println("F17: ");
		gd.dgSF17(numRepFig);
		System.out.println("F18: ");
		zj.jzF18(numRepFig);
		System.out.println();
		System.out.println("F19: ");
		gj.gjF19(numRepFig);
		App.ingresoDatos.close();
    }
}
