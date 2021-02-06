package jp.ac.uryukyu.ie.e205741;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * じゃんけんを表すクラス
 *
 */
public class Janken {
	/** じゃんけんの手 */
	public static final int ROCKS = 1;
	public static final int SCISSORS = 2;
	public static final int PAPER = 3;

	/** 人間が選んだ手 */
	private int man = 0;

	/** 乱数で選んだ手 */
	private int machine = 0;

	/**
	 * コンストラクタ
	 */
	public Janken() {
		Random random = new Random();
		this.machine = random.nextInt(3) + 1;
	}

	/**
	 * 引数が正しいかどうか判定するメソッド
	 * 
	 * @param args 標準入力
	 * @return true：正しい引数 false：誤った引数
	 */
	public boolean isParameter(String[] args) {
		System.out.println("*************************************");
		System.out.println("1:グー, 2:チョキ, 3:パー です。");
		System.out.println("1,2,3から1つ選んで入力してください。");
		System.out.println("*************************************");
		// 数字が入力されているかどうか判定
		try {
			Scanner scan = new Scanner(System.in);
			this.man = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("数字を入力してください。");
			return false;
		}
		if (PAPER < this.man || ROCKS > this.man) {
			// 1から3までの数字を入力しているかどうか判定
			System.out.println("1~3の間から選んでください。");
			return false;
		}
		return true;
	}

	/**
	 * 人間の手と乱数の手があいこかどうか判定するメソッド
	 * 
	 * @return true：あいこ false：あいこではない
	 */

	public boolean isDraw() {
		if (this.man == this.machine) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * あいこの時、何の手を出したかを表示するメソッド
	 */

	public void displayDraw() {
		if (this.man == ROCKS && this.machine == ROCKS) {
			System.out.println("私はグーを出しました。");
			System.out.println("相手はグーを出しました。");
		} else if (this.man == SCISSORS && this.machine == SCISSORS) {
			System.out.println("私はチョキを出しました。");
			System.out.println("相手はチョキを出しました。");
		} else if(this.man == PAPER && this.machine == PAPER){
			System.out.println("私はパーを出しました。");
			System.out.println("相手はパーを出しました。");
		}
		
		System.out.println("あいこでした。");
	}


	/**
	 * じゃんけんの勝敗を判定するメソッド
	 * 
	 * @return true：人間の勝ち false：乱数の勝ち
	 */
	public boolean isBattle() {
		if (this.man == ROCKS && this.machine == SCISSORS) {
			return true;
		} else if (this.man == SCISSORS && this.machine == PAPER) {
			return true;
		} else if (this.man == PAPER && this.machine == ROCKS) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 勝った時、何の手を出したかを表示するメソッド
	 */
	public void displayWin() {
		if (this.man == ROCKS ) {
			System.out.println("私はグーを出しました。");
			System.out.println("相手はチョキを出しました。");
		} else if (this.man == SCISSORS ) {
			System.out.println("私はチョキを出しました。");
			System.out.println("相手はパーを出しました。");
		} else if (this.man == PAPER ){
			System.out.println("私はパーを出しました。");
			System.out.println("相手はグーを出しました。");
		}

		System.out.println("あなたの勝ちです!");
	}

	/**
	 * 負けた時、何の手を出したかを表示するメソッド
	 */
	public void displayLose() {
		if (this.man == ROCKS) {
			System.out.println("私はグーを出しました。");
			System.out.println("相手はパーを出しました。");
		} else if (this.man == SCISSORS) {
			System.out.println("私はチョキを出しました。");
			System.out.println("相手はグーを出しました。");
		} else {
			System.out.println("私はパーを出しました。");
			System.out.println("相手はチョキを出しました。");
		}

		System.out.println("あなたの負けです...。");
	}
}