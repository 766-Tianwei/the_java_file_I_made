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
		Circle c1 = new Circle (0.0) ;			//在此输入圆的半径
		Square s1 = new Square (0,0) ;			//在此输入矩形的长和宽，第一个参数为宽，第二个参数为长
		System.out.println ("圆面积是" + c1.get_S()) ;		
		System.out.println ("圆周长是" + c1.get_C()) ;
		System.out.println ("矩形面积是" + s1.get_S()) ;
		System.out.println ("矩形周长是" + s1.get_C()) ;
	}

}
