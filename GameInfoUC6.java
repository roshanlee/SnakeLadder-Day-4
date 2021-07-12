import java.util.logging.Level;
import java.util.logging.Logger;

public class GameInfoUC6 {
	private final static Logger logger= Logger.getLogger("GameInfoUC6");
	public static void gameInfo(){
		ExactHundredUC5.exactWin();
		int dieCount=ExactHundredUC5.diceCount;
		logger.log(Level.INFO,"Number of Times Dice has been Rolled: "+String.valueOf(dieCount));
		
	}
}
