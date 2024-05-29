/**
 * Ejercicios de los PoliRetos en java
 * Copyright (C) 2K23, patmic_traimer
 * @author: GualpaNayeli
 * @version: 1.0
 */

public class GualpaNayeli {

/**
 * Creación de los getters y setters de las propiedades
 */    
    private int gnDimension;
    private char gnCaracter; 
      
    public int getgnDimension(){
        return gnDimension;
    }

    public void setgnDimension(int gnDimension){
        this.gnDimension=gnDimension;
    }

    public char getgnCaracter(){
        return gnCaracter;
    }

    public void setgnCaracter(char gnCaracter){
        this.gnCaracter=gnCaracter;
    }

/**
 * Series numericas
 * @param gnDimension : ingresar el tamaño de la serie 
 * 2 3 5 7 11 13 17 19 23 
 * Esta serie fue realizada con un while junto con un for y un if
 */


    public void gnSN5(int gnDimension){
        System.out.println();
        System.out.print("SN5:");
        System.out.print(" ");
        int gninicio = 2;
        int i = 0; 

        while (i<gnDimension) {
            boolean esPrimo = true;

            for(int y=2; y<=Math.sqrt(gninicio); y++){
                if(gninicio % y == 0){
                    esPrimo = false;
                    break;
                }
            }

            if(esPrimo){
                System.out.print(gninicio + " ");
                i++;
            }

            gninicio++;
        }
        System.out.println(" ");
    }

/**
 * @param gnDimension: Ingresar el tamaño de la serie 
 * 2 6 12 20 30 42 56 72 
 * Para la realización de esta serie se debe realizar dos sumas porque al principio incrementa en 4 y 
 * despues va incrementando 2 más por lo cual se ingresa dos incrementos.
 */    
    public void gnSN12(int gnDimension){
        System.out.println();
        System.out.print("SN12:");
        System.out.print(" ");
       
        int gnPrimerNumero = 2; 
        int incremento = 4;
        
        for (int i = 1; i <= gnDimension; i++) {
            System.out.print(gnPrimerNumero + " "); 
            gnPrimerNumero += incremento;
            incremento += 2;            
        }
    }

/**
 * Serie de Caracteres
 * @param gnDimension: Ingresar el tamaño de la serie
 * @param gnCaracter : Ingresar el caracter de la serie
 * + - * / 
 * Para la realización de esta serie se tuvo que definir ya los caracteres y hacer un bucle que 
 * vaya repiento las veces que deseemos repetir los caracteres.
 */    
public void gnSC4(int gnDimension , char gnCaracter){
    System.out.println(" ");
    System.out.print(" SC4:");
    System.out.print(" ");

    String gnSecuencia= "+ - * /";
    
    for(int i=0; i < gnDimension;i++ ){
        System.out.print(gnSecuencia);

        if(i<gnDimension-1){
            System.out.print(" ");
        }

        if(i<gnDimension){
            System.out.print(" ");
        }
    }
    System.out.println(" ");
}

/**
 * @param gnDimension: Ingresar el tamaño de la serie
 * @param gnCaracter : Ingresar el caracter de la serie
 * aa bbbb cccccc
 * Para la realización de esta serie tiene que incrementar el primer caracter en 2 junto con la siguiente
 *  letra o caracter que se ingrese.
 */  

public void gnSC7(int gnDimension , char gnCaracter) {
    System.out.println(" ");
    System.out.print("SC7:");
    System.out.print(" ");

    for (int i = 2; i <= gnDimension; i += 2) {
        for (int j = 0; j < i; j++) {
            System.out.print(gnCaracter);
        }

        if (i < gnDimension) {
            System.out.print(" ");
        }

        gnCaracter++;
    }
}

/**
 * Serie de Figuras
 * @param gnDimension : Ingresar el tamaño de la serie
 * @param gnCaracter : Ingresar el caracter de la serie
 * En esta serie es la realizacion de un triángulo rectángulo en este bucle con lo que se maneja 
 * es con su tamaño, se le define los niveles que se desee y con otro for, se le va restando los 
 * caracteres de cada fila para que de como return un triángulo rectángulo.
 */

public void gnSF4(int gnDimension , char gnCaracter) {
    System.out.println(" ");
    System.out.print(" SF4:");
    System.out.println(" ");
    System.out.println(" ");

    for (int i = 0; i < gnDimension; i++) {
        for (int j = 0; j < gnDimension - i; j++) { 
            System.out.print(" ");
        }

        for (int k = 0; k <= i; k++) { 
            System.out.print(gnCaracter);
        }
        System.out.println(); 
    }
        System.out.println(" ");       
    }

/**
 * @param gnDimension : Ingresar el tamaño de la serie
 * Para la realización de este bucle se definió ya los caracteres para que pueda dar 
 * como return una escalerita hacia con signos más y menos.
 */
public void gnSF10(int gnDimension){
        
        System.out.println(" ");
        System.out.print(" SF10:");
        System.out.println(" ");
        System.out.println(" ");

        String gnLinea = "_";
        String gnMas= "+";
        String gnMenos="-";

        for (int i = 0; i < gnDimension; i++) {

            System.out.println(i % 2 == 0 ? gnLinea + gnMas + gnLinea: gnLinea + gnMenos + gnLinea);
            for (int j = 0; j < i+1; j++) {
                System.out.print("    ");
            }
            System.out.print("|");

        }
        System.out.println("");
    }

/**
 * @param gnDimension : Ingresar el tamaño de la serie
 * Para la realización de este  bucle se define los caracteres y se realiza un for junto con
 *  un if para que de como return una cruz dibujado con los caracteres ya definidos.
 */
    public void gnSF16(int gnDimension){

        System.out.println(" ");
        System.out.print(" SF16:");
        System.out.println(" ");
        System.out.println(" ");

        String gnMas= "+";
        String gnMenos="-";
       
        for (int i = 0; i < gnDimension; i++) {
            if (i % 4 == 0 || i == 0){
                System.out.println(gnMas +  "               " + gnMas);
            }else if(i % 2 != 0){
                System.out.println("    " + gnMenos +   "       " + gnMenos);
            }else{
                System.out.println("        " + gnMas);
            }
        }
    }
}



     



  
    

