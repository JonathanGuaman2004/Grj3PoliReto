public class GuamanJonathan {
    public static void jgSN1(int jgTamano) {
        if (jgTamano<0){
            System.out.println();
            System.out.println("SN1:.....................");
            System.out.println();
        }else if (jgTamano<2) {
            System.out.println();
            System.out.print("SN1: 0 ");
            System.out.println();
            System.out.println();
            
        }else{
            int jgPrim=0;
            int jgSeg=1;
            System.out.println("");
            System.out.print("SN1: ");
            System.out.print("0 ");
            System.out.print("1 ");
            for(int jgRep=0;jgRep<jgTamano-2;jgRep++){
                int suma=jgPrim+jgSeg;
                System.out.print(suma+" ");
                jgPrim=jgSeg;
                jgSeg=suma;
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
