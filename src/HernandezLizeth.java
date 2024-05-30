/**
 * Esta clase contiene varios métodos de series numericas, de caracteres y figuras
 * @author HernandezLizeth
 * @version 1.0
 */
public class HernandezLizeth {

    /**
     * Crea una serie numerica con numeros fraccionarios
     * Numerador : serie de Fibonacci
     * Denominador : numeros pares
     * @param hlTamano: tamaño de la serie proporcionado por el usuario
     */
    public void hlSN4(int hlTamano){

        int hlNumerador;
        int hlDenominador;
        int hlNumeradorAnterior;
        int hlNumeradorNuevo;

    
        hlNumerador             = 0;
        hlDenominador           = 2;
        hlNumeradorAnterior     = 0;
        hlNumeradorNuevo        = 1;
    

        for (int hlI = 0; hlI < hlTamano; hlI++) {
            System.out.print(hlNumeradorAnterior + "/" + hlDenominador + " , ");

            hlNumerador         = hlNumeradorAnterior + hlNumeradorNuevo;
            hlNumeradorAnterior = hlNumeradorNuevo;
            hlNumeradorNuevo    = hlNumerador;

            hlDenominador += 2;

        }
    }

/**
 * Serie numerica en donde se multiplica al numero por 3
 * @param hlTamano: tamaño de la serie proporcionado por el usuario
 */
    public void hlSN10(int hlTamano){
        int hlNumero;

        hlNumero = 1;
        for (int hlContador = 0; hlContador < hlTamano; hlContador++) {
            hlNumero = hlNumero * 3;
            System.out.print(hlNumero + " , ");
        }
    }

    /**
     * Serie de caracteres en la que se imprime caracteres de acuerdo al numero primo correspondiente
     * @param hlTamano: tamaño de la serie proporcionado por el usuario
     * @param hlTipoCaracter: caracter proporcionado por el usuario para realizar la serie
     */

    public void hlSC3 (int hlTamano , String hlTipoCaracter){
        String hlSerie;
        int hlContador;
        int hlNumero;

        hlSerie      = "";
        hlContador   = 0;
        hlNumero     = 2;

        while (hlContador < hlTamano) {
            boolean hlPrimo = true;
            for (int i = 2; i <= Math.sqrt(hlNumero); i++) {
                if (hlNumero % i == 0) {
                    hlPrimo = false;
                }
            }
            if (hlPrimo) {
                for (int hlA = 0; hlA < hlNumero; hlA++) {
                    hlSerie += "+";
                }
                if (hlContador < hlTamano - 1) {
                    hlSerie += ", ";
                }
                hlContador++;
            }
            hlNumero++;
        }

        System.out.println(hlSerie);
    }


    /**
     * Crea una figura, en este caso un triángulo alineado a la izquierda con un caracter fijado 
     * @param hlTamano: tamaño de la serie proporcionado por el usuario
     */
    public void hlF3(int hlTamano){
        if (hlTamano <=0){
            System.out.println("El tamano deber ser mayor a 0");
        }else{
            for (int hlI = 0; hlI < hlTamano; hlI++) {
                for (int hlJ = 0; hlJ <= hlI; hlJ++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    /**
     * Crea una figura, en este caso unas escaleras de subida y bajada, con un caracter
     * @param hlTamano: tamaño de la serie proporcionado por el usuario
     */
    public void hlF9(int hlTamano) {
        for (int hlA = 0; hlA < hlTamano+1; hlA++) {
            System.out.print("     ");
        }
        System.out.println("_ _ _");

        for (int hlI = 0; hlI < hlTamano; hlI++) {
            for (int hlJ = 0; hlJ < hlTamano - hlI; hlJ++) {
                System.out.print("     ");
            }
            System.out.print("_ _ _|");
            for (int hlJ = 0; hlJ < hlI *2 +1; hlJ++) {
                System.out.print("     ");
            }

            System.out.println("|_ _ _");
        }
    }

    /**
     * Crea una figura en este caso un triángulo mientras sigue la serie de Pascal.
     * Triángulo de Pascal alineado a la izquierda
     * @param hlTamano: tamaño de la serie proporcionado por el usuario
     */
        public void hlF15(int hlTamano){
            int hlNumeroSumado;

            for (int i = 0; i < hlTamano; i++) {
                hlNumeroSumado = 1;
                for (int j = 0; j <= i; j++) {
                
                    System.out.print(hlNumeroSumado + " ");
                    hlNumeroSumado = hlNumeroSumado * (i-j)/(j+1);
                }
                System.out.println("");
            }
    
        }

    }
