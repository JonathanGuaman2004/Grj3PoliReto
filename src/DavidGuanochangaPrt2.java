import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @autor: David Guanochanga
 * @version: 1.0
 */
public class DavidGuanochangaPrt2 {

    /**
     * Este método cuenta el número de consonantes en una frase.
     * 
     * @param frase La frase en la que se contarán las consonantes.
     */
    public void dgC02(String frase) {
        int dgcontador = 0;

        if (frase == null) {
            System.out.println("La frase no puede ser null.\n");
            return;
        }

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                dgcontador++;
            }
        }

        System.out.print("Frase: " + frase +
                "\nSalida: tiene " + dgcontador + " letras");

        System.out.println();
        System.out.println();
    }

    /**
     * Método que solicita al usuario ingresar anagramas de palabras.
     */
    public void dgC08() {
        Map<String, String> conjunto = new HashMap<>();
        conjunto.put("delira", "lidera");
        conjunto.put("Ballena", "llenaba");
        conjunto.put("Alondra", "Ladrona");
        conjunto.put("España", "apañes");
        conjunto.put("Enrique", "quieren");

        Random rand = new Random();
        Object[] keys = conjunto.keySet().toArray();
        String palabra = (String) keys[rand.nextInt(keys.length)];
        String anagramaCorrecto = conjunto.get(palabra).toLowerCase().replaceAll("\\s", "");

        if (anagramaCorrecto == null) {
            System.out.println("No se encontró un anagrama para la palabra seleccionada.\n");
            return;
        }

        System.out.println("Palabra: " + palabra);
        boolean acertado = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el anagrama: ");
            String respuesta = App.ingresoDatos.nextLine().toLowerCase().replaceAll("\\s", "");

            if (respuesta.equals(anagramaCorrecto)) {
                System.out.println("¡Correcto!");
                acertado = true;
                break;
            } else {
                System.out.println("Incorrecto, intente de nuevo.");
            }
        }

        if (!acertado) {
            System.out.println("Lo siento, la respuesta correcta era: " + anagramaCorrecto);
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Método que crea una matriz cuadrada del tamaño del primer nombre, con letras
     * aleatorias
     * de todos los nombres dados y marca con '*' las posiciones coincidentes.
     * 
     * @param nombres Nombres completos para llenar y marcar en la matriz.
     */
    public void dgA05() {
        String nombre;
        int longitudNombre;
        boolean inputValido = false;

        do {
            System.out.println("Ingrese su nombre completo (nombres y apellidos):");
            nombre = App.ingresoDatos.nextLine();
            longitudNombre = nombre.indexOf(' ');

            try {
                if (longitudNombre == 0)
                    throw new IllegalArgumentException("Por favor, no ingrese espacios antes del nombre");
                inputValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (longitudNombre == -1)
                System.out.println("No ingrese solamente un nombre");
        } while (longitudNombre == -1 || !inputValido);

        char[][] matriz = new char[longitudNombre][longitudNombre];

        // Inicialización de la matriz con espacios en blanco
        for (int i = 0; i < longitudNombre; i++) {
            for (int j = 0; j < longitudNombre; j++) {
                matriz[i][j] = ' ';
            }
        }

        matriz = insercionMatriz(nombre, longitudNombre, matriz);

        System.out.println("\nMatriz con cada letra de su nombre de forma aleatoria:\n");

        for (int i = 0; i < longitudNombre; i++) {
            for (int j = 0; j < longitudNombre; j++) {
                System.out.print(matriz[i][j] + "  ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Este método genera dos números aleatorios en un rango de la longitud del
     * nombre
     * 
     * @param max maximo numero que puede ser generado
     */
    private static int[] posAleatorias(int max) {
        Random random = new Random();
        int[] numeros = new int[2];

        numeros[0] = random.nextInt(max + 1);
        numeros[1] = random.nextInt(max + 1);

        return numeros;
    }

    /**
     * Este método inserta las letras del nombre ingresado aleatoriamente en la
     * matriz y coloca un asterisco (*) si la posición de dos letras coincide
     * 
     * @param nombre         nombre ingresado
     * @param longitudNombre número de caracteres del primer nombre
     * @param matriz[][]     matriz a rellenar
     */
    private static char[][] insercionMatriz(String nombre, int longitudNombre, char matriz[][]) {
        int arrayAleatorio[];

        for (int i = 0; i < nombre.length(); i++) {
            arrayAleatorio = posAleatorias(longitudNombre - 1);
            int fila = arrayAleatorio[0],
                    columna = arrayAleatorio[1];

            matriz[fila][columna] = matriz[fila][columna] == ' ' ? nombre.charAt(i) : '*';
        }

        return matriz;
    }

    /**
     * Este metodo genera la barra de loading 6
     */
    public void dgL06() {
        String flecha = "<=>";
        int size = 19;
        final int SLEEP = 80;
        String[] bordes = { "[", "]" };
        // Movimiento hacia la izquierda
        for (int i = 1; i < size; i++) {
            System.out.print(bordes[0]);
            espacioCrece(i);
            System.out.print(flecha);
            espacioDecrece(size - i);
            System.out.print(bordes[1] + "\r");
            // Delay
            try {
                delay(SLEEP);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Movimiento hacia la derecha
        for (int i = 1; i < size; i++) {
            System.out.print(bordes[0]);
            espacioCrece(size - i);
            System.out.print(flecha);
            espacioDecrece(i);
            System.out.print(bordes[1] + "\r");
            // Delay
            try {
                delay(SLEEP);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Espacio antes de la flecha
     */
    public void espacioCrece(int j) {
        for (int i = 1; i < j; i++)
            System.out.print(" ");
    }

    /**
     * Espacio despues de la flecha
     */
    public void espacioDecrece(int size) {
        for (int i = 1; i < size; i++)
            System.out.print(" ");
    }

    /**
     * Simular el delay
     */
    public void delay(int delay) throws InterruptedException {
        Thread.sleep(delay);
    }

    /**
     * Desplazar la figura a la derecha y regresar
     */
    public void dgL12() {
        int pasos = 19; // Número de pasos para desplazar
        int i, j;

        // Desplazamiento hacia la derecha
        for (i = 0; i < pasos; i++) {
            // Imprimir espacios en blanco para el desplazamiento
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   \\|||/");
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   (> <)");
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("ooO-(_)-Ooo");

            // Pausa para visualizar el movimiento
            pausa();

            // Limpiar la consola para el siguiente movimiento
            limpiarConsola();
            System.out.println();
            System.out.println();
        }

        // Regresar a la posición original
        for (i = pasos - 1; i >= 0; i--) {
            // Imprimir espacios en blanco para el desplazamiento
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   \\|||/");
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("   (> <)");
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("ooO-(_)-Ooo");

            // Pausa para visualizar el movimiento
            pausa();

            // Limpiar la consola para el siguiente movimiento
            limpiarConsola();
        }
    }

    // Método para pausar la ejecución y visualizar el movimiento
    public static void pausa() {
        try {
            Thread.sleep(200); // Pausa de medio segundo (500 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método para limpiar la consola (opcional, depende del entorno)
    public static void limpiarConsola() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Manejo de excepciones si no se puede limpiar la consola
            System.out.println("Error al intentar limpiar la consola.");
        }
    }
}