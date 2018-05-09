package gradle.cucumber;

public class Pacman {
    Integer puntos = 0;
    Integer vida= 1;

    public void comer(Comestible comestible) {
        puntos = puntos + comestible.getPuntos();
    }

    public void chocar(Fantasma fantasma){
            vida=0;
        }
}
