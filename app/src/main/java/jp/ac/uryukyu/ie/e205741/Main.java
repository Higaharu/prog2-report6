package jp.ac.uryukyu.ie.e205741;

public class Main {
	public static void main(String[] args) {
		Janken scissorsPaperRock = new Janken();

		// 引数が正しいかどうか判定
		if (!scissorsPaperRock.isParameter(args)) {
			return;
		}

		// あいこかどうか判定
		if (scissorsPaperRock.isDraw()) {
			scissorsPaperRock.displayDraw();
			return;
		}
		// 勝敗を判定
		if (scissorsPaperRock.isBattle()) {
			scissorsPaperRock.displayWin();
		} else {
			scissorsPaperRock.displayLose();
		}

	}
}