package betaspring.nestedclass.mypractice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NestedInnerGui extends JFrame {

	private static final long serialVersionUID = 1L;

	public NestedInnerGui() {
		ActionListenerClass alc = new ActionListenerClass();

		JButton btn = new JButton("버튼1");
		btn.addActionListener(alc);

		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(alc);

		setLayout(new GridLayout(1, 2));
		add(btn);
		add(btn2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(200, 200, 600, 400);
		setTitle("NestedInnerGui");
	}

	public static void main(String[] args)
	{
		new NestedInnerGui();
	}

	class ActionListenerClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("안녕?");
		}
	}

}
