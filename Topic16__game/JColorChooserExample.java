package topic16_game;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JColorChooserExample extends JFrame implements ActionListener {
	JButton b;
	Container container;

	JColorChooserExample() {
		container = getContentPane();
		container.setLayout(new FlowLayout());

		b = new JButton("color");
		b.addActionListener(this);

		container.add(b);
	}

	public void actionPerformed(ActionEvent e) {
		Color initialcolor = Color.RED;
		Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
		container.setBackground(color);
	}

	public static void main(String[] args) {
		JColorChooserExample ch = new JColorChooserExample();
		ch.setSize(400, 400);
		ch.setVisible(true);
		ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
