
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TennisGame play = new TennisGame();
		//play.getScore();
		for(int i = 0; i<4; i++) {
			play.updateScore();
			System.out.println(play.getScore());
		}
	}

}
