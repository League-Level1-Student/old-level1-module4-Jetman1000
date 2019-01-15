import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class nastySuprise {
public static void main(String[] args) {
	JFrame frame= new JFrame();
	JButton button= new JButton();
	JLabel label= new JLabel();
	JButton button2= new JButton();
	JLabel label2= new JLabel();
	
	frame.add(button);
	frame.add(button2);
	button.add(label);
	button2.add(label2);
	label.setText("Trick");
	label2.setText("Treat");
	
	frame.pack();
	}
}
