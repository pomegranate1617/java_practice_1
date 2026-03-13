package gpt;

public class A {
		void useB() {
			class B{
				int field1=1;
				//정적필드
				static int field2=2;
				B(){
					System.out.println("B-생성자 실행");
				}
				void method1() {
					System.out.println("B-method1실행");
				}
				//정적메서드
				static void method2() {
					System.out.println("B-method2실행");
				}
			}
			B b=new B();
			
			System.out.println(b.field1);
			b.method1();
			System.out.println(B.field2);
			B.method2();
		}
}
