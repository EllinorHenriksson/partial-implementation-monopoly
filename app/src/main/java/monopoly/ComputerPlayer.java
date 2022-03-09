package monopoly;

import java.util.Random;

/**
 * Represents a computer player and offers human interaction via ConsoleUi.
 */
public class ComputerPlayer extends Player {
  private Random rand = new Random();
  /**
   * Creates a new ComputerPlayer.
   *
   * @param startTile The tile the player should start on.
   * @param name The name of the player.
   * @param ui The user interface that the player uses to send messages.
   */
  @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "EI_EXPOSE_REP2", 
        justification = "The tile objects are shared between all player and the board.")
  public ComputerPlayer(Tile startTile, String name, ConsoleUi ui) {
    super(startTile, name, ui);
  }

  /**
   * Handles the interaction (output) when it is the computer player's turn to perform some actions.
   */
  public boolean yourTurn(Dice d1, Dice d2) {
    ConsoleUi.Action a = ConsoleUi.Action.ROLL;
    if (rand.nextInt(2) == 1) {
      a = ConsoleUi.Action.BUY;
    }
    this.setAction(a);
    return super.yourTurn(d1, d2);
  }
}
