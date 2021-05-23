package SamplePackage;

	enum GAME_DIFFICULTY {
		EASY, MEDIUM, HARD
	}

	public class GameDifficulty {

		public static void main(String[] args) {
			GAME_DIFFICULTY variable = GAME_DIFFICULTY.EASY;

			switch (variable) {
			case EASY: {//EASY
				System.out.println("You have selected easy game");
				break;
			}
			case MEDIUM: {//MEDIUM
				System.out.println("You have selected medium game");
				break;
			}
			case HARD: {//HARD
				System.out.println("You have selected hard game");
				break;
			}
			}

			for(GAME_DIFFICULTY tempVariable: GAME_DIFFICULTY.values()) {
				System.out.println(tempVariable);
			}
		}

	}


