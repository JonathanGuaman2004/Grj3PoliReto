/**Clase con algunas de las series del PoliReto
 * @author GuamanJonathan
 * @version 1.0
 */
public class GuamanJonathan {
	/**crea una serie de acuerdo al tamano solicitado
	 * @author GuamanJonathan
	 * @param jgTamano: escribe el tamano de la serie
	 */
	public void jgSN1(int jgTamano) {
		if (jgTamano<=0){
			System.out.println();
		}else if (jgTamano<2) {
			System.out.println("0 ");
		}else{
			int jgPrim=0;
			int jgSeg=1;
			System.out.print("0 ");
			System.out.print("1 ");
			for(int jgRep=0;jgRep<jgTamano-2;jgRep++){
				int suma=jgPrim+jgSeg;
				System.out.print(suma+" ");
				jgPrim=jgSeg;
				jgSeg=suma;
			}
			System.out.println();
		}
	}
	/**crea una serie de acuerdo al tamano solicitado
	 * @author GuamanJonathan
	 * @param jgTamano: escribe el tamano de la serie
	 */
	public void jgSN2(int jgTamano) {
		if (jgTamano<=0){
			System.out.println();
		}else if (jgTamano<2) {
			System.out.println("1 ");
		}else{
			for(int jgLug=1;jgLug<jgTamano+1;jgLug++) {
				if((jgLug%2)==0) {
					System.out.print("0 ");
				}else {
					System.out.print(jgLug+" ");
				}
			}
			System.out.println();
		}
	}
	/**crea una serie de acuerdo al tamano y caracter solicitado
	 * @author GuamanJonathan
	 * @param jgTamano: escribe el tamano de la serie
	 * @param tipoCaracter: escribe el carcter que aparezca en la serie
	 */
	public void jgSC1(int jgTamano,String tipoCaracter) {
		if (jgTamano<0){
			System.out.println();
		}else if (jgTamano<2) {
			System.out.println(tipoCaracter+" ");
		}else{
			for(int jgLug=0;jgLug<jgTamano;jgLug++) {
				if((jgLug%2)==0) {
					System.out.print(tipoCaracter+" ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * @author GuamanJonathan
	 * @param jgTamano: escribe el tamano de la figura
	 */
	public void jgF1(int jgTamano) {
		if (jgTamano<=0){
			System.out.println();
		}else if (jgTamano==1) {
			System.out.println("* ");
		}else if(jgTamano==2){
			System.out.println("* *");
			System.out.println("* *");
		}else {
			for(int jgLug=0;jgLug<jgTamano;jgLug++) {
				if(jgLug==0||jgLug==jgTamano-1) {
					for(int jgPos=0;jgPos<jgTamano;jgPos++) {
						System.out.print("* ");
					}
					System.out.println();
				}else {
					System.out.print("* ");
					for(int jgPos=0;jgPos<jgTamano-2;jgPos++) {
						System.out.print("  ");
					}
					System.out.println("* ");
				}
			}
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * @author GuamanJonathan
	 * @param jgTamano: escribe el tamano de la figura
	 */
	public void jgF7(int jgTamano) {
		if (jgTamano<=0){
			System.out.println();
		}else if (jgTamano==1) {
			System.out.println(" _ _ _ ");
		}else if(jgTamano==2){
			System.out.println(" _ _ _");
			System.out.println("      |_ _ _");
		}else {
			for(int jgLug=0;jgLug<jgTamano;jgLug++) {
				for (int jgPos=0;jgPos<jgTamano;jgPos++) {
					if((jgLug==0)&&(jgPos==0)) {
						System.out.print(" _ _ _ ");
					}else if(jgLug==jgPos) {
						System.out.print("|_ _ _");
					}else {
						System.out.print("      ");
					}
				}
				System.out.println();
			}
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * @author GuamanJonathan
	 * @param jgTamano: escribe el tamano de la figura
	 */
	public void jgF13(int jgTamano) {
		if (jgTamano<=0){
			System.out.println();
		}else if (jgTamano==1) {
			System.out.println("1");
		}else {
			for(int jgLug=1;jgLug<jgTamano+1;jgLug++) {
				for (int jgPos=1;jgPos<jgLug+1;jgPos++) {
					System.out.print(jgPos+" ");
				}
				System.out.println();
			}
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * @author GuamanJonathan
	 * @param jgTamanoInit: escribe el tamano de la figura
	 */
	public void jgF19(int jgTamanoInit) {
		if (jgTamanoInit<=0){
			System.out.println();
		}else if (jgTamanoInit==1) {
			System.out.println("* ");
		}else if(jgTamanoInit==2){
			System.out.println("* ");
			System.out.println("* +");
		}else {
			System.out.println("* ");
			System.out.println("* +");
			int jgTamano=jgTamanoInit-2;
			int [][] jgArreglo = new int [jgTamano][jgTamano];
			for(int jgColum = 0;jgColum<jgTamano;jgColum++) {
				jgArreglo[jgColum][0]=jgColum+3;
			}
			int jgInic=3;
			for(int jgColum = 0;jgColum<jgTamano;jgColum++) {
				jgArreglo[jgColum][jgColum]=jgInic;
				jgInic=jgInic+2;
			}
			if(jgArreglo[0].length>2) {
				int jgFila=1;
				for(int jgPlace=2;jgPlace<jgArreglo[0].length;jgPlace++) {
					for(int jgPol=0;jgPol<jgFila;jgPol++) {
						jgArreglo[jgPlace][jgPol+1]=jgArreglo[jgPlace-1][jgPol]+jgArreglo[jgPlace-1][jgPol+1];
					}
					jgFila++;
				}
			}
			for(int jgFilas=0;jgFilas<jgArreglo[0].length;jgFilas++) {
				System.out.print("* ");
				for(int jgColumnas=0;jgColumnas<jgArreglo[0].length;jgColumnas++) {
					if(jgArreglo[jgFilas][jgColumnas]==0) {
						System.out.print("");
					}else {
						System.out.print(jgArreglo[jgFilas][jgColumnas]+" ");
					}
				}
				System.out.print("+");
				System.out.println();
			}
		}
	}
}