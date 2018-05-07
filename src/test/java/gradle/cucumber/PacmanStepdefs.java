package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanStepdefs {
    private Pacman pacman;
    private Biscuit biscuit;

    @Given("^Un nuevo Pacman$")
    public void nuevoPacman() throws Throwable{
        pacman = new Pacman();
    }

    @Given("^Un biscuit$")
    public void nuevoBiscuit() throws Throwable{
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
}
