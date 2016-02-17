import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;

public class UI extends Canvas {
	
	
	public UI(int width, int height, String title){
		
		JFrame window = new JFrame(title);
		
		window.setSize(new Dimension(width, height));
		window.setMinimumSize(new Dimension(0, 0));
		window.setMaximumSize(new Dimension(1000, 1000));
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		
		UI userWindow = new UI(500, 500, "Welcome to the Hotel Sam");
		
	}
}
