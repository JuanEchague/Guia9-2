package ejercicio2;

import java.util.ArrayList;

public class Juego {
/////////////////////////////Atributes////////////////////////////////////////

    private ArrayList<Jugador> jugadores;

    private RevolverDeAgua revolver;
/////////////////////////////Constructors/////////////////////////////////////

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }
//////////////////////////////Getters and Setters//////////////////////////////

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
///////////////////////////////Methods////////////////////////////////////////

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            System.out.println("Dispara el jugador " + jugador.getId() + "!");
            if (jugador.disparo(revolver)) {
                System.out.println("El jugador " + jugador.getId() + " se ha mojado!!");
                break;
            } else {
                System.out.println("El jugador " + jugador.getId() + " se ha salvado!!");
            }
        }
    }
}
