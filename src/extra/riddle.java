package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class riddle implements ActionListener {
	
	JFrame frame=new JFrame();
	JLabel label=new JLabel("What can point in every direction but can't reach the destination by itself?");
	JButton button=new JButton("submit");
	JButton button2=new JButton("hint");
	JTextField text=new JTextField(5);
	JPanel panel=new JPanel();
	riddle(){
		frame.add(panel);
		panel.add(label);
		panel.add(text);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

	}
public static void main(String[] args) {
	riddle question=new riddle();
	
			
}
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

if(e.equals(button)) {
	System.out.println("1");
	if(e.equals(button2)) {
		System.out.println("1");
}
}
}
