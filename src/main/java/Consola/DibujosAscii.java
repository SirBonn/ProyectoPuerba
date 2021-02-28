package Consola;

public class DibujosAscii {

    public int tamaño;
    public String[][] casillas;
    public String[] casilla1;
    //colores para las letras
    public final static String negro = "\u001b[30m";
    public final static String reset = "\u001b[0m";
    public final static String rojo = "\u001b[31m";
    public final static String verde = "\u001b[32m";
    public final static String azul = "\u001b[34m";
    public final static String magenta = "\u001b[35m";
    public final static String cyan = "\u001b[36m";
    public final static String blanco = "\u001b[37m";
    public final static String amarillo = "\u001b[33m";
    //colores para el fondo
    public final static String frojo = "\u001b[41m";
    public final static String fverde = "\u001b[42m";
    public final static String fazul = "\u001b[44m";
    public final static String fmagenta = "\u001b[45m";
    public final static String fcyan = "\u001b[46m";
    public final static String fblanco = "\u001b[47m";
    public final static String famarillo = "\u001b[43m";
    //mas colores hechos
    public final static String naranja = amarillo + rojo;
    public final static String cafe = azul + amarillo + rojo;

    public void fail() {
        System.out.println(rojo + "           ┌────────┐  ┌┐  ┌┐" + reset);
        System.out.println(rojo + "           │        │  │└┐┌┘│" + reset);
        System.out.println(rojo + " INVALIDO  │        │  └─┐┌─┘" + reset);
        System.out.println(rojo + " VUELVE A  │    X   └────┘│" + reset);
        System.out.println(rojo + "INTENTARLO │───┬┬┬┐       │" + reset);
        System.out.println(rojo + "           └───└┴┘────────┘\n" + reset);
    }

    public void mensajeBienvenido() {
        System.out.println(verde + "  ____    ___   _____   _   _  __     __  _____   _   _   ___   ____     ___ ");
        System.out.println(" | __ )  |_ _| | ____| | \\ | | \\ \\   / / | ____| | \\ | | |_ _| |  _ \\   / _ \\ ");
        System.out.println(" |  _ \\   | |  |  _|   |  \\| |  \\ \\ / /  |  _|   |  \\| |  | |  | | | | | | | |");
        System.out.println(" | |_) |  | |  | |___  | |\\  |   \\ V /   | |___  | |\\  |  | |  | |_| | | |_| |");
        System.out.println(" |____/  |___| |_____| |_| \\_|    \\_/    |_____| |_| \\_| |___| |____/   \\___/ " + reset);
    } //bienvenido

