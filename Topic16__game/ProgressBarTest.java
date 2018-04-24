package topic16_game;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarTest extends JFrame{

	JProgressBar jb;
	ProgressBarTest(){
		jb = new JProgressBar(0, 2000);
		jb.setBounds(40, 40, 200, 30);

		jb.setValue(0);
		jb.setStringPainted(true);

		add(jb);
		setSize(400, 400);
		setLayout(null);	
		setVisible(true);
		
	}
	int i = 0, num = 0;

	public void iterate() {
		while (i <= 2000) {
			jb.setValue(i);
			i = i + 20;
			try {
				Thread.sleep(150);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		ProgressBarTest x = new ProgressBarTest();
		x.iterate();
	}
}
