import java.util.logging.Level;
import java.util.logging.Logger;

public class ExactHundredUC5 {
	 static int position;
	 static int diceCount=1;
	private final static Logger logger= Logger.getLogger("ExactHundredUC5");
	public static void exactWin(){
		position=CheckOptinUC3.optin();

		while(position<=100){
			logger.log(Level.INFO,String.valueOf(position));
			int prev=CheckOptinUC3.optin();
			position+=prev;
			if(position>100){
				position=position-prev;
			}
			else if(position==100){
				logger.log(Level.INFO,String.valueOf(position));
				diceCount++;
				break;
			}
			diceCount++;
	}
		logger.log(Level.INFO, "Game Over!! You Won!!");

		}
	
}
