package HackerRank_DSA;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		SimpleDateFormat format12 = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat format24 = new SimpleDateFormat("HH:mm:ss");

		try {
			Date date = format12.parse(s);
			String time24 = format24.format(date);
			System.out.println(time24);
		} catch (Exception e) {
			System.out.println();
		}
		sc.close();
	}

}
