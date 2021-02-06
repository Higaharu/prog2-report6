package jp.ac.uryukyu.ie.e205741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class JankenTest  {
    @Test
    void mainTest(){
        int man = 0;
        int machine = 0;
        try {
			man = 1;
		} catch (InputMismatchException e) {
			System.out.println("数字を入力してください。");
			return;
		}
		if (3 < man || 1 > man) {
			// 1から3までの数字を入力しているかどうか判定
			System.out.println("1~3の間から選んでください。");
			return;
		}
		return;
    }
}
