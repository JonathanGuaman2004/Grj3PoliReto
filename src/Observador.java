/**
 * Clase en la que se ejecuta todo lo que ve el observador del proyecto
 */
public class Observador {
	
	private String fraseAyuda;
	private char unCaracter;
	private String tipoCaracter;
	/**
	 * Seleccionador de de los parametros y ejecución de los metodos
	 */
	public void selecionarOpc(){
		int numRepNum=0;
		int numRepCar=0;
		int numRepFig=0;
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
		numRepNum = verificarIngreso(numRepNum);
		System.out.println("|2| Indique el numero de repeticiones de las series de caracteres");
		numRepCar = verificarIngreso(numRepCar);
		System.out.println("|3| Indique el caracter a usar en las series de caracteres (solo uno)");
		tipoCaracter=App.ingresoDatos.nextLine();
		while(tipoCaracter.length()!=1) {
			System.out.println("SOLO UNO");
			tipoCaracter=App.ingresoDatos.nextLine();
		}
		System.out.println("|4| Indique el numero de repeticiones de las series de figuras");
		numRepFig = verificarIngreso(numRepFig);
		unCaracter=tipoCaracter.charAt(0);
		imprimirEjerPartOne(numRepNum, numRepCar, numRepFig, unCaracter, tipoCaracter);
	}
		/**
		 * Metodo que imprime l parte 2 de los poliretos
		 */
	public void imprimirEjerPartTwo() {
		// Declaracion
		GuamanJonathanPrt2 gjp2=new GuamanJonathanPrt2();
		DavidGuanochangaPrt2 gdp2=new DavidGuanochangaPrt2();
		GualotoErickPrt2 gep2=new GualotoErickPrt2();
		//operaciones
		System.out.println("________________________________________Cadenas de caracteres________________________________________________________________________________");
		System.out.print("\nC01: ");
		gjp2.gjCC1();
		System.out.print("\nC02: ");
		System.out.println("A continuación ingrese una frase para contar las letras");
        fraseAyuda=(App.ingresoDatos.nextLine());
        System.out.println("Usted ingreso la frase: "+fraseAyuda);
		gdp2.dgC02(null);
		System.out.print("\nC03: ");
		gep2.geCC3();
		System.out.print("\nC04: ");
		System.out.print("\nC05: ");
		System.out.print("\nC06: ");
		System.out.print("\nC07: ");
		gjp2.gjCC7();
		System.out.print("\nC08: ");
		gdp2.dgC08();
		System.out.print("\nC09: ");
		gep2.geCC9();
		System.out.println("________________________________________Arrays________________________________________________________________________________");
		System.out.print("\nA01: ");
		System.out.print("\nA02: ");
		System.out.print("\nA03: ");
		System.out.print("\nA04: ");
		gjp2.gjArr4();
		System.out.print("\nA05: ");
		gdp2.dgA05();
		System.out.println("________________________________________Loading________________________________________________________________________________");
		System.out.println("\nL01: ");
		gep2.geLoad1();
		System.out.print("\nL02: ");
		System.out.print("\nL03: ");
		System.out.println("\nL04: ");
		System.out.println("\nL05: ");
		gjp2.gjLoad5();
		System.out.print("\nL06: ");
		gdp2.dgL06();
		System.out.print("\nL07: ");
		gep2.geLoad7();
		System.out.print("\nL08: ");
		System.out.print("\nL09: ");
		System.out.print("\nL10: ");
		System.out.print("\nL11: ");
		gjp2.gjLoad11();
		System.out.print("\nL12: ");
		gdp2.dgL12();
		System.out.println("________________________________________Recursion________________________________________________________________________________");
		System.out.print("\nR01: ");
		gep2.geRec1();
		System.out.print("\nR02: ");
		System.out.print("\nR03: ");
		System.out.print("\nR04: ");
		System.out.print("\nR05: ");
		gjp2.gjRec5();
		System.out.print("\nR06: ");
		
	}
	/**
	 * Metodo para verificar el ingreso de valores sea un numero mayor a 0 y en caso de errores
	 * @param numRepNum: valor o dato ingresado
	 * @return> retorna el valor que se admite
	 */
		private int verificarIngreso(int numRepNum) {
			Boolean banderaRep;
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
			return numRepNum;
		}
	/**
	 * Metodo que imprime la primera parte d elos metodos
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
	