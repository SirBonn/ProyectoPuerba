package cunoc_ipc_1_a.practic1ipca;

import Consola.Accion;
import CuerpoJuego.InicioJuego;
import Objetos.Jugador;
import Objetos.Auto;
import CuerpoJuego.MenuPrincipal;

public class Main_Practica1 {
    
    private static Accion ejecutar = new Accion();
    private static InicioJuego accion = new InicioJuego();
    private static MenuPrincipal menu = new MenuPrincipal();

    public static void main(String[] args) {
        
        ejecutar.limpiarPantalla();
        accion.terminosYCondiciones();
        Jugador j1 = accion.registrarse();
        Auto auto =accion.seleccionarAutoInicial();
        menu.menuPrincipal(j1 , auto);
    }



}
