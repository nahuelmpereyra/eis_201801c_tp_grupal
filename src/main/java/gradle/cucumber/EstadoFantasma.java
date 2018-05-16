package gradle.cucumber;

public abstract class EstadoFantasma {

    protected abstract boolean estaDebilitado();
    protected abstract boolean estaDigerido();


    public abstract void meChocaron(Fantasma fantasma, Pacman pacman);
}
