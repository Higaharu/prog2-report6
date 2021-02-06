package jp.ac.uryukyu.ie.e205741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class JankenTest  {
    @Test
    public static void main(String[] args) {
		int i = 0;
		int winCount = 0;
		int drawCount = 0;
		int loseCount = 0;
	for (i = 0; i < 2; i++) {
		Janken scissorsPaperRock = new Janken();
		// 引数が1,2,3出ない場合,繰り返す
		while (!scissorsPaperRock.isParameter(args)) {
			System.out.println("もう一度行います。");
		}
		// あいこかどうか判定
		// あいこでない場合、勝敗を判定
		if (scissorsPaperRock.isDraw()) {
			scissorsPaperRock.displayDraw();
			drawCount += 1;
		} else if (scissorsPaperRock.isBattle()) {
			scissorsPaperRock.displayWin();
			winCount += 1;
		} else {
			scissorsPaperRock.displayLose();
			loseCount += 1;
		}
	}
	System.out.println(i+"戦した結果、"+winCount+"勝"+loseCount+"敗"+drawCount+"分でした！");

	/**
	 * 入力1回目：2　私はチョキを出しました。相手は◯◯を出しました。あなたの◯◯ですorあいこでした
	 * 入力2回目：a  数字を入力してください。もう一度行います。
	 * 入力3回目：9　1~3の間から選んでください。もう一度行います。
	 * 入力4回目：1　私はグーを出しました。相手は◯◯を出しました。あなたの◯◯ですorあいこでした
	 * 
	 * 実行結果：2戦した結果、◯勝◯敗◯分でした！
	 */
}
}
