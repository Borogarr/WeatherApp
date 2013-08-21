
import javax.swing.*;
import java.awt.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Weather");
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JButton button1 = new JButton("Testing");
		panel.add(button1);
		
		JButton button2 = new JButton("Opeth");
		panel.add(button2);
	}

}
