import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class TwitterRobot {
	public static void main(String args[]) throws AWTException, InterruptedException {
		Scanner KBR = new Scanner(System.in);
		int x = 0;
		String S = new String();
		Haiku poem = new Haiku();
		Robot R = new Robot();
		Thread.sleep(5000);
		for (int poemcounter = 0; poemcounter < 1; poemcounter++) {
			for (int loop = 0; loop < 4; loop++) {
				S = poem.getLine(loop);
				S = S.toUpperCase();
				char[] word = new char[S.length()];
				for (int index = 0; index < S.length(); index++) {
					word[index] = S.charAt(index);
				}
				
			R.mouseMove(550, 450);

				for (int index = 0; index < S.length(); index++) {
					x = (int) word[index];
					if (x == '#') {
						R.keyPress(16);
						R.keyPress(51);
						R.keyRelease(16);
						R.keyRelease(51);
					} else if (x == 39) {
						R.keyPress(KeyEvent.VK_QUOTE);
						R.keyRelease(KeyEvent.VK_QUOTE);
					} else {
						R.keyPress((int) x);
						R.keyRelease((int) x);
					}
					Thread.sleep(100);
				}
				R.keyPress(KeyEvent.VK_ENTER);
				R.keyRelease(KeyEvent.VK_ENTER);
			}
			R.mouseMove(900, 600);
			Thread.sleep(1000);
			//R.mousePress(InputEvent.BUTTON1_MASK);
			//R.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	}
}
