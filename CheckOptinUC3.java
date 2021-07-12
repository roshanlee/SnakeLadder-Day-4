
public class CheckOptinUC3 {


	public  static int optin(){
		int random=(int)(Math.random()*10)%3;
		int start=0;
		switch(random){
			case 0:
			break;
			case 1:
				start=start+StartRollingUC2.startRolling();
				break;
			case 2	:
				int temp=start-StartRollingUC2.startRolling();
				if(temp<0){
					start=0;
				}
				else{
					start=temp;
				}
				break;
		
	} 
		return start;
}
}
