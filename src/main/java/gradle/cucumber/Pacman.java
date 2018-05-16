package gradle.cucumber;

public class Pacman {
    Integer puntos = 0;
    Integer vida= 1;
    Game game;

    public void comer(Comestible comestible) {puntos = puntos + comestible.getPuntos();}

    public void chocar(Fantasma fantasma){fantasma.chocado(this);}

    public void comer(Pellet pellet) {game.debilitarFantasmas();}

    public void setGame(Game game) {
        this.game = game;
    }

    public void morir() {this.vida = 0;}
}
