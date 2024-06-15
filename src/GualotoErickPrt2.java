/**clase con algunos metodos de la segunda parte del polireto
 * @author GualotoErick
 * @version 1.0
 */

public class GualotoErickPrt2 {
    private String frase;

    /** Pedir una frase y una vocal, eliminar la vocal ingresada de la frase.  */
    public void geCC3(){
        String vocal; 
        System.out.print("Ingrese la frase a usar como base: ");
        frase = App.ingresoDatos.nextLine();
        System.out.print("Ingrese la VOCAL a eliminar: ");
        vocal = App.ingresoDatos.nextLine();

        if (vocal.isEmpty()) {
            System.out.println("No se ingresó ninguna vocal, el programa continuará sin eliminar vocales.");
            System.out.println("Resultado: " + frase);
            return; 
        }

        char grande = vocal.toLowerCase().charAt(0);
        char enano = vocal.toLowerCase().charAt(0);


        if (vocal.charAt(0) == 'A' || vocal.charAt(0) == 'a' ||
            vocal.charAt(0) == 'E' || vocal.charAt(0) == 'e' ||
            vocal.charAt(0) == 'I' || vocal.charAt(0) == 'i' ||
            vocal.charAt(0) == 'O' || vocal.charAt(0) == 'o' ||
            vocal.charAt(0) == 'U' || vocal.charAt(0) == 'u') {

                StringBuilder resultado = new StringBuilder();
        
                for (int pos = 0; pos < frase.length(); pos++) {
                    char c = frase.charAt(pos);
                    if ((c == enano) || (c == grande)) {
                            resultado.append(' ');
                        } else {resultado.append(c);}
                }
                System.out.println("Resultado: " + resultado.toString());

        } else {System.out.println("No ingreso una vocal");}
    }

    /* Ingresa una frase y convertir una letra a mayusculas y otra a minisculas */
    public void geCC9(){
        System.out.print("Ingrese la frase a usar como base: ");
        frase = App.ingresoDatos.nextLine();

        for (int pos = 0; pos < frase.length(); pos++) {
            char c = frase.charAt(pos);
            if (pos % 2 == 0) {
                System.out.print(Character.toUpperCase(c));
                } else {
                    System.out.print(Character.toLowerCase(c));
                    }
        }
        System.out.println();
    }

    /** Indicador de carga desde 0  a 100% usar los signos \|/-| para simular un movimiento rotacional de carga 0% hasta 100% */
    public void geLoad1(){
        String[] signos = {"\\", "|", "/", "-"};
        int signoGuia = 0;

        for (int i = 0; i <= 100; i++) {
            System.out.print("\rCargando: " + i + "% " + signos[signoGuia]);
            signoGuia = (signoGuia + 1) % signos.length;
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {} 
        }
        System.out.println("\nCarga completada.");
    }

    /* Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100%  */
    public void geLoad7(){
        System.out.print("Ingrese su nombre: ");
        frase = App.ingresoDatos.nextLine();
        char[] caracteres = frase.toCharArray();

        for (int i = 0; i <= 100; i++) {
            int index = (i * caracteres.length) / 100; 
            StringBuilder base = new StringBuilder();

            for (int j = 0; j < index; j++) {
                base.append(" ");
            }

            if (index < caracteres.length) {
                base.append(caracteres[index]);
            }

            for (int z = index; z < caracteres.length; z++) {
                base.append(" ");
            } 

            System.out.print("\r" + base.toString() + " " + i + "%");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
        System.out.println("\nCraga completa");
    } 

    /* Crear un metodo recursivo para obtener factorial(n) */ 
    public void geRec1(){
        System.out.println("Ingrese el valor del factorial a operar !n: ");
        int n = App.ingresoDatos.nextInt();
        System.out.println("El factorial de " + n + " es: " + factorial(n));
        }
        
        public int factorial(int n){
            if (n == 0){
                return 1;
                } else 
                    return n * factorial(n - 1);
        }

    /* Crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0 / imprimir el avance */
        public void geRec6(){
            System.out.print("Ingrese el valor de conteo regresivo: ");
            int n = App.ingresoDatos.nextInt();
            conteoRegresivo(n);
        }

            public void conteoRegresivo(int n){
                if (n < 0) 
                    return;
            
                System.out.println(n);

                conteoRegresivo(n - 1);
                
            }
}
