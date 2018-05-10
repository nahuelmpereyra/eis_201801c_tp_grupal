package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanStepdefs {
    private Pacman pacman;
    private Comestible biscuit;
    private Comestible fruta;
    private Fantasma fantasma;
    private Pellet pellet;
    private Game game;


    @Given("^Un nuevo Pacman$")
    public void nuevoPacman() throws Throwable {
        pacman = new Pacman();
    }

    @Given("^Un biscuit$")
    public void nuevoBiscuit() throws Throwable {
        biscuit = new Biscuit();
    }

    @When("^Pacman come un biscuit$")
    public void pacmanComeUnBiscuit() {
        pacman.comer(biscuit);
    }

    @Then("^El pacman suma un punto$")
    public void pacmanSumaUnPunto() {
        assertThat(pacman.puntos).isEqualTo(1);
    }

    @Given("^Una fruta$")
    public void unaFruta() {
        fruta = new Fruta();
    }

    @When("^Pacman come una fruta$")
    public void pacmanComeUnaFruta() {
        pacman.comer(fruta);
    }

    @Then("^El pacman suma cinco puntos$")
    public void pacmanSumaCincoPuntos() { assertThat(pacman.puntos).isEqualTo(5);
    }
    
    @Given("^Un fantasma$")
    public void unFantasma() {
        fantasma= new Fantasma();
    }

    @When("^Pacman choca un fantasma$")
    public void pacmanChocaUnFantasma() {
        pacman.chocar(fantasma);
    }

    @Then("^El pacman muere$")
    public void elPacmanMuere() {
        assertThat(pacman.vida).isEqualTo(0);
    }

    @Given("^Un Pellet$")
    public void unPellet() { pellet = new Pellet(); }

    @Given("^Un juego nuevo$")
    public void unJuegoNuevo() {
        game = new Game();
        pacman.setGame(game);
    }

    @When("^Pacman come un Pellet$")
    public void pacmanComeUnPellet() { pacman.comer(pellet);}

    @Then("^Los fantasmas se debilitan$")
    public void losFantasmasSeDebilitan() {assertThat(pacman.game.fantasmasDebilitados()).isEqualTo(4);}

}

