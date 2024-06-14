/**clase con algunos metodos de la segunda parte del polireto
 * @author GuamanJonathan
 * @version 1.0
 */
public class GuamanJonathanPrt2 {
    private String fraseUno;
    private int numero;
    private int barraTam;
    private int longSenal;
    private boolean confirmar;
/**
 * Estos valores permiten dar colores al texto
 */
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";

    public GuamanJonathanPrt2(){
        numero=0;
        barraTam=19;
        longSenal=10;
    }
    /**
     * Pedir una frase y contador las vocales
     */
    public void gjCC1(){
        
        System.out.println("A continuación ingrese una frase para contar las vocales");
        setFraseUno(App.ingresoDatos.nextLine());
        System.out.println("Usted ingreso la frase: "+getFraseUno());
        for(int pos=0;pos<getFraseUno().length();pos++){
            if((getFraseUno().charAt(pos)==65)||(getFraseUno().charAt(pos)==97)||
                (getFraseUno().charAt(pos)==69)||(getFraseUno().charAt(pos)==101)||
                (getFraseUno().charAt(pos)==73)||(getFraseUno().charAt(pos)==105)||
                (getFraseUno().charAt(pos)==79)||(getFraseUno().charAt(pos)==111)||
                (getFraseUno().charAt(pos)==85)||(getFraseUno().charAt(pos)==117)){
                    numero=numero+1;
                }
        }
        System.out.println("La cantidad de vocales en la frase es: "+numero); 
    }
    /**
     * Pedir una frase y presentarla en mayusculas y sin la J
     */
    public void gjCC7(){
        int tamano;
        String nuevo="";
        System.out.println("A continuación ingrese una frase para retirar la (j) y colocarlo en mayusculas");
        fraseUno=App.ingresoDatos.nextLine();
        tamano=fraseUno.length();
        System.out.println("Usted ingreso la frase: "+fraseUno);
        for(int pos=0;pos<tamano;pos++){
            if((fraseUno.charAt(pos)==74)||(fraseUno.charAt(pos)==106)){
                nuevo=nuevo+"";
            }else{
                nuevo=nuevo+Character.toString(fraseUno.charAt(pos));
            }
        }
        System.out.println("La frase en mayusculas y sin la (j) es el siguiente: "+nuevo.toUpperCase()); 
    }
    /**
     * Crear un matriz donde forme una X con su nombre y apellido
     */
    public void gjArr4(){
        String nombre="Jonathan", apellido="Guaman";
        int tamMay;
        if(nombre.length()>apellido.length()){
            tamMay=nombre.length();
        }else{
            tamMay=apellido.length();
        }
        String [][]matriz=new String[tamMay][tamMay];
        for(int fil=0;fil<tamMay;fil++){
            for(int col=0;col<tamMay;col++){
                try {
                    if((fil==col)){
                        matriz[fil][col]=Character.toString(nombre.charAt(col));
                    }
                } catch (Exception e) {
                }
            }
        }
        for(int fil=tamMay-1;fil>=0;fil--){
            for(int col=0;col<tamMay;col++){
                try {
                    if((tamMay-fil-1==col)){
                        matriz[col][fil]=Character.toString(apellido.charAt(col));
                    }
                } catch (Exception e) {
                }
            }
        }
        System.out.println();
        for(int fil=0;fil<tamMay;fil++){
            System.out.print("[");
            for(int col=0;col<tamMay;col++){
                if(matriz[fil][col]!=null){
                    System.out.print(" "+matriz[fil][col]+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("]");
        }
    }
    /**
     * Crear una barra es de 20 caracteres, la barra avanza cambiando la punta entre > -
     */
    public void gjLoad5(){
        int porcentaje;
        for(int i=1;i<barraTam+2;i++){
            if((i%2)==0){
                porcentaje=i*5;
                System.out.print("\r"+"["+"=".repeat(i-1)+"-"+" ".repeat(barraTam-i+1)+"] "+porcentaje+"%");
                tiempoRetraso();
            }else{
                porcentaje=i*5;
                System.out.print("\r"+"["+"=".repeat(i-1)+">"+" ".repeat(barraTam-i+1)+"] "+porcentaje+"%");
                tiempoRetraso();
            }
        }
    }
    private void tiempoRetraso() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {}
    }
    /**
     * Generar un numero randon entre 0 a 10 para simular la longitud de cada señal. 
     * Este nuemero debe servir para dibujar la señal de forma simetrica a la izquierda y derecha, con un eje central. 
     * Agregar color y con un nivel de 50
     */
    public void gjLoad11(){
        int valorRandom;
        for(int niv=0;niv<50;niv++){
            valorRandom=(int)(Math.random()*10+1);
            if(valorRandom<=4){
                System.out.println(ANSI_GREEN+"\r"+" ".repeat(longSenal-valorRandom)
                                    +"-".repeat(valorRandom)
                                    +"|"+"-".repeat(valorRandom)+" ".repeat(longSenal-valorRandom)+ANSI_RESET);
                tiempoRetraso();
            }else if(valorRandom>=9){
                System.out.println(ANSI_RED+"\r"+" ".repeat(longSenal-valorRandom)
                                    +"-".repeat(valorRandom)
                                    +"|"+"-".repeat(valorRandom)+" ".repeat(longSenal-valorRandom)+ANSI_RESET);
                tiempoRetraso();
            }else{
                System.out.println(ANSI_YELLOW+"\r"+" ".repeat(longSenal-valorRandom)
                                    +"-".repeat(valorRandom)
                                    +"|"+"-".repeat(valorRandom)+" ".repeat(longSenal-valorRandom)+ANSI_RESET);
                tiempoRetraso();
            }  
        }
    }
    /**
     * crear un metodo recursivo para obtener la conteoProgregresivoHasta(n)
     */
    public void gjRec5(){
        int nuevo=0;
        System.out.println("A continuación ingrese un numero a contar progresivamente");
        do{
            try {
                System.out.println("un numero".toUpperCase());
                nuevo=Integer.parseInt(App.ingresoDatos.nextLine());
                confirmar=false;
            } catch (Exception e) {
                confirmar=true;
            }
        }while(confirmar);
        System.out.println("Contero");
        contarProgesivamente(nuevo,nuevo);
    }
    /**
     * metodo de recursion que cuenta progresivamente
     * @param n: valor en el que termina
     * @param m: valor de referencia
     */
    public void contarProgesivamente(int n,int m){
        if((n-m)==n){
            System.out.println(n);
        }else{
            tiempoRetraso();
            System.out.println(n-m);
            contarProgesivamente(n, m-1);
        }
        
    }
    public String getFraseUno() {
        return fraseUno;
    }
    public void setFraseUno(String fraseUno) {
        this.fraseUno = fraseUno;
    }
}
