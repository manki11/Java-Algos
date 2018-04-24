package topic16_game;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest {

	JFrame frame;
	TableTest(){
		frame = new JFrame();

		String data[][] = { { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, 
				{ "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, { "101", "Amit", "670000" }, 
				{ "102", "Jai", "780000" }, 
				{ "101", "Sachin", "700000" }
				};
		String column[] = { "ID", "NAME", "SALARY" };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		frame.add(sp);

		frame.setSize(300, 400);
		// f.setLayout(null);
		frame.setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new TableTest();
	}
	
}
