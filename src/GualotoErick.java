/**Clase con series del PoliReto
 * @author GualotoErick
 * @version 1.0
 */

public class GualotoErick {
/**
 * Creación de los getters y setters de las propiedades
 */
    private int geTamano;
    private String tipoCaracter;
    public int getGeTamano() {
        return geTamano;
    }

    public void setGeTamano(int geTamano) {
        this.geTamano = geTamano;
    }

    public String getTipoCaracter() {
        return tipoCaracter;
    }

    public void setTipoCaracter(String tipoCaracter) {
        this.tipoCaracter = tipoCaracter;
    }

    /**Serie creada segun el tamano ingresado
	 * 0/1 1/3 1/5 2/7 3/9 5/11 8/13 13/15 ...
	 * Fibonacci como numerador y impares como denominador
	 * @author GualotoErick
	 * @param geTamano: escribe el tamano de la serie
	 */
    public void geSN3(int geTamano){
        if (geTamano <= 0){
            System.out.println("El tamano debe ser mayor a 0");
        }else if (geTamano < 2){
            System.out.println("0/1");
        }else{
            int geNumerador     = 0;
            int geDenominador   = 1;
            int geAnterior      = 0;
            int gePrimero       = 1;
            System.out.println("0/1");
            for (int geBucle = 0; geBucle < geTamano-1; geBucle++ ){
                    geDenominador = geDenominador +2;
                    geNumerador = geAnterior + gePrimero;
                    geAnterior = gePrimero;
                    gePrimero = geNumerador;
                    System.out.print(geNumerador + "/" + geDenominador + " ");
            }
            System.out.println();
        }
    }

    /**Serie creada segun el tamano ingresado
	 * 2 4 8 16 32 64 128 256 ...
	 * Comenzando con 2, se multiplica por 2 y asi hasta las veces indicadas
	 * @author GualotoErick
	 * @param geTamano: escribe el tamano de la serie
	 */
    public void geSN9(int geTamano){
        if (geTamano <= 0){
            System.out.println("El tamano debe ser mayor a 0");
        }else if (geTamano < 2){
            System.out.println("2");
        }else{
            int geNum = 2;
            System.out.print("2 ");
            for (int geBucle = 0; geBucle < geTamano-1; geBucle++ ) {
                geNum = geNum * 2;
                System.out.print(geNum + " "); 
            }
            System.out.println();
        }
    }

    /**Serie creada segun el tamano ingresado
	 * + + ++ +++ +++++ ++++++++ ...
	 * Fibbonaci pero con un simbolo
	 * @author GualotoErick
	 * @param geTamano: escribe el tamano de la serie
     * @param tipoCaracter: escribe el carcter que aparezca en la serie
	 */
    public void geSC2(int geTamano, String tipoCaracter){
        if (geTamano <= 0){
            System.out.println("El tamano debe ser mayor a 0");
        }else if (geTamano < 2){
            System.out.println(tipoCaracter);
        }else{
            int gePrimero = 0;
            int geSegundo = 1;
            System.out.print(tipoCaracter);
            for (int geBucle = 0; geBucle < geTamano-1; geBucle++ ){
                System.out.print(" ");
                int geSuma = gePrimero + geSegundo;
                gePrimero = geSegundo;
                geSegundo = geSuma;
                for (int geBucle2 = 0; geBucle2 < geSuma;geBucle2++){
                    System.out.print(tipoCaracter);
                }
            }
            System.out.println();
        }
    }

    /**Figura creada segun el tamano ingresado
	 * Un cuadrado, en cada salto se pondra +
	 * @author GualotoErick
	 * @param geTamano: escribe el tamano de la figura
     * @param tipoCaracter: escribe el carcter deseado
	 */
    public void geF2(int geTamano, String tipoCaracter){
        if (geTamano <= 0){
            System.out.println("El tamano debe ser mayor a 0");
        }else if (geTamano == 1){
            System.out.println(tipoCaracter);
        }else if (geTamano == 2){
            System.out.println(tipoCaracter + " " + tipoCaracter);
            System.out.println(tipoCaracter + " " + tipoCaracter);
        }else{
            for (int geFila = 0; geFila < geTamano; geFila++) {
                for (int geColumna = 0; geColumna < geTamano; geColumna++) {
                    if (geFila == 0 || geFila == geTamano - 1){
                        if(geColumna % 2 == 0){
                            System.out.print(tipoCaracter + " ");
                        }else{
                            System.out.print("+ ");
                        }
                    }else {
                        if (geColumna == 0 || geColumna == geTamano - 1){
                            if (geFila % 2 == 0){
                                System.out.print(tipoCaracter + " ");
                            }else {
                                System.out.print("+ ");
                            }
                        }else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    /**Figura creada segun el tamano ingresado
	 * Se forma una escalera al lado contrario de la figura 7
	 * @author GualotoErick
	 * @param geTamano: escribe el tamano de la figura
	 */
    public void geF8(int geTamano){
        if (geTamano <= 0){
            System.out.println("El tamano debe ser mayor a 0");
        }else if (geTamano == 1){
            System.out.println("_ _ _");
        }else if (geTamano == 2){
            System.out.println("      _ _ _");
            System.out.println("_ _ _|");
        }else{
            for (int geA = 0; geA < geTamano; geA++) {
                for (int geB = 0; geB < geTamano - geA - 1; geB++) {
                    System.out.print("     ");
                }
                for (int geC = 0; geC <= geA; geC++) {
                    if (geC == 0){
                        System.out.print("_ _ _");
                    }
                }
                System.out.println("|");
            }
        }
    }

    /**Figura creada segun el tamano ingresado
	 * Triangulo de pascal
	 * @author GualotoErick
	 * @param geTamano: escribe el tamano de la figura
	 */
    public void geF14(int geTamano){
        for (int geVar1 = 0; geVar1 < geTamano; geVar1++) {
            for (int geVar2 = 0; geVar2 < geTamano - geVar1 - 1; geVar2++) {
                System.out.print(" ");
            }
            int numero = 1; 
            for (int geVar2 = 0; geVar2 <= geVar1; geVar2++) {
                System.out.print(numero + " ");
                numero = numero * (geVar1 - geVar2) / (geVar2 + 1); 
            }
            System.out.println(); 
        }
    }
}