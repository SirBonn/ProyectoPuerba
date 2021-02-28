package Consola;;
import java.util.Scanner;

public class Accion {
    Scanner sc = new Scanner(System.in);
    DibujosAscii dibujar = new DibujosAscii();
    public void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
    
    public void esperaEnter() {
        System.out.print("\n\nPulse enter para continuar.");
        String tmp = sc.nextLine();  //una variable temporal para poder continuar luego de recibirla
    }

    public void valorInvalido(){
        dibujar.fail();
        esperaEnter();
        limpiarPantalla();
    }
    
}
