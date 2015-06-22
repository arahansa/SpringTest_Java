package betaspring.nestedclass.mypractice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NestedAnonymousGui extends JFrame {

	private static final long serialVersionUID = 1L;

	public NestedAnonymousGui() {
		
		// anonymous class
		JButton button = new JButton("버튼");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("헬로?");
			}
		});
		
		// lambda expression 1 
		JButton button2 = new JButton("람다버튼");
		ActionListener l = (e) -> { System.out.println("람다버튼 헬로?!");};
		button2.addActionListener(l);
		
		// lambda expression 2 
		JButton button3 = new JButton("람다버튼 카와이");
		button3.addActionListener((e)->{System.out.println("람다 버튼 카와이~");});
		
		add(button);
		add(button2);
		add(button3);
		
		
		setLayout(new GridLayout(1, 3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(200, 200, 600, 400);
		setTitle("NestedAnonymousGui");
	}

	public static void main(String[] args)
	{
		new NestedAnonymousGui();
	}

}
