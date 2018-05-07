package gradle.cucumber;

public class Pacman {
    Integer puntos = 0;

    public void comer(Biscuit biscuit) {
        puntos+=biscuit.puntos;
    }
}
