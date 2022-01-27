package calculations;

import java.util.*;

	abstract class shapes {
		public abstract double get_S (double r , int high ,int width) ;
		public abstract double get_C (double r , int high ,int width) ;
	}
	class Circle extends shapes {

		@Override
		public double get_S(double r, int high, int width) {
			// TODO Auto-generated method stub
			return r*r*Math.PI;
		}

		@Override
		public double get_C(double r, int high, int width) {
			// TODO Auto-generated method stub
			return r*2*Math.PI;
		}
		
	}
	class Square extends shapes {

		@Override
		public double get_S(double r, int high, int width) {
			// TODO Auto-generated method stub
			return high * width;
		}

		@Override
		public double get_C(double r, int high, int width) {
			// TODO Auto-generated method stub
			return 2*(width+high);
		}
		
	}
public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("=====================================");
		System.out.println("$  This program is made by TIANWEI  $");
		System.out.println("$  for reference only, for learning $");
		System.out.println("$     purposes. and may not be      $");
		System.out.println("$   commercialized,misappropriated  $");
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("$    This app can calculate the     $");
		System.out.println("$   radius and area of rectangles   $");
		System.out.println("$   and circles,you just need to    $");
		System.out.println("$ enter them as long, wide and high!$");
		System.out.println("=====================================");
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle () ;
		Square s1 = new Square () ;
		double r = 0 ;		//从此输入圆的半径
		int w = 0 ;				//从此输入矩形的宽
		int h = 0 ;				//从此输入矩形的高
		System.out.println("enter the Length:");
		String q = sc.nextLine();
		h = Integer.parseInt (q) ;
		System.out.println("enter the Height:");
		String u = sc.nextLine();
		w = Integer.parseInt (u) ;
		System.out.println("enter the Radius:");
		String l = sc.nextLine();
		r = Integer.parseInt (l) ;
		System.out.println ("The circular area is：" + c1.get_S(r, h, w)) ;
		System.out.println ("The circular circumference is：" + c1.get_C(r, h, w)) ;
		System.out.println ("The rectangular area is：" + s1.get_S (r, h, w)) ;
		System.out.println ("The rectangle perimeter is：" + s1.get_C(r, h, w)) ;
		while (true) {
		Thread.currentThread().sleep(10000);
		}
	}

}
