package ejercicio2;

public class RevolverDeAgua {
///////////////////////////////Atributes///////////////////////////////////////

    private byte posicionActual;

    private byte posicionDelAgua;
/////////////////////////////////Constructors//////////////////////////////////

    public RevolverDeAgua(byte posicionActual, byte posicionDelAgua) {
        this.posicionActual = posicionActual;
        this.posicionDelAgua = posicionDelAgua;
    }

    public RevolverDeAgua() {
    }
/////////////////////////////////Getters and Setters///////////////////////////

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(byte posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDelAgua() {
        return posicionDelAgua;
    }

    public void setPosicionDelAgua(byte posicionDelAgua) {
        this.posicionDelAgua = posicionDelAgua;
    }

//////////////////////////////////////Methods//////////////////////////////////
    
    public void llenarRevolver() {
         this.posicionDelAgua = (byte)(Math.random()*6 + 1);
        this.posicionActual = (byte)(Math.random()*6 + 1);
    }

    public boolean mojar() {
        if (this.posicionActual == this.posicionDelAgua){
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro() {
        if (this.posicionActual == 6)
            this.posicionActual = 1;
        else 
            this.posicionActual++;
    }
    
    @Override
    public String toString() {
        return "Revolver[" + "Posicion actual: " + posicionActual + ", Posicion cargada: " + posicionDelAgua + ']';
    }
}
