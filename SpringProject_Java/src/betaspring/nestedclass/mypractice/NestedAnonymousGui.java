package betaspring.nestedclass.mypractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NestedAnonymousGui extends JFrame {

	private static final long serialVersionUID = 1L;

	public NestedAnonymousGui() {
		JButton button = new JButton("버튼");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("헬로?");
			}
		});
		add(button);

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
