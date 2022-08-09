
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface1 i1=new ConcreteClass1();
		
		AbstractDemo ad=(AbstractDemo) i1;
		ConcreteClass1 cc=(ConcreteClass1) ad;
		cc.m1();
		cc.m2();
		cc.m3();
		cc.m4();
		cc.m5();
		cc.m6();

	}

}
