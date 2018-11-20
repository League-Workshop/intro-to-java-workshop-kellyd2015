package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"

		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		String one = "Millennium";
		String two = "pharaoh";
		String three = "ecstasy";
		String four = "accommodate";
		String five = "cemetery";
		
		String answer;
		
		speak("spell " + one);
		answer = JOptionPane.showInputDialog(" ");
		if (answer.equalsIgnoreCase(one)) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}
		speak("spell " + two);
		answer = JOptionPane.showInputDialog(" ");
		if (answer.equalsIgnoreCase(two)) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}
		speak("spell " + three);
		answer = JOptionPane.showInputDialog(" ");
		if (answer.equalsIgnoreCase(three)) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}
		speak("spell " + four);
		answer = JOptionPane.showInputDialog(" ");
		if (answer.equalsIgnoreCase(four)) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}
		speak("spell " + five);
		answer = JOptionPane.showInputDialog(" ");
		if (answer.equalsIgnoreCase(five)) {
			JOptionPane.showMessageDialog(null, "correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}
		
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


