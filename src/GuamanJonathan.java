/**Clase con algunas de las series del PoliReto
 * @author GuamanJonathan
 * @version 1.0
 */
public class GuamanJonathan {
	/**crea una serie de acuerdo al tamano solicitado
	 * 0 1 1 2 3 5 8 13 21 ...
	 * Fibonacci
	 * @author GuamanJonathan
	 * @param gjTamano: escribe el tamano de la serie
	 */
	public void gjSN1(int gjTamano) {
		if (gjTamano<=0){
			System.out.println();
		}else if (gjTamano<2) {
			System.out.println("0 ");
		}else{
			int gjPrim=0;
			int gjSeg=1;
			System.out.print("0 ");
			System.out.print("1 ");
			for(int gjRep=0;gjRep<gjTamano-2;gjRep++){
				int suma=gjPrim+gjSeg;
				System.out.print(suma+" ");
				gjPrim=gjSeg;
				gjSeg=suma;
			}
			System.out.println();
		}
	}
	/**crea una serie de acuerdo al tamano solicitado
	 * 1 0 3 0 5 0 7 0 9
	 * imprime los numeros impares separados pot ceros 0
	 * @author GuamanJonathan
	 * @param gjTamano: escribe el tamano de la serie
	 */
	public void gjSN2(int gjTamano) {
		if (gjTamano<=0){
			System.out.println();
		}else if (gjTamano<2) {
			System.out.println("1 ");
		}else{
			for(int gjLug=1;gjLug<gjTamano+1;gjLug++) {
				if((gjLug%2)==0) {
					System.out.print("0 ");
				}else {
					System.out.print(gjLug+" ");
				}
			}
			System.out.println();
		}
	}
	/**crea una serie de acuerdo al tamano y caracter solicitado
	 * + - + - + - + - +
	 * toma un carcter y lo intercala con un menos -
	 * @author GuamanJonathan
	 * @param gjTamano: escribe el tamano de la serie
	 * @param tipoCaracter: escribe el carcter que aparezca en la serie
	 */
	public void gjSC1(int gjTamano,String tipoCaracter) {
		if (gjTamano<0){
			System.out.println();
		}else if (gjTamano<2) {
			System.out.println(tipoCaracter+" ");
		}else{
			for(int gjLug=0;gjLug<gjTamano;gjLug++) {
				if((gjLug%2)==0) {
					System.out.print(tipoCaracter+" ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * en esta caso un cuadrado
	 * @author GuamanJonathan
	 * @param gjTamano: escribe el tamano de la figura
	 */
	public void gjF1(int gjTamano) {
		if (gjTamano<=0){
			System.out.println();
		}else if (gjTamano==1) {
			System.out.println("* ");
		}else if(gjTamano==2){
			System.out.println("* *");
			System.out.println("* *");
		}else {
			for(int gjLug=0;gjLug<gjTamano;gjLug++) {
				if(gjLug==0||gjLug==gjTamano-1) {
					for(int gjPos=0;gjPos<gjTamano;gjPos++) {
						System.out.print("* ");
					}
					System.out.println();
				}else {
					System.out.print("* ");
					for(int gjPos=0;gjPos<gjTamano-2;gjPos++) {
						System.out.print("  ");
					}
					System.out.println("* ");
				}
			}
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * en esta caso unas escaleras
	 * @author GuamanJonathan
	 * @param gjTamano: escribe el tamano de la figura
	 */
	public void gjF7(int gjTamano) {
		if (gjTamano<=0){
			System.out.println();
		}else if (gjTamano==1) {
			System.out.println(" _ _ _ ");
		}else if(gjTamano==2){
			System.out.println(" _ _ _");
			System.out.println("      |_ _ _");
		}else {
			for(int gjLug=0;gjLug<gjTamano;gjLug++) {
				for (int gjPos=0;gjPos<gjTamano;gjPos++) {
					if((gjLug==0)&&(gjPos==0)) {
						System.out.print(" _ _ _ ");
					}else if(gjLug==gjPos) {
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
	 * en esta caso cada nivel va aumentando un numero
	 * 1
	 * 12
	 * 123
	 * 1234
	 * @author GuamanJonathan
	 * @param gjTamano: escribe el tamano de la figura
	 */
	public void gjF13(int gjTamano) {
		if (gjTamano<=0){
			System.out.println();
		}else if (gjTamano==1) {
			System.out.println("1");
		}else {
			for(int gjLug=1;gjLug<gjTamano+1;gjLug++) {
				for (int gjPos=1;gjPos<gjLug+1;gjPos++) {
					System.out.print(gjPos+" ");
				}
				System.out.println();
			}
		}
	}
	/**crea una figura de acuerdo al tamano solicitado
	 * en este caso se suman los dos numeros de los niveles anteriores a su fila
	 * *
	 * + *
	 * + 3 *
	 * + 4 5 *
	 * @author GuamanJonathan
	 * @param gjTamanoInit: escribe el tamano de la figura
	 */
	public void gjF19(int gjTamanoInit) {
		if (gjTamanoInit<=0){
			System.out.println();
		}else if (gjTamanoInit==1) {
			System.out.println("* ");
		}else if(gjTamanoInit==2){
			System.out.println("* ");
			System.out.println("* +");
		}else {
			System.out.println("* ");
			System.out.println("* +");
			int gjTamano=gjTamanoInit-2;
			int [][] gjArreglo = new int [gjTamano][gjTamano];
			for(int gjColum = 0;gjColum<gjTamano;gjColum++) {
				gjArreglo[gjColum][0]=gjColum+3;
			}
			int gjInic=3;
			for(int gjColum = 0;gjColum<gjTamano;gjColum++) {
				gjArreglo[gjColum][gjColum]=gjInic;
				gjInic=gjInic+2;
			}
			if(gjArreglo[0].length>2) {
				int gjFila=1;
				for(int gjPlace=2;gjPlace<gjArreglo[0].length;gjPlace++) {
					for(int gjPol=0;gjPol<gjFila;gjPol++) {
						gjArreglo[gjPlace][gjPol+1]=gjArreglo[gjPlace-1][gjPol]+gjArreglo[gjPlace-1][gjPol+1];
					}
					gjFila++;
				}
			}
			for(int gjFilas=0;gjFilas<gjArreglo[0].length;gjFilas++) {
				System.out.print("* ");
				for(int gjColumnas=0;gjColumnas<gjArreglo[0].length;gjColumnas++) {
					if(gjArreglo[gjFilas][gjColumnas]==0) {
						System.out.print("");
					}else {
						System.out.print(gjArreglo[gjFilas][gjColumnas]+" ");
					}
				}
				System.out.print("+");
				System.out.println();
			}
		}
	}
}