package ejercicio2;

public class Jugador {
///////////////////////////////Atributes//////////////////////////////////////

    private byte id;

    private String nombre;

    private boolean mojado;
/////////////////////////////////Constructors//////////////////////////////////

    public Jugador(byte id) {
        this.id = id;
        this.nombre = "Jugador: " + id;
        this.mojado = false;
    }

    public Jugador() {
        mojado=false;
    }
///////////////////////////////////Getters and Setters//////////////////////////

    public int getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
///////////////////////////////////Methods////////////////////////////////////

    public boolean disparo(RevolverDeAgua revolver) {
  if (revolver.mojar()){
            this.mojado = true;
            return true;
        } else{
            revolver.siguienteChorro();
            return false;
        }
    }
}
