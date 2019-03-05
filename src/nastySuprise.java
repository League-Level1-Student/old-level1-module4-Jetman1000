import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class nastySuprise implements ActionListener {
	JFrame frame = new JFrame();
	JButton button2 = new JButton("Trick");
	JLabel label = new JLabel();
	JButton button = new JButton("Treat");
	JLabel label2 = new JLabel();
	JPanel panel = new JPanel();

	nastySuprise() {
		
		frame.add(panel);
		panel.add(button);
		panel.add(button2);

		button.addActionListener(this);

		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	

	public static void main(String[] args) {
		nastySuprise ns = new nastySuprise();
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		if(clicked==button) {
			showPictureFromTheInternet("https://gfnc1kn6pi-flywheel.netdna-ssl.com/wp-content/uploads/2018/06/best-food-for-pug-puppies-header.jpg");
		}
		if(clicked==button2) {
			showPictureFromTheInternet("http://i.imgur.com/uom12Y7.jpg");
		}
		
		
	}
}
