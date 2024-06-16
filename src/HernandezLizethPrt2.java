/**
 * Ejecución de la segunda parte de los poliretos
 * @author : Hernández Lizeth
 * @version: 1.0
 */

import java.util.Random;

public class HernandezLizethPrt2 {

    /**
     * Son los cambios de colores para las barras respectivas
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";


    private String  hlFraseTransformar;
    private String  hlVocales;
    private String  hlResultado;
    private String  hlNombre;
    private Integer hlNumero;
    private static Integer hlBase;
    private static Integer hlExponente;

    public HernandezLizethPrt2(){
        hlResultado       = "";
        hlVocales         = "aeiouAEIOU";
        hlNombre          = "lizeth";
        hlNumero          = 0;
        hlBase            = 0;
        hlExponente       = 0;

    }

    /**
     * Creacion de los getters y setters de las propiedades
     */

    public Integer gethlBase() {
        return hlBase;
    }
    
    public Integer gethlNumero() {
        return hlNumero;
    }

    public void sethlNumero( Integer hlNumero) {
        this.hlNumero = hlNumero;
    }

    public String gethlNombre() {
        return hlNombre;
    }

    public void sethlNombre(String hlNombre) {
        this.hlNombre = hlNombre;
    }

    public String gethlFraseTransformar() {
        return hlFraseTransformar;
    }

    public void sethlFraseTransformar(String hlFraseTransformar) {
        this.hlFraseTransformar = hlFraseTransformar;
    }

    /**
     * Método en el que se transforma una frase, se la invierte y las consonates a mayusculas
     */
    public void hlCC6(){
        System.out.println("Cadena de caracteres 6. Ingrese una frase: ");
        sethlFraseTransformar(App.ingresoDatos.nextLine());
        for (int i = hlFraseTransformar.length()-1; i >= 0; i--) {
            char c = hlFraseTransformar.charAt(i);

            if(hlVocales.indexOf(c) == -1){
                hlResultado = hlResultado + Character.toUpperCase(c) ;
            }else{
                hlResultado = hlResultado + c;
            }
            
        }
        System.out.println(hlResultado);
    }

    /**
     * Método en el que se ubican las letras del nombre en los puntos de acuerdo a la funcion 2x
     */
    public void hlArr3(){
        System.out.println();
        System.out.println("Arrays 6. Graficar el hlNombre en la funcion f(x) = 2x");
        String[][] matrizPlanoStrings = new String[(hlNombre.length() * 2 + 1)][(hlNombre.length() * 2)];
        int cont = 0, hlConthlFilas2 = matrizPlanoStrings.length - 3, hlContColumnas2 = 1;
        for (int hlContColumnas = matrizPlanoStrings[0].length - 1; hlContColumnas >= 0; hlContColumnas--) {
            for (int hlConthlFilas = matrizPlanoStrings.length - 1; hlConthlFilas >= 0; hlConthlFilas--) {
                if (hlContColumnas == 0) {
                    matrizPlanoStrings[hlConthlFilas][hlContColumnas] = cont + "" + "|";
                    cont++;
                } else if (hlConthlFilas == matrizPlanoStrings.length - 1) {
                    matrizPlanoStrings[hlConthlFilas][hlContColumnas] = "_";
                } else {
                    matrizPlanoStrings[hlConthlFilas][hlContColumnas] = " ";
                }

            }

        }
        for (int i = 0; i < hlNombre.length(); i++) {
            matrizPlanoStrings[hlConthlFilas2][hlContColumnas2] = " " + hlNombre.charAt(i);
            hlContColumnas2++;
            hlConthlFilas2 -= 2;
        }

        for (int i = 0; i < matrizPlanoStrings.length; i++) {
            for (String hlFila : matrizPlanoStrings[i])
                System.out.print(hlFila);
            System.out.println();
        }
    }

