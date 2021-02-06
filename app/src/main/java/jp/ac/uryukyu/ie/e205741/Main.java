package jp.ac.uryukyu.ie.e205741;

public class Main {
	public static void main(String[] args) {
		Janken scissorsPaperRock = new Janken();
		//引数が1,2,3出ない場合,繰り返す
		while (!scissorsPaperRock.isParameter(args)) {
			System.out.println("もう一度行います。");
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