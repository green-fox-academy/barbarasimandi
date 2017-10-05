import java.util.ArrayList;

public class BoardCoordinates {
  int value;
  int[][] boardMap;
  Hero hero;
  ArrayList<Creature> monsters;

  public BoardCoordinates() {
    this.boardMap = new int[][] {
      {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
      {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
      {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
      {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
      {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
      {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
      {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
      {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
      {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
    };

  }

  public int getValue(int row, int col) {
    this.value = boardMap[row][col];
    return value;
  }

  public boolean isItAWall(int row, int col) {
    return (boardMap[row][col] == 1);
  }
}
