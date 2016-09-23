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
		System.out.println("請輸入6個數");
		float a=scanner.nextFloat();int q =Math.round(a);
		float b=scanner.nextFloat();int w =Math.round(b);
		float c=scanner.nextFloat();int r =Math.round(c);
		float d=scanner.nextFloat();int t =Math.round(d);
		float e=scanner.nextFloat();int u =Math.round(e);
		float f=scanner.nextFloat();int i =Math.round(f);
		int s =Math.min(q, w);
		int h =Math.min(r, t);
		int k =Math.min(u, i);
		int y =Math.min(s, h);
		int l =Math.min(h, k);
		int v =Math.min(y, l);
		System.out.print("最小值="+v);
		

	}

}
