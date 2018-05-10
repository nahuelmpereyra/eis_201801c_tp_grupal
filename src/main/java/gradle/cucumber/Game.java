package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Fantasma> fantasmas=new ArrayList<Fantasma>();

    public Game() {
        fantasmas.add(new Fantasma());
        fantasmas.add(new Fantasma());
        fantasmas.add(new Fantasma());
        fantasmas.add(new Fantasma());
    }

    public void debilitarFantasmas() {
        for (Fantasma f : fantasmas) {
            f.estaDebilitado = !f.estaDebilitado;
        }
    }

    public int fantasmasDebilitados() {
        int resultado = 0;
        for (Fantasma f : fantasmas)
            if (f.estaDebilitado) {
                resultado++;
            }
        return resultado;
    }
}
