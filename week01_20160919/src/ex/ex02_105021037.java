package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021037 林建宏
 */
import java.util.Scanner;
public class ex02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		float kg = scanner.nextInt();
		double p = kg / 0.45359;
		System.out.print(p+"磅");

	}

}
