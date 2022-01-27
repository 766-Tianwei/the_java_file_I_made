package calculations;
	abstract class shapes {
		public abstract double get_S () ;
		public abstract double get_C () ;
	}
	class Circle extends shapes {
		double r ;
		public Circle (double r) {
			this.r = r ;
		}
		@Override
		public double get_S() {
			// TODO Auto-generated method stub
			return r*r*Math.PI;
		}
		@Override
		public double get_C() {
			// TODO Auto-generated method stub
			return 2*r*Math.PI;
		}

	}
	class Square extends shapes {
		int width ; 
		int high ;
		public Square (int width , int high) {
			this.high = high ; 
			this.width = width ;
		}
		@Override
		public double get_S() {
			// TODO Auto-generated method stub
			return high*width;
		}
		@Override
		public double get_C() {
			// TODO Auto-generated method stub
			return 2*(high+width);
		} 
		
	}
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle (0.0) ;			//�ڴ�����Բ�İ뾶
		Square s1 = new Square (0,0) ;			//�ڴ�������εĳ��Ϳ���һ������Ϊ���ڶ�������Ϊ��
		System.out.println ("Բ�����" + c1.get_S()) ;		
		System.out.println ("Բ�ܳ���" + c1.get_C()) ;
		System.out.println ("���������" + s1.get_S()) ;
		System.out.println ("�����ܳ���" + s1.get_C()) ;
	}

}
