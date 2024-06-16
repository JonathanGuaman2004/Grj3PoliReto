/**Clases poliretos 2da parte
 *@author ZambranoJhojan
 *@version 1.0
 */
public class ZambranoJhojanPrt2 {
    private String fraseCuatro;

    /**
     * Metodo recursivo para obtener la suma(a,b)
     */
    public void zjR02(){
        System.out.println(" ");
        int a, b;
        System.out.println("Ingrese dos numeros a suma:");
        a = App.ingresoDatos.nextInt();
        b = App.ingresoDatos.nextInt();

        int resultado = sumaRecursividad(a,b);
        System.out.println("La suma de los dos números es: " + resultado);
    }
    public int sumaRecursividad(int a, int b){
        if(b == 0){
            return a;
        } else 
        return sumaRecursividad(a + 1, b - 1);
    }

    /**
     * Pide el nombre al usuario y realizar la carga mostrando letra a letra hasta el 100%
     */
    public void zjL08(){
        String nombreUsuario = " ";
        System.out.println("Ingrese su nombre por favor");
        nombreUsuario = System.console().readLine();
        for (int i = 0; i <= nombreUsuario.length(); i++) {
            System.out.print("\rCargando: [" + getBarraProgreso(nombreUsuario, i) + "] " + i * 100 / nombreUsuario.length() + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
            }
        }
    }

    public static String getBarraProgreso(String nombre, int ite) {
        int barLength = ite; 
        int progress = ite * barLength / nombre.length();

        StringBuilder BarraProgreso = new StringBuilder();

        for (int i = 0; i < barLength; i++) {
            if (i < progress) {
                if (i < ite) {
                    BarraProgreso.append(nombre.charAt(i));
                } else {
                    BarraProgreso.append(" ");
                }
            } else {
                BarraProgreso.append(" ");
            }
        }
        return BarraProgreso.toString();
    }

    /**
     * Pide al usuario un caracter para la simular la carga y la logitud de la barra es de 20 caracteres
     */
    public void zjL02()throws InterruptedException{
        System.out.println("Ingresa el carácter de carga\n(sólo se aceptará el primer carácter ingresado):" );
        char caracter = App.ingresoDatos.next().charAt(0);
        
        int porcentaje = 0; 

        System.out.println();
        while (porcentaje<= 100) {
            int longitudBarra = porcentaje/5;
            int espacios = 20-longitudBarra;

            System.out.println("[");
            for(int i=0; i < longitudBarra; i++)
                System.out.print(caracter);
            
            for(int i=0; i < espacios; i++)
                System.out.println(" ");
            
                System.out.print("] " + porcentaje + "%\r");
                Thread.sleep(100);
                porcentaje += 5;
        }
        System.out.println("\n");
    }
    
    /**
     * Array para cada palabra de su nombre e ingrese el porcentaje de carga para cada palabra.
     */
    public void zjA01(){
            String[] nombres = {"Jhojan", "Sebastian", "Zambrano", "Curicho"};
    
            for (String nombre : nombres) {
                nombreAnimated(nombre, nombre.length());
            }
        }
        public void nombreAnimated(String nombre, int size) {
            String[] Barra = {"[", " ", "]"};
            float sizeFloat = (float) size;
        
            for (int j = 0; j < size; j++) {
                System.out.print(Barra[0]);
                barraCuerpo(j + 1); 
                System.out.print(">");
                barraEspacio(size - j);
                System.out.print(Barra[2]);
        
                float division = ((j + 1) * 100.0f) / sizeFloat;
                int porcentaje = (int) division;
                System.out.print(porcentaje + "%  ");
        
                try {
                    delay(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
        
                for (int i = 0; i <= j; i++) {
                    System.out.print(nombre.charAt(i));
                }
                System.out.print("\r");
            }
            System.out.println();
        }
        public void barraCuerpo(int size) {
            String cuerpoBarra = "=";
        
            for (int i = 0; i < size; i++) {
                System.out.print(cuerpoBarra);
            }
        }
        
        public void barraEspacio(int size) {
            for (int k = 1; k < size; k++) {
                System.out.print(" ");
            }
        }
        public void delay(int milisegundos) throws InterruptedException {
            Thread.sleep(milisegundos);

    }
    /**
     * Pide al usuario una frase y una letra, elimina la letra ingresada de la frase.
     */
    public void zjCC04(){
        String letra;
        System.out.println("Por favor ingrese una frase");
        setFraseCuatro(App.ingresoDatos.nextLine());
        System.out.println("Usted ingreso la frase: "+getFraseCuatro());
        System.out.println("ingrese una letra, dicha letra sera borrada de la frase");
        letra = App.ingresoDatos.nextLine();
        System.out.println("Usted ingreso la vocal: "+ letra);

        if (letra.isEmpty()) {
            System.out.println("No se ingresó ninguna vocal, el programa continuará sin eliminar vocales.");
            System.out.println("La nueva frase es: " + getFraseCuatro());
            return; 
        }
        if (letra.length() != 1) {
            System.out.println("Por favor, ingresa solo una letra.");
        }else{
            String resultado = getFraseCuatro().replace(letra, "");
            System.out.println("La nueva frase es: " + resultado);
        }

    }

    public String getFraseCuatro() {
        return fraseCuatro;
    }
    public void setFraseCuatro(String fraseCuatro) {
        this.fraseCuatro = fraseCuatro;
    }

}
