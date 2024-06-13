
import java.util.Scanner;

/**Es el lugar en el que se desarrollan todos los metodos creados por el equipo de trabajo
 * @author Gualoto.Erick,Gualpa.Nayeli,Guaman.Jonathan,Guanochanga.David,Hernandez.Lizeth,Zambrano.Jhojan
 * @version 1.0
 */
public class App {
	public static Scanner ingresoDatos = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		//variables
		Observador obs = new Observador();
		obs.selecionarOpc();
	}
}