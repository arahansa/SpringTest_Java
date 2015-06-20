package betaspring.nestedclass.nonstatic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingHelloWorld extends JFrame {
	
	public SwingHelloWorld() {
		JButton button = new JButton("헬로월드");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("헬로월드");
				
			}
		});
		add(button);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args)
	{
		new SwingHelloWorld();
	}

}
