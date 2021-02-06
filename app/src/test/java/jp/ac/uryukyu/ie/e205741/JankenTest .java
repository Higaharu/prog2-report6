package jp.ac.uryukyu.ie.e205741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class JankenTest  {
    @Test
    void jankenTest(){
        int machine = 0;
		Random random = new Random();
		machine = random.nextInt(3) + 1;
		}
}
