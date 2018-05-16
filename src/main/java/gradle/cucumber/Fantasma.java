package gradle.cucumber;

public class Fantasma {

    EstadoFantasma estado= new Vivo();

    public void debilitar(){
        estado = new Debilitado();
    }


    public void chocado(Pacman pacman) {

        estado.meChocaron(this, pacman);
    }
}
