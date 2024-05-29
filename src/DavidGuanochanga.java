/*
 * Crea series numericas, caracteres y figuras
 * @autor:      David Guanochanga
 * @version:    1.0
 */
public class DavidGuanochanga {
/**
 * Creación de los getters y setters de las propiedades
 */
    private int dgnmrTerminos;
    private int dgnmrNiveles;
    public int getDgnmrTerminos() {
        return dgnmrTerminos;
    }

    public void setDgnmrTerminos(int dgnmrTerminos) {
        this.dgnmrTerminos = dgnmrTerminos;
    }

    public int getDgnmrNiveles() {
        return dgnmrNiveles;
    }

    public void setDgnmrNiveles(int dgnmrNiveles) {
        this.dgnmrNiveles = dgnmrNiveles;
    }

    /*
     * Este método imprime la serie utilizado un ciclo for: 0 1 1 2 3 5 8 13 ...
     */
    public void dgSN1(int dgnmrTerminos) {
        if (dgnmrTerminos > 0) {
            int dgtermino1 = 0;
            int dgtermino2 = 1;

            if (dgnmrTerminos >= 1) {
                System.out.print(dgtermino1);
            }
            if (dgnmrTerminos >= 2) {
                System.out.print(" " + dgtermino2);
            }

            int dgterminoSiguiente;
            for (int i = 3; i <= dgnmrTerminos; ++i) {
                dgterminoSiguiente = dgtermino1 + dgtermino2;
                System.out.print(" " + dgterminoSiguiente);

                dgtermino1 = dgtermino2;
                dgtermino2 = dgterminoSiguiente;
            }
        } else {
            System.out.println("El numero de terminos debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * Este método imprime la serie utilizado un ciclo for: 1 4 9 16 25 36 49 64 ...
     */
    public void dgSN6(int dgnmrTerminos) {
        if (dgnmrTerminos > 0) {
            for (int i = 1; i <= dgnmrTerminos; i++) {
                int dgcuadrado = i * i;
                System.out.print(dgcuadrado);
                if (i < dgnmrTerminos) {
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println("El numero de terminos debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * Este método imprime la cadena utilizado un ciclo for: \ | / - | \ | / - | \ |
     * / - | ...
     */
    public void dgSC5(int dgnmrTerminos) {
        if (dgnmrTerminos > 0) {
            String[] patron = { "\\", "|", "/", " -", " | " };

            for (int i = 0; i < dgnmrTerminos; i++) {
                System.out.print(patron[i % 5] + " ");
            }
        } else {
            System.out.println("El numero de terminos debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * Este método imprime la cadena utilizado un ciclo for: a bbb ccccc ddddddd
     * eeeeeeeee ...
     */
    public void dgSC8(int dgnmrTerminos) {
        if (dgnmrTerminos > 0) {
            char dgletra = 'a';
            int dgrepeticiones = 1;
            for (int i = 0; i < dgnmrTerminos; i++) {
                for (int j = 0; j < dgrepeticiones; j++) {
                    System.out.print(dgletra);
                }
                if (i < dgnmrTerminos - 1) {
                    System.out.print(" ");
                }
                dgletra++;
                dgrepeticiones += 2;
            }
        } else {
            System.out.println("El numero de terminos debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * Este método imprime la figura utilizado un ciclo for
     */
    public void dgSF5(int dgnmrNiveles) {
        if (dgnmrNiveles > 0) {
            int dgfilas;
            int dgnroCaracteres;
            int dgespacio;
            for (dgfilas = dgnmrNiveles; dgfilas > 0; dgfilas--) {
                for (dgespacio = dgnmrNiveles; dgespacio > dgfilas; dgespacio--) {
                    System.out.print(" ");
                }
                for (dgnroCaracteres = 0; dgnroCaracteres < dgfilas; dgnroCaracteres++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("El numero de niveles debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * Este método imprime la figura utilizado un ciclo for
     */
    public void dgSF11(int dgnmrNiveles) {
        if (dgnmrNiveles > 0) {
            for (int nivel = 1; nivel <= dgnmrNiveles; nivel++) {
                for (int espacios = 0; espacios < nivel * nivel - 1; espacios++)
                    System.out.print(" ");
                System.out.print("|");
                for (int base = 0; base < nivel; base++)
                    System.out.print(" _");
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("El numero de niveles debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }

    /*
     * Este método imprime la figura utilizado un ciclo for
     */
    public void dgSF17(int dgnmrNiveles) {
        if (dgnmrNiveles > 0) {
            int a = 1;

            for (int i = 1; i <= dgnmrNiveles; i++) {
                char dgsigno;

                if (a % 2 == 0) {
                    dgsigno = '0';
                } else {
                    dgsigno = '1';
                }
                for (int j = 1; j <= dgnmrNiveles; j++) {
                    if (j == i || j == (dgnmrNiveles - i + 1)) {
                        System.out.print(dgsigno + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                a++;
            }
            System.out.println();
        } else {
            System.out.println("El numero de niveles debe ser mayor que 0 !!!");
        }
        System.out.println();
        System.out.println();
    }
}
