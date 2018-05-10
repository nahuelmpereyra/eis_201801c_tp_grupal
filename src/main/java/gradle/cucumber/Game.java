package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Fantasma> fantasmas = new ArrayList<Fantasma>();

    public Game() {
        fantasmas.add(new Fantasma());
        fantasmas.add(new Fantasma());
        fantasmas.add(new Fantasma());
        fantasmas.add(new Fantasma());
    }

    public void debilitarFantasmas() {
        for (Fantasma f : fantasmas) {
            if (!f.estado.estaDigerido()) {
                f.debilitar();
            }
        }
    }

    public int fantasmasDebilitados() {
        int resultado = 0;
        for (Fantasma f : fantasmas)
            if (f.estado.estaDebilitado()) {
                resultado++;
            }
        return resultado;
    }


    public int fantasmasDigeridos() {
        int resultado = 0;
        for (Fantasma f : fantasmas)
            if (f.estado.estaDigerido()) {
                resultado++;
            }
        return resultado;
    }

}
