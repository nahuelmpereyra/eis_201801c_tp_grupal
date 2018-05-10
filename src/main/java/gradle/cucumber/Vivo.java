package gradle.cucumber;

public class Vivo extends EstadoFantasma {
    @Override
    public boolean estaDebilitado(){
        return false;
    }

    @Override
    public boolean estaDigerido() {
        return false;
    }
}
