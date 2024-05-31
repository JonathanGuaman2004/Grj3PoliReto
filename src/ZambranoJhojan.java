public class ZambranoJhojan {
    /**
    * Realiza la serie de numeros 7
    * version 1.0
    * @param cantnum: determina el numero de elementos que contendra la serie
    * @author jhojanzambrano
    */   
    public void jzSN7(int cantNum) {

        int num = 1;
        
        for (int i = 0; i < cantNum; i++) {
            System.out.print(num + " ");
            num += 3;
        }   
    }
    /**
    * Realiza la serie de caracteres 6
    * version 1.0
    * @param tam: determina el numero de elementos que contendra la serie
    * @author jhojanzambrano
    */
    public void jzSC6(int tam) {

        char letra = 'a';
            
        for (int i = 0; i < tam; i++) {
            System.out.print(letra + " ");
                
            letra++;

            if (letra > 'z') {
                letra = 'a';
            }
        }
    }
    /**
    * Realiza la serie de caracteres 9
    * version 1.0
    * @param tamSerie: determina el numero de elementos que contendra la serie
    * @author jhojanzambrano
    */
    public void jzSC9(int tamSerie) {
        char letra = 'a';
        int rep = 1;

        for (int i = 0; i < tamSerie; i++) {
            for (int j = 0; j < rep; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
                
            rep += 2;

            letra++;

            if (letra > 'z') {
                    letra = 'a';
            }
        }
    }
    /**
    *Realiza la figura 6
    * version 1.0
    * @param caracter: determina el cracater con el cual se llenara y formara la figura
    * @param tamBase: determina el tamaño de la figura (catidad de elementos que tendra la base)
    * @param niv: determina la cantidad de niveles que tendra la figura (numero de pisos)
    * @author jhojanzambrano
    */
    public void jzF6(char caracter, int tamBase, int niv) {

        int sigPiso = (tamBase - 1) / 2;

        for (int i = 0; i < niv; i++) {
            for (int j = 0; j < sigPiso - i; j++) {
                    System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print(caracter);
            }
                System.out.println();
        }
    }
    /**
    * Realiza la figura 12
    * version 1.0
    * @param tam: determina hasta que numero llegara la serie y a partir de ese decresera
    * @author jhojanzambrano
     */
    public void jzF12(int tam) {
        for (int i = tam; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); 
        }
    }
    /**
    * Realiza la figura 18
    * version 1.0
    * @param tam: determina el tamaño de la figura (numero de pisos)
    * @author jhojanzambrano
    */
    public void jzF18(int tam) {
        int[][] piramide = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    piramide[i][j] = 1; 
                } else if (j == i) {
                    piramide[i][j] = 2; 
                } else {
                    piramide[i][j] = piramide[i - 1][j - 1] + piramide[i - 1][j];
                }
            }
        }

        for (int i = 0; i < tam; i++) {
                piramide[i][0] = (i == 0) ? 2 : 1;
        }

        for (int i = 0; i < tam; i++) {
            piramide[i][i] = 2;
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(piramide[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
