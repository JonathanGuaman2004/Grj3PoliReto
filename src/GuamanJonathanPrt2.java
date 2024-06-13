

/**clase con algunos metodos de la segunda parte del polireto
 * @author GuamanJonathan
 * @version 1.0
 */
public class GuamanJonathanPrt2 {
    private String fraseUno;
    private int numero=0;

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
        System.out.println("A continuación ingrese una frase para retirar l (j) y colocarlo en mayusculas");
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
                        matriz[fil][col]=Character.toString(apellido.charAt(col));
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
    public void gjLoad5(){
        
    }
    public void gjLoad11(){
        
    }
    public void gjRec5(){
        
    }
    public String getFraseUno() {
        return fraseUno;
    }
    public void setFraseUno(String fraseUno) {
        this.fraseUno = fraseUno;
    }
}
