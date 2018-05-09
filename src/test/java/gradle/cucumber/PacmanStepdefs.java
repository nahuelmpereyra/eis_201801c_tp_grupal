package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanStepdefs {
    private Pacman pacman;
    private Comestible biscuit;
    private Comestible fruta;


    @Given("^Un nuevo Pacman$")
    public void nuevoPacman() throws Throwable {
        pacman = new Pacman();
    }

    @Given("^Un biscuit$")
    public void nuevoBiscuit() throws Throwable {
        biscuit = new Biscuit();
    }

    @Given("^Una Fruta$")
    public void nuevaFruta() throws Throwable {
        fruta = new Fruta();
    }


    @When("^Pacman come un biscuit$")
    public void pacmanComeUnBiscuit() {
        pacman.comer(biscuit);
    }

    @Then("^El pacman suma un punto$")
    public void pacmanSumaUnPunto() {
        assertThat(pacman.puntos).isEqualTo(1);
    }

    @When("^Pacman come una fruta^")
    public void pacmanComeUnaFruta() {pacman.comer(fruta);}

    @Then("^El pacman suma 5 puntos$")
    public void pacmanSuma5Puntos() { assertThat(pacman.puntos).isEqualTo(5);}
}

