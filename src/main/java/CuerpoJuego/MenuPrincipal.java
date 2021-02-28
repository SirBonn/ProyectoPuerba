package CuerpoJuego;

import Objetos.Auto;
import Objetos.Jugador;
import Consola.DibujosAscii;
import Consola.Accion;
import java.util.Scanner;

public class MenuPrincipal {

    public static DibujosAscii dibujar = new DibujosAscii();
    public static Accion ejecutar = new Accion();
    public static Opcion opcionMenu = new Opcion();
    public static Scanner sc = new Scanner(System.in);

    public void menuPrincipal(Jugador jugadorregistrado, Auto auto) {
        String opcion;

        while (true) {

            ejecutar.limpiarPantalla();
            dibujar.textoMenuPrincipal();
            System.out.println("\t\n" + jugadorregistrado.mostrarDatos());
            dibujar.texto1Competir();
            dibujar.texto2Ruleta();
            dibujar.texto3Garage();
            dibujar.texto4Pistas();
            dibujar.texto5EstadYRepor();
            dibujar.texto6Salir();
            System.out.println("\nA donde quieres ir?: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    opcionMenu.competir(jugadorregistrado, auto);
                    break;
                case "2":
                    opcionMenu.ruleta(jugadorregistrado);
                    break;
                case "3":
                    opcionMenu.garage(jugadorregistrado, auto);
                    break;
                case "4":
                    opcionMenu.pistas(jugadorregistrado);
                    break;
                case "5":
                    opcionMenu.estadisticasYReportes(jugadorregistrado, auto);
                    break;
                case "6":
                    opcionMenu.salir();
                    break;
                default:
                    ejecutar.valorInvalido();

            }
        }
    }

}
