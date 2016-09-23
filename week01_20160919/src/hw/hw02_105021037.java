package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class hw02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnn =new Scanner(System.in);
		System.out.println("請輸入數字");
		int n =scnn.nextInt();
		System.out.println((Math.random()*(n-1)+1));
		System.out.println((Math.random()*(n-1)+1));
		System.out.println((Math.random()*(n-1)+1));
		System.out.println((Math.random()*(n-1)+1));
		System.out.println((Math.random()*(n-1)+1));
		System.out.println((Math.random()*(n-1)+1));
		

	}

}
