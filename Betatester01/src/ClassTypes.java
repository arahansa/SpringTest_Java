
public class ClassTypes {
	// nested class
	String name;
	static String sname;
	
	// inner class
	class IC {
		void m() {
			name = "A";
		}
	}
	
	void method() {
		IC ic = new IC();
		SC sc = new SC();
		
		// local class
		class LC implements I {
			public void m(int a) {
				name = "A" + a;
			}
		}
		I lc = new LC();
		lc.m(10);
		
		// anonymous class
		I ac = new I() {
			public void m(int a) {
				name = "A" + a;
			}
		};
		ac.m(10);
		
		// lambda expression
		I ld = (a) -> {			
			name = "A" + a; 
		};  
		ld.m(10);
	}
	
	static void smethod() {
		SC sc = new SC();
//		IC ic = new IC();
	}
	
	@FunctionalInterface
	interface I {
		void m(int a);
	}
	
	static class SC {
		void m() {
//			name = "A";
		}
	}
}
