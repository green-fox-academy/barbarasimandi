public class TennisGame1 implements TennisGame {

  private final Player playerOne;
  private final Player playerTwo;

  public TennisGame1(String player1, String player2) {
    this.playerOne = new Player(player1);
    this.playerTwo = new Player(player2);
  }

  public void addPoint(String playerName) {
    Player player = getPlayer(playerName);
    int points = player.getPoints();
    player.setPoints(points + 1);
  }

  public String getScore() {

    String gameScore = "";
    if (arePointsEqual(playerOne, playerTwo)) {
      if (playerOne.getPoints() < 4) {
        gameScore = getScoreFromPoints(playerOne).concat("-All");
      } else {
        gameScore = "Deuce";
      }
    }

    else if (!arePointsEqual(playerOne, playerTwo)) {
      if (getWinnerName(playerOne, playerTwo).equals("nobody") && getAdvantagedPlayerName(playerOne, playerTwo).equals("nobody")) {
        gameScore = getScoreFromPoints(playerOne) + "-" + getScoreFromPoints(playerTwo);
      } else if (!getWinnerName(playerOne, playerTwo).equals("nobody")) {
        gameScore = getWinnerName(playerOne, playerTwo);
      } else {
        gameScore = getAdvantagedPlayerName(playerOne, playerTwo);
      }

    }
    return gameScore;
  }

  public String getScoreFromPoints(Player player) {
    String playerScore = "";
    int points = player.getPoints();
    if (points == 0) {
      playerScore = "Love";
    } else if (points == 1) {
      playerScore = "Fifteen";
    } else if (points == 2) {
      playerScore = "Thirty";
    } else if (points == 3) {
      playerScore = "Forty";
    }
    return playerScore;
  }

  public boolean arePointsEqual(Player player1, Player player2) {
    return player1.getPoints() == player2.getPoints();
  }

  public String getWinnerName(Player player1, Player player2) {
    if (player1.getPoints() > 3 && player1.getPoints() - player2.getPoints() > 1) {
      return "Win for " + player1.getName();
    } else if (player2.getPoints() > 3 && player2.getPoints() - player1.getPoints() > 1) {
      return "Win for " + player2.getName();
    }
    return "nobody";
  }

  public String getAdvantagedPlayerName(Player player1, Player player2) {
    if (player1.getPoints() > 3 && player1.getPoints() - player2.getPoints() == 1) {
      return "Advantage " + player1.getName();
    } else if (player2.getPoints() > 3 && player2.getPoints() - player1.getPoints() == 1) {
      return "Advantage " + player2.getName();
    }
    return "nobody";
  }

  public Player getPlayer(String playerName) {
    if (playerOne.getName().equals(playerName)) {
      return playerOne;
    } else {
      return playerTwo;
    }
  }
}