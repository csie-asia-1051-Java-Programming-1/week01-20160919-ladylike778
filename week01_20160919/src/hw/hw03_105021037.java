package hw;
/*
 * Topic:請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class hw03_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		float a=scanner.nextInt();
		float b=scanner.nextInt();
		float c=scanner.nextInt();
		float d=scanner.nextInt();
		float e=scanner.nextInt();
		float f=scanner.nextInt();
		int q =Math.round(a);	
		int w =Math.round(b);
		int r =Math.round(c);
		int t =Math.round(e);
		int u =Math.round(d);
		int i =Math.round(f);
		int s =Math.min(q, w);
		int h =Math.min(r, t);
		int k =Math.min(u, i);
		int y =Math.min(s, h);
		int l =Math.min(h, k);
		int v =Math.min(y, l);
		System.out.print(v);
		

	}

}
