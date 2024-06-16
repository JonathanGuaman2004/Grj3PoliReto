import java.util.Scanner;
/**
 * Ejercicios de los PoliRetos la segunda parte en java
 * Copyright (C) 2K23, patmic_traimer
 * @author: GualpaNayeli
 * @version: 1.0
 */

public class GualpaNayeliPrt2 {

    /**
     * Creación de las propiedades y de los getters and setters
     */

    private String gnFrase;
    private String gnNombreCompleto;
    private int gnTamano;
    private String gnCaracter;
    private int gnA;
    private int gnB;
  

    public int getGnA() {
        return gnA;
    }

    public void setGnA(int gnA) {
        this.gnA = gnA;
    }

    public int getGnB() {
        return gnB;
    }

    public void setGnB(int gnB) {
        this.gnB = gnB;
    }

    public String getGnCaracter() {
        return gnCaracter;
    }

    public void setGnCaracter(String gnCaracter) {
        this.gnCaracter = gnCaracter;
    }

    public int getGnTamano() {
        return gnTamano;
    }

    public void setGnTamano(int gnTamano) {
        this.gnTamano = gnTamano;
    }

    public String getGnNombreCompleto() {
        return gnNombreCompleto;
    }

    public void setGnNombreCompleto(String gnNombreCompleto) {
        this.gnNombreCompleto = gnNombreCompleto;
    }

    public String getGnFrase() {
        return gnFrase;
    }

    public void setGnFrase(String gnFrase) {
        this.gnFrase = gnFrase;
    }

    /**
     * Realización de invertir una frase y que sus vocales sean mayúsculas
     * @param scanner
     */

    public void gnCC05() {
        System.out.println();
        System.out.print(" C05) ");
        System.out.print("Ingrese una frase que desee: ");
        gnFrase = App.ingresoDatos.nextLine();

        /**
         * Procesar la frase
         * Mostrar el resultado
         */
        String resultado = invertirYConvertirVocales(gnFrase);
        System.out.println("Frase invertida con vocales en mayúsculas: " + resultado);
    }

    private String invertirYConvertirVocales(String frase) {
        StringBuilder invertida = new StringBuilder();

        /**
         * Invertir la frase y convertir las vocales en mayúsculas
         */
       
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                invertida.append(Character.toUpperCase(c));
            } else {
                invertida.append(c);
            }
        }
        return invertida.toString();
    }

    /**
     * Creación de nuestro nombre y apellido
     * @param scanner
     */

    public void gnA02() {
        Boolean corregir;
        System.out.println();
        System.out.print(" A02) ");
        do {
            try {
                System.out.print("Ingrese el tamaño: ");
                gnTamano = Integer.parseInt(App.ingresoDatos.nextLine());
                corregir=true;
            } catch (Exception e) {
                corregir=false;
            }
        } while (corregir==false);
       
        do {
            System.out.print("Ingrese un caracter y que no sea nulo: ");
            gnCaracter = App.ingresoDatos.next();
        } while (gnCaracter.length()>1 || gnCaracter==null);
       
        System.out.println();
        System.out.println(" Mi nombre es Nayeli Gualpa");
        System.out.println();


        for (int i = 1; i <= gnTamano; i++) {
            System.out.print(gnCaracter);
            System.out.print(gnCaracter);

            for (int a = 1; a <= i; a++) {
                System.out.print(" ");
            }
            System.out.print(gnCaracter);
            System.out.print(gnCaracter);

            for (int a = 1; a <= gnTamano - i; a++) {
                System.out.print(" ");
            }
            System.out.print(gnCaracter);
            System.out.print(gnCaracter);

            for (int a = 1; a <= gnTamano / 2; a++) {
                System.out.print(" ");
            }

            if (i == gnTamano) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.print(" ");
            }
            System.out.print(gnCaracter);

            if (i == 1 || i == gnTamano) {
                for (int b = 1; b <= gnTamano - 2; b++) {
                    System.out.print(gnCaracter);
                }
            }

            if (i == gnTamano / 2) {
                for (int b = 1; b <= gnTamano - i; b++) {
                    System.out.print(" ");
                }

                for (int b = 1; b <= gnTamano - i; b++) {
                    System.out.print(gnCaracter);
                }

                System.out.println(gnCaracter);
            } else {
                if (i != 1 && i != gnTamano) {
                    for (int b = 1; b <= gnTamano; b++) {
                        System.out.print(" ");
                    }
                }

                if (i < gnTamano / 2) {
                    System.out.println(" ");
                } else {
                    System.out.println(gnCaracter);
                }
            }

        }

    }

    /**
     * Creación de una animación 
     * Tamaño de la barra fijo en 20 caracteres
     * @param scanner
     */

    public void gnL03() {
        System.out.println();
        System.out.print(" L03) ");
        System.out.print("Ingrese un caracter: ");
        char caracter = App.ingresoDatos.next().charAt(0);
        int barraTam = 20; 
        
        System.out.print("\r[" + caracter + "]");
        for (int i = 1; i <= barraTam; i++) {
            System.out.print("\b" + caracter + "]");
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(" " + barraTam * 5 + "%");
        App.ingresoDatos.nextLine();
    }
     
    /**
     * Creación de una línea recta con nuestro nombre junto con sus porcentajes
     * Incrementar el porcentaje
     * Discrimentar el porcentaje
     * @param scanner
     */

    public void gnL09() {
        System.out.println();
        System.out.print(" L09) ");
        System.out.print("Ingrese su nombre completo: ");
        gnNombreCompleto = App.ingresoDatos.nextLine();

        char[] letras = gnNombreCompleto.toCharArray();

      
        double incremento = 100.0 / letras.length;

       
        double porcentaje = 0;
        for (char letra : letras) {
           
            for (int i = 0; i < Math.round(porcentaje); i++) {
                System.out.print(" ");
            }

            System.out.println(letra + "\t" + Math.round(porcentaje) + "%");
            
            porcentaje += incremento;
        }
    }

    /**
     * Creacion de una multiplicación (a,b)
     * @param scanner
     */

    public void gnR03() {
        Boolean corregir;
        System.out.println();
        System.out.print(" R03) ");
        do {
            try {
                System.out.print("Ingrese el primer numero: ");
                gnA = Integer.parseInt(App.ingresoDatos.nextLine());
                corregir=true;
            } catch (Exception e) {
                corregir=false;
            }
        } while (corregir==false);

        do {
            try {
                System.out.print("Ingrese el segundo numero: ");
                gnB = Integer.parseInt(App.ingresoDatos.nextLine());
                corregir=true;
            } catch (Exception e) {
                corregir=false;
            }
        } while (corregir==false);
       
        int resultado = multiplicacion(gnA, gnB);
        System.out.println("Resultado de la multiplicacion: " + resultado);
    }

    private int multiplicacion(int gnA2, int gnB2) {
       
        if (gnA2 < 0 && gnB2 < 0) {
            return multiplicacion(-gnA2, -gnB2);
        } else if (gnA2 < 0) {
            return -multiplicacion(-gnA2, gnB2);
        } else if (gnB2 < 0) {
            return -multiplicacion(gnA2, -gnB2);
        }

      
        if (gnA2 == 0 || gnB2 == 0) {
            return 0;
        }

       
        if (gnB2 == 1) {
            return gnA2;
        }

        return gnA2 + multiplicacion(gnA2, gnB2 - 1);
    }
   
}

        
    

   
   
    

   
   

   
    

   

