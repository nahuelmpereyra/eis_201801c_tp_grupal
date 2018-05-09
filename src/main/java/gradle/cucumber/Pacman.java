package gradle.cucumber;

public class Pacman {
    Integer puntos = 0;

    public void comer(Comestible comestible) {
        puntos = puntos + comestible.getPuntos();
    }
}
