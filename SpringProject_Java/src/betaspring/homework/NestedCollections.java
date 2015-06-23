package betaspring.homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class NestedCollections extends JFrame implements ActionListener{
	// 1번 2번 해당, 접근될 외부변수들 겸 Set, List 초기화
	List<String> list = Arrays.asList(new String[] { "교촌", "네네", "교촌", "통큰", "호식이두마리",
			"굽네", "호식이두마리" });
	Set<Integer> setLotto  = new TreeSet<Integer>(Arrays.asList(new Integer[]{1,2,3,5,8,10}));
	//외부 변수 확인할 것들
	private static String message = "저는 네스티드용 메시지입니다^^";
	private String msgInner = "저는 inner용 메시지입니다^^";
	JTextArea jta = new JTextArea();

	// 3-1 static nested
	static class IamNested implements OnemethodInterface {
		@Override
		public void showMsg(String msg)
		{
			// 3-5. 변수접근.  message는 static 변수이므로 외부로 접근 가능
			System.out.println("스태틱 메시지  :"+message);
			System.out.println("받은 메시지 :"+ msg);
			// 3-5. 변수접근. 인스턴스되야쓸 수 있는 msgInner는 static nested에서는 못 쓴다.
			// System.out.println(msgInner);
			
			
			
			
			
		}
	}

	// 3-2 inner class 
	class IamInner {
		public void innerShow()
		{
			NestedCollections.IamNested nested = new NestedCollections.IamNested();
			nested.showMsg("이너에서 보냄");
			// 3-5. 변수접근. 접근가능변수 확인. inner에서는 일반 변수접근
			System.out.println("이너에서는 접근가능한 일반 변수 :"+msgInner);
		}
	}

	public NestedCollections() {
		// 3-3 local class
		class LocalPanel extends JPanel {
			LocalPanel(ActionListener listener) {
				setBackground(Color.black);
				JButton btn = new JButton("Outer Class 메시지 출력!");
				// 3 -4 anonymous class 
				// 외부 변수에 접근함.
				btn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e)
					{
						System.out.println(msgInner + "와 "+ message);
					}
				});
				add(btn);

				// 3 -5 lambda expression
				JButton btn2 = new JButton("익명클래스로 외부 치킨변수 출력!");
				btn2.addActionListener(e -> System.out.println(list));
				add(btn2);
				
				JButton btn3 = new JButton("로또번호 생성");
				// 로컬클래스에서 바깥으로 그냥 이벤트 처리 던져보자~
				btn3.addActionListener(listener);
				add(btn3);
				setLayout(new GridLayout(1, 3));
			}
		}
		
		
		
		
		JPanel panel = new LocalPanel(this);
		add(panel, BorderLayout.SOUTH);
		// 3-6.메소드 1개짜리 해보기. local class
		JButton btnNorth = new JButton("메소드1개짜리 구현:Local");
		btnNorth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// 3-6.메소드 1개짜리 해보기 local class
				class LocalClass implements OnemethodInterface{
					@Override
					public void showMsg(String msg)
					{
						jta.setText("");
						jta.append(msg);
					}
				}
				OnemethodInterface one = new LocalClass();
				one.showMsg("저는 메소드 1개짜리 로컬입니다^^");
			}
		});
		add(btnNorth, BorderLayout.NORTH);
		// 3-6. 메소드1개짜리. anonymous class
		JButton btnNorthAnon = new JButton("메소드1개:익명");
		btnNorthAnon.addActionListener(e->{
			OnemethodInterface one = new OnemethodInterface() {
				@Override
				public void showMsg(String msg)
				{
					jta.setText("");
					jta.append(msg);
					
				}
			};
			one.showMsg("저는 메소드 1개 익명입니다^^");
		});
		add(btnNorthAnon, BorderLayout.NORTH);
		
		
		add(jta, BorderLayout.CENTER);
		
		// config Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 400, 300);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new NestedCollections();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		jta.setText("");
		jta.append(setLotto.toString());
	}


}
