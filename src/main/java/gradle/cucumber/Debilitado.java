package gradle.cucumber;

public class Debilitado extends EstadoFantasma {
    @Override
    protected boolean estaDebilitado() {
        return true;
    }
    @Override
    public boolean estaDigerido() {
        return false;
    }

    @Override
    public void meChocaron(Fantasma fantasma, Pacman pacman) {
        fantasma.estado = new Digerido();
    }


}