    public void gatoInsistente() {
        System.out.println(magenta + "──────▄▀▄─────▄▀▄");
        System.out.println("─────▄█░░▀▀▀▀▀░░█▄");
        System.out.println("─▄▄──█░░░░░░░░░░░█──▄▄");
        System.out.println("█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
        System.out.println(cyan + "==ACEPTA LOS TERMINOS==" + reset);

    }

    public void mensajeRegistro() {
        System.out.println(verde + "  ____    _____    ____   ___   ____    _____   ____     ___  ");
        System.out.println(" |  _ \\  | ____|  / ___| |_ _| / ___|  |_   _| |  _ \\   / _ \\ ");
        System.out.println(" | |_) | |  _|   | |  _   | |  \\___ \\    | |   | |_) | | | | |");
        System.out.println(" |  _ <  | |___  | |_| |  | |   ___) |   | |   |  _ <  | |_| |");
        System.out.println(" |_| \\_\\ |_____|  \\____| |___| |____/    |_|   |_| \\_\\  \\___/ ");
        System.out.println("                                                              " + reset);
    }

    public void selleccionAuto() {
        System.out.println(amarillo + "\t///////////////////////////////////////////////////////////////////" + reset);
        System.out.println(rojo + "\t ___  ____  __    ____   ___   ___  ____  _____  _  _    __   ");
        System.out.println("\t/ __)( ___)(  )  ( ___) / __) / __)(_  _)(  _  )( \\( )  /__\\  ");
        System.out.println("\t\\__ \\ )__)  )(__  )__) ( (__ ( (__  _)(_  )(_)(  )  (  /(__)\\ ");
        System.out.println("\t(___/(____)(____)(____) \\___) \\___)(____)(_____)(_)\\_)(__)(__)");
        System.out.println(" 	\t __  __  _  _      __    __  __  ____  _____ ");
        System.out.println("	\t(  )(  )( \\( )    /__\\  (  )(  )(_  _)(  _  )");
        System.out.println("	 \t )(__)(  )  (    /(__)\\  )(__)(   )(   )(_)( ");
        System.out.println("	\t(______)(_)\\_)  (__)(__)(______) (__) (_____)" + reset);
        System.out.println(amarillo + "\t///////////////////////////////////////////////////////////////////" + reset);
        System.out.println("\n\n\tAl iniciar la secion tienes como regalo uno de los siguientes autos: ");
    }

    public void bonoTxt() {
        System.out.println(magenta + "──▄███▀▄       " + verde + "BONIFICACION POR" + magenta + "       ▄▀███▄──");
        System.out.println(magenta + "──██████▀▀     " + verde + "INICIO DE SESION" + magenta + "     ▀▀██████──");
        System.out.println(magenta + "─████─█             ──▄▄▄              █─████─");
        System.out.println("─██▀█─█             ─█▄▀▄█             █─█▀██─");
        System.out.println("▀▀█▄▄█▀             ─▀███▀             ▀█▄▄█▀▀" + reset);
        System.out.println("\n\nPor inicio de sesion, se le han acreditado:\n\t\t 30 Gemas\n\t\t50 Monedas.");

    }

    public void textoMenuPrincipal() {
        System.out.println(cyan + "                 __  __   ______   _   _   _    _  ");
        System.out.println("                |  \\/  | |  ____| | \\ | | | |  | | ");
        System.out.println("                | \\  / | | |__    |  \\| | | |  | | ");
        System.out.println("                | |\\/| | |  __|   | . ` | | |  | | ");
        System.out.println("                | |  | | | |____  | |\\  | | |__| | ");
        System.out.println("                |_|  |_| |______| |_| \\_|  \\____/ ");
        System.out.println("  _____    _____    _____   _   _    _____   _____   _____               _       ");
        System.out.println(" |  __ \\  |  __ \\  |_   _| | \\ | |  / ____| |_   _| |  __ \\      /\\     | |      ");
        System.out.println(" | |__) | | |__) |   | |   |  \\| | | |        | |   | |__) |    /  \\    | |      ");
        System.out.println(" |  ___/  |  _  /    | |   | . ` | | |        | |   |  ___/    / /\\ \\   | |      ");
        System.out.println(" | |      | | \\ \\   _| |_  | |\\  | | |____   _| |_  | |       / ____ \\  | |____  ");
        System.out.println(" |_|      |_|  \\_\\ |_____| |_| \\_|  \\_____| |_____| |_|      /_/    \\_\\ |______| " + reset);
    }

    public void texto1Competir() {
        System.out.println(cyan + "      " + verde + "      _   _          _    _  ___  ___   _  ");
        System.out.println(cyan + "  /|  " + verde + "     /   / \\  |\\/|  |_)  |_   |    |   |_) ");
        System.out.println(cyan + "   |  o" + verde + "    \\_  \\_/  |  |  |    |_   |   _|_  | \\ " + reset);
    }

    public void texto2Ruleta() {
        System.out.println(cyan + "  _    " + magenta + "     _             _  ___       ");
        System.out.println(cyan + "   )   " + magenta + "    |_)  | |  |   |_   |    /\\  ");
        System.out.println(cyan + "  /_  o" + magenta + "    | \\  |_|  |_  |_   |   /--\\ " + reset);
    }

    public void textoPremios() {
        System.out.println(verde + "\t\t\t	   ┌──────────────────────────────────────────┐");
        System.out.println("\t\t\t	   │ ╔══════════════════════════════════════╗ │");
        System.out.println("\t\t\t	   │ ║" + amarillo + "  ▄▄▄▄  ▄▄▄▄  ▄▄▄▄ ▄   ▄ ▄ ▄▄▄▄ ▄▄▄▄  " + reset + verde + "║ │");
        System.out.println("\t\t\t	   │ ║" + amarillo + "  █   █ █   █ █    █▀▄▀█ █ █  █ █     " + reset + verde + "║ │");
        System.out.println("\t\t\t	   │ ║" + amarillo + "  █▀▀▀  ██▀▀  █▀▀▀ █   █ █ █  █ ▀▀▀█  " + reset + verde + "║ │");
        System.out.println("\t\t\t	   │ ║" + amarillo + "  █     █ ▀█  █▄▄▄ █   █ █ █▄▄█ ▄▄▄█  " + reset + verde + "║ │");
        System.out.println("\t\t\t	   │ ║                                      ║ │");
        System.out.println("\t\t\t	   │ ╚══════════════════════════════════════╝ │");
        System.out.println("\t\t\t	   └──────────────────────────────────────────┘");
        System.out.println(amarillo + "\t\t\t=================================================================" + reset);
        System.out.println(verde + "\t\t\t	┌────────────────────────────────────────────────┐");
        System.out.println("\t\t\t	│ ╔════════════════════════════════════════════╗ │");
        System.out.println("\t\t\t	│ ║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░║ │");
        System.out.println("\t\t\t	│ ║░░░░░░░░░░░"+magenta+"Costo del tiro 5 gemas"+verde+"░░░░░░░░░░░║ │");
        System.out.println("\t\t\t	│ ║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░║ │");
        System.out.println("\t\t\t	│ ║░░░" + amarillo + "· 40 GEMAS   " + verde + "░░░░░░░░░░░░" + amarillo + "·5 GEMAS     " + verde + "░░░║ │");
        System.out.println("\t\t\t	│ ║░░░" + amarillo + "· 75 MONEDAS " + verde + "░░░░░░░░░░░░" + amarillo + "·10 MONEDAS  " + verde + "░░░║ │");
        System.out.println("\t\t\t	│ ║░░░" + amarillo + "· 1000 GEMAS " + verde + "░░░░░░░░░░░░" + amarillo + "·2000 MONEDAS" + verde + "░░░║ │");
        System.out.println("\t\t\t	│ ║░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░║ │");
        System.out.println("\t\t\t	│ ╚════════════════════════════════════════════╝ │");
        System.out.println("\t\t\t	└────────────────────────────────────────────────┘" + reset);

    }

    public void premio40gemas() {
        System.out.println(verde + "\t\t\t╔════════════════════════╗");
        System.out.println("\t\t\t║░░░░░░░" + cyan + "HAZ GANADO" + verde + "░░░░░░░║");
        System.out.println("\t\t\t║░░░░░░░" + magenta + " 40 GEMAS " + verde + "░░░░░░░║");
        System.out.println("\t\t\t╚════════════════════════╝" + reset);
    }

    public void premio75monedas() {
        System.out.println(verde + "\t\t\t╔════════════════════════╗");
        System.out.println("\t\t\t║░░░░░░░" + cyan + "HAZ GANADO" + verde + "░░░░░░░║");
        System.out.println("\t\t\t║░░░░░░" + amarillo + " 75 MONEDAS" + verde + " ░░░░░░║");
        System.out.println("\t\t\t╚════════════════════════╝" + reset);
    }

    public void premio1000gemas() {
        System.out.println(verde + "\t\t\t╔════════════════════════╗");
        System.out.println("\t\t\t║░░░░░░░" + cyan + "HAZ GANADO" + verde + "░░░░░░░║");
        System.out.println("\t\t\t║░░░░░░" + magenta + " 1000 GEMAS " + verde + "░░░░░░║");
        System.out.println("\t\t\t╚════════════════════════╝" + reset);
    }

    public void premio5gemas() {
        System.out.println(verde + "\t\t\t╔════════════════════════╗");
        System.out.println("\t\t\t║░░░░░░░" + cyan + "HAZ GANADO" + verde + "░░░░░░░║");
        System.out.println("\t\t\t║░░░░░░░" + magenta + " 5 GEMAS  " + verde + "░░░░░░░║");
        System.out.println("\t\t\t╚════════════════════════╝" + reset);
    }

    public void premio10monedas() {
        System.err.println(verde + "\t\t\t╔════════════════════════╗");
        System.err.println("\t\t\t║░░░░░░░" + cyan + "HAZ GANADO" + verde + "░░░░░░░║");
        System.err.println("\t\t\t║░░░░░░" + amarillo + " 10 MONEDAS " + verde + "░░░░░░║");
        System.err.println("\t\t\t╚════════════════════════╝" + reset);
    }

    public void premio2000monedas() {
        System.err.println(verde + "\t\t\t╔════════════════════════╗");
        System.err.println("\t\t\t║░░░░░░░" + cyan + "HAZ GANADO" + verde + "░░░░░░░║");
        System.err.println("\t\t\t║░░░░░" + amarillo + " 2000 MONEDAS " + verde + "░░░░░║");
        System.err.println("\t\t\t╚════════════════════════╝" + reset);
    }

    public void texto3Garage() {
        System.out.println(cyan + "  _    " + amarillo + "     __         _          __   _ ");
        System.out.println(cyan + "  _)   " + amarillo + "    /__   /\\   |_)   /\\   /__  |_");
        System.out.println(cyan + "  _)  o" + amarillo + "    \\_|  /--\\  | \\  /--\\  \\_|  |_ " + reset);
    }

    public void texto4Pistas() {
        System.out.println(cyan + "       " + amarillo + "     _   ___   __  ___         __ ");
        System.out.println(cyan + " |_|_  " + amarillo + "    |_)   |   (_    |    /\\   (_  ");
        System.out.println(cyan + "   |  o" + amarillo + "    |    _|_  __)   |   /--\\  __) " + reset);
    }

    public void bordePista(int largo, String caracter) {  //borde

        casilla1 = new String[largo];
        int x = casilla1.length;
        for (int i = 0; i < x; i++) {
            System.out.print(caracter);
        }
    }

    public void pistaTierra() {
        tamaño = 80;
        casillas = new String[7][tamaño];
        int x = casillas.length;
        int y = casillas[0].length;  // Regresamos al espacio 0 con '[0]'

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(cafe + "▒" + reset + reset);
            }
            System.out.println("");
        }
    }

    public void pistaArena() {
        tamaño = 90;
        String[][] casillaare = new String[7][tamaño];
        int x = casillaare.length;
        int y = casillaare[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(fblanco + amarillo + "░" + reset);
            }
            System.out.println("");
        }
    }

    public void pistaConcreto() {
        tamaño = 100;
        String[][] casillasacon = new String[7][tamaño];
        int x = casillasacon.length;
        int y = casillasacon[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(fblanco + negro + "█" + reset + reset);
            }
            System.out.println("");
        }
    }

    public void texto5EstadYRepor() {
        System.out.println(cyan + "  _    " + amarillo + "     _   __  ___         _   ___   __  ___  ___   _         __            _    _   _    _    _    _  ___ __ ");
        System.out.println(cyan + " |_    " + amarillo + "    |_  (_    |    /\\   | \\   |   (_    |    |   /    /\\   (_     \\_/    |_)  |_  |_)  / \\  |_)  |  |_  (_  ");
        System.out.println(cyan + "  _)  o" + amarillo + "    |_  __)   |   /--\\  |_/  _|_  __)   |   _|_  \\_  /--\\  __)     |     | \\  |_  |    \\_/  | \\  |  |_  __) " + reset);
    }

    public void texto6Salir() {
        System.out.println(cyan + "  _    " + rojo + "     __            ___   _  ");
        System.out.println(cyan + " |_    " + rojo + "    (_    /\\   |    |   |_) ");
        System.out.println(cyan + " |_)  o" + rojo + "    __)  /--\\  |_  _|_  | \\ " + reset);
    }

    public void despedida() {
        System.out.println(rojo + "               AAA                DDDDDDDDDDDDD         IIIIIIIIII      OOOOOOOOO         SSSSSSSSSSSSSSS ");
        System.out.println("              A:::A               D::::::::::::DDD      I::::::::I    OO:::::::::OO     SS:::::::::::::::S");
        System.out.println("             A:::::A              D:::::::::::::::DD    I::::::::I  OO:::::::::::::OO  S:::::SSSSSS::::::S");
        System.out.println("            A:::::::A             DDD:::::DDDDD:::::D   II::::::II O:::::::OOO:::::::O S:::::S     SSSSSSS");
        System.out.println("           A:::::::::A              D:::::D    D:::::D    I::::I   O::::::O   O::::::O S:::::S            ");
        System.out.println("          A:::::A:::::A             D:::::D     D:::::D   I::::I   O:::::O     O:::::O S:::::S            ");
        System.out.println("         A:::::A A:::::A            D:::::D     D:::::D   I::::I   O:::::O     O:::::O  S::::SSSS         ");
        System.out.println("        A:::::A   A:::::A           D:::::D     D:::::D   I::::I   O:::::O     O:::::O   SS::::::SSSSS    ");
        System.out.println("       A:::::A     A:::::A          D:::::D     D:::::D   I::::I   O:::::O     O:::::O     SSS::::::::SS  ");
        System.out.println("      A:::::AAAAAAAAA:::::A         D:::::D     D:::::D   I::::I   O:::::O     O:::::O        SSSSSS::::S ");
        System.out.println("     A:::::::::::::::::::::A        D:::::D     D:::::D   I::::I   O:::::O     O:::::O             S:::::S");
        System.out.println("    A:::::AAAAAAAAAAAAA:::::A       D:::::D    D:::::D    I::::I   O::::::O   O::::::O             S:::::S");
        System.out.println("   A:::::A             A:::::A    DDD:::::DDDDD:::::D   II::::::II O:::::::OOO:::::::O SSSSSSS     S:::::S");
        System.out.println("  A:::::A               A:::::A   D:::::::::::::::DD    I::::::::I  OO:::::::::::::OO  S::::::SSSSSS:::::S");
        System.out.println(" A:::::A                 A:::::A  D::::::::::::DDD      I::::::::I    OO:::::::::OO    S:::::::::::::::SS ");
        System.out.println("AAAAAAA                   AAAAAAA DDDDDDDDDDDDD         IIIIIIIIII      OOOOOOOOO       SSSSSSSSSSSSSSS   " + reset);

    }

    public void menuCompraAutos() {

        System.out.println(cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░┌────────────────────────────────────────────────────────────┐░░░");
        System.out.println("░│╔══════════════════════════════════════════════════════════╗│░░░");
        System.out.println("░│║┌────────────────────────────────────────────────────────┐║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + magenta + "COSTOS" + cyan + "░░░░░│║│░░░");
        System.out.println("░│║│░░" + naranja + "1)·Honda Civic" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░" + verde + "Motor: Lineal de 4 cilindros" + cyan + "░░░░░░░░░░░░" + magenta + "50 gemas" + cyan + "░░░░│║│░░░");
        System.out.println("░│║│░░░░" + amarillo + "]|:=:-" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░" + naranja + "2)·Toyota Supra" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░" + verde + "Motor: Lineal de 6 cilindros" + cyan + "░░░░░░░░░░░░" + magenta + "60 gemas" + cyan + "░░░░│║│░░░");
        System.out.println("░│║│░░░░" + amarillo + "|]8-8>" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░" + naranja + "3)·Nissan 300zx" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░" + verde + "Motor: v6" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + magenta + "70 gemas" + cyan + "░░░░│║│░░░");
        System.out.println("░│║│░░░░" + amarillo + "|8=8>" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░" + naranja + "4)·Audi TT" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░" + verde + "Motor: Lineal de 4 cilindros" + cyan + "░░░░░░░░░░░░" + magenta + "80 gemas" + cyan + "░░░░│║│░░░");
        System.out.println("░│║│░░░░" + amarillo + "]:-:-" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░" + naranja + "5)·Mazda RX-8" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░" + verde + "Motor de 2 rotores" + cyan + "░░░░░░░░░░░░░░░░░░░░░░" + magenta + "90 gemas" + cyan + "░░░░│║│░░░");
        System.out.println("░│║│░░░░" + amarillo + "]8=:>" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░" + rojo + "0)·Regresar" + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║└────────────────────────────────────────────────────────┘║│░░░");
        System.out.println("░│╚══════════════════════════════════════════════════════════╝│░░░");
        System.out.println("░└────────────────────────────────────────────────────────────┘░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + reset);

    }

    public void menuMejoras() {

        System.out.println(cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░┌────────────────────────────────────────────────────────────┐░░░");
        System.out.println("░│╔══════════════════════════════════════════════════════════╗│░░░");
        System.out.println("░│║┌────────────────────────────────────────────────────────┐║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░" + naranja + "1) Mejorar acelaracion" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░" + naranja + "2) Mejorar Llantas" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░" + naranja + "3) Comprar gasolina" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░" + naranja + "4) Cambiar de color" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░" + rojo + "0) Cancelar y regresar" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║└────────────────────────────────────────────────────────┘║│░░░");
        System.out.println("░│╚══════════════════════════════════════════════════════════╝│░░░");
        System.out.println("░└────────────────────────────────────────────────────────────┘░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + reset);
    }

    public void nivelMejoras(String tipoPago, String costo1, String costo2, String costo3, String color) {
        System.out.println(cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░┌────────────────────────────────────────────────────────────┐░░░");
        System.out.println("░│╔══════════════════════════════════════════════════════════╗│░░░");
        System.out.println("░│║┌────────────────────────────────────────────────────────┐║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + color + tipoPago + cyan + "░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░" + naranja + "1) Mejora nivel bajo" + reset + cyan + "░░░░░░░░░░" + color + costo1 + cyan + "░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░" + naranja + "2) Mejora nivel medio" + reset + cyan + "░░░░░░░░░" + color + costo2 + cyan + "░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░" + naranja + "3) Mejora nivel alto" + reset + cyan + "░░░░░░░░░░" + color + costo3 + cyan + "░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░" + rojo + "0) Cancelar y regresar" + reset + cyan + "░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║└────────────────────────────────────────────────────────┘║│░░░");
        System.out.println("░│╚══════════════════════════════════════════════════════════╝│░░░");
        System.out.println("░└────────────────────────────────────────────────────────────┘░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + reset);

    }

    public void menuColores() {

        System.out.println(cyan + "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░┌─────────────────────────────────────────────────┐░░░");
        System.out.println("░│╔═══════════════════════════════════════════════╗│░░░");
        System.out.println("░│║┌─────────────────────────────────────────────┐║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░" + naranja + "1) Rojo     " + rojo + "█ " + cyan + "░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░" + naranja + "2) Azul     " + azul + "█ " + cyan + "░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░" + naranja + "3) Verde    " + verde + "█ " + cyan + "░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░" + naranja + "4) Amarillo " + amarillo + "█ " + cyan + "░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░" + rojo + "0) Cancelar y regresar" + reset + cyan + "░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░" + verde + "costo de la puntura:" + magenta + " 20 gemas" + cyan + "░░░░░░░░│║│░░░");
        System.out.println("░│║│░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░│║│░░░");
        System.out.println("░│║└─────────────────────────────────────────────┘║│░░░");
        System.out.println("░│╚═══════════════════════════════════════════════╝│░░░");
        System.out.println("░└─────────────────────────────────────────────────┘░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░" + reset);
    }

    public void gasolinera() {

        System.out.println(verde + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒" + rojo + "┌──────────────────────────┐" + verde + "▒");
        System.out.println("▒" + rojo + "│╔════════════════════════╗│" + verde + "▒");
        System.out.println("▒" + rojo + "│║┌──────────────────────┐║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░░░░░░░░░░░░░░░░░░░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░░" + amarillo + "███" + verde + "░░░" + amarillo + "███" + verde + "░░░" + amarillo + "█████" + verde + "░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░" + amarillo + "█" + verde + "░░░░░" + amarillo + "█" + verde + "░░░" + amarillo + "█" + verde + "░" + amarillo + "█" + verde + "░░░░░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░" + amarillo + "█" + verde + "░" + amarillo + "███" + verde + "░" + amarillo + "█" + verde + "░░░" + amarillo + "█" + verde + "░" + amarillo + "█████" + verde + "░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░" + amarillo + "█" + verde + "░░░" + amarillo + "█" + verde + "░" + amarillo + "█████" + verde + "░░░░░░" + amarillo + "█" + verde + "░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░" + amarillo + "████" + verde + "░░" + amarillo + "█" + verde + "░░░" + amarillo + "█" + verde + "░" + amarillo + "██████" + verde + "░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░░░░░░░░░░░░░░░░░░░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░░" + amarillo + "costo del galon:" + verde + "░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░░░░" + amarillo + "2.5 Monedas" + verde + "░░░░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║│" + verde + "░░░░░░░░░░░░░░░░░░░░░░" + rojo + "│║│" + verde + "▒");
        System.out.println("▒" + rojo + "│║└──────────────────────┘║│" + verde + "▒");
        System.out.println("▒" + rojo + "│╚════════════════════════╝│" + verde + "▒");
        System.out.println("▒" + rojo + "└──────────────────────────┘" + verde + "▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" + reset);

    }

}
