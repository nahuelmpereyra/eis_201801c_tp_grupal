 Feature: Pacman

  Scenario: Pacman come un biscuit
    Given Un nuevo Pacman
    Given Un biscuit
    When Pacman come un biscuit
    Then El pacman suma un punto

  Scenario: Pacman come una fruta
    Given Un nuevo Pacman
    Given Una fruta
    When Pacman come una fruta
    Then El pacman suma cinco puntos


