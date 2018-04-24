package topic16_game;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaTest {

	JFrame frame = new JFrame();
	JTextArea area;

	TextAreaTest() {
		area = new JTextArea();

		area = new JTextArea(300, 300);
		area.setBounds(10, 30, 300, 300);

		area.setBackground(Color.black);
		area.setForeground(Color.white);

		frame.add(area);

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaTest();
	}
}