    /**
     * Método en el que se realiza una simulación de carga con el caracter o0o hasta el 100%
     */
    public void hlLoad4() throws InterruptedException{
        System.out.println();
        System.out.println("Loading 4 al 100% con el simbolo o0o");
        String hlCarga[]= {"0oo","o0o","oo0","o0o"};
        for(int hlPorcentaje=0; hlPorcentaje <=100; hlPorcentaje++){
            
        String c = hlCarga[hlPorcentaje%4];
        System.out.print("\r"+ c + " "+ hlPorcentaje +"%");

        try{ Thread.sleep(100);}
        catch(InterruptedException ie){}
        }
        System.out.println();
    }

    /**
     * Método en el que se realiza una forma de carga con una barra, la cual tiene un color y se carga hasta un numero randomico del archivo
     */
    public void hlLoad10() throws InterruptedException {
        System.out.println("Calcular loading 10, en donde se muestra la hlCarga ");
        Random random = new Random();
        int hlTamanoArchivo = random.nextInt(91) + 10; 
        double hlCargado = 0.0;
        double hlVelocidadCarga = 0.5;
    
        System.out.printf("Dowloading ArchivoYarl-win_amd64.whl (%d kB)\n", hlTamanoArchivo);
    
        while (hlCargado < hlTamanoArchivo) {

            hlCargado += hlVelocidadCarga;
            if (hlCargado > hlTamanoArchivo) {
                hlCargado = hlTamanoArchivo;
            }

            double hlPorcentaje = (hlCargado / hlTamanoArchivo) * 100;
    
            imprimirBarraProgreso(hlPorcentaje, hlCargado, hlTamanoArchivo);

            Thread.sleep(100);
        }
    
        System.out.println("\nhlCarga completada.");
    }
    
    /**
     * Imprime el progreso de la barra para el ejercicio de la carga anterior en el método hlLoad10
     * @param hlPorcentaje: es la manera en la que progresa del 0 al 100%
     * @param hlCargado: muestra cuanto va cargado el archivo hasta el momento
     * @param hlTamanoArchivo: es hasta el valor que debe llegar la carga
     */
    public static void imprimirBarraProgreso(double hlPorcentaje, double hlCargado, int hlTamanoArchivo) {
        int longitudBarra = 30;
        int caracteresLlenos = (int) (longitudBarra * (hlPorcentaje / 100));
        int caracteresVacios = longitudBarra - caracteresLlenos;
    
        System.out.print("\r[" + ANSI_GREEN);
        for (int i = 0; i < caracteresLlenos; i++) {
            System.out.print("━");
        }
        System.out.print(ANSI_BLACK);
        for (int i = 0; i < caracteresVacios; i++) {
            System.out.print(" ");
        }
        System.out.print(ANSI_RESET + "] ");
        System.out.printf("%.1f / %d kB", hlCargado, hlTamanoArchivo);
    }

    /**
     * Método en el que se calcula una potencia de manera recursiva, pidiendo dos valores al usuario
     */
    public void hlRec4(){
        Boolean hlConfirmar;
        System.out.println();
        System.out.println("Calcular la potencia con recursión ");
        do {
            try {
                System.out.print("Ingrese el primer hlNumero para la hlBase: ");
                hlBase = Integer.parseInt(App.ingresoDatos.nextLine());
                hlConfirmar=true;
            } catch (Exception e) {
                hlConfirmar=false;
            }
        } while (hlConfirmar==false);

        do {
            try {
                System.out.print("Ingrese el segundo hlNumero que es para el hlExponente: ");
                hlExponente = Integer.parseInt(App.ingresoDatos.nextLine());
                hlConfirmar=true;
            } catch (Exception e) {
                hlConfirmar=false;
            }
        } while (hlConfirmar==false);
        int hlResultado = hlPotencia(hlBase, hlExponente);
        System.out.println("hlResultado de la potencia: " + hlResultado);
    }

    /**
     * Calculo de la potencia mediante recursion
     * @param hlBase: es el numero ingresado por el usuario para la base
     * @param hlExponente: es el numero ingresado por el usuario para el exponente
     * @return: retorna resultado de la potencia que es un entero
     */
    public static int hlPotencia(int hlBase, int hlExponente) {
        if (hlExponente == 0) {
            return 1;
        }
        else {
            return hlBase * hlPotencia(hlBase, hlExponente - 1);
        }
    }

}