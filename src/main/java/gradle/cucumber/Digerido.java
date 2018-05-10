package gradle.cucumber;

public class Digerido extends EstadoFantasma {
    @Override
    public boolean estaDebilitado(){
        return false;
    }
    @Override
    public boolean estaDigerido() {
        return true;
    }
}
