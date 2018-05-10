package gradle.cucumber;

public class Pacman {
    Integer puntos = 0;
    Integer vida= 1;
    Game game;

    public void comer(Comestible comestible) {
        puntos = puntos + comestible.getPuntos();
    }

    public void chocar(Fantasma fantasma){
        if(!fantasma.estado.estaDebilitado()) {
            vida=0;
        }
        else fantasma.estado = new Digerido();
    }


    public void comer(Pellet pellet) {game.debilitarFantasmas();}

    public void setGame(Game game) {
        this.game = game;
    }

}
