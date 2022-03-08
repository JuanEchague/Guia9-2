package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author dark_
 */
public class Main {

    public static void main(String[] args) {
  
        ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 1; i < 7; i++) {
            jugadores.add(new Jugador((byte) i));
        }
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }

}
