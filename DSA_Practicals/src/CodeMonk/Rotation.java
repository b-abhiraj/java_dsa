package CodeMonk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Rotation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testNums = Integer.parseInt(br.readLine());
		for (int i = 0; i < testNums; i++) {
			String[] in1 = br.readLine().trim().split("\\s+");
			int arrLen = Integer.parseInt(in1[0]);
			int arrRotation = Integer.parseInt(in1[1]);
			arrRotation %= arrLen;
			LinkedList<String> al1 = new LinkedList<String>(Arrays.asList(br.readLine().trim().split("\\s+")));
			List<String> rotated = new ArrayList<>(arrLen);
			rotated.addAll(al1.subList((arrLen - arrRotation), arrLen));
			rotated.addAll(al1.subList(0, (arrLen - arrRotation)));
			StringBuilder sb = new StringBuilder();
			for (String s : rotated) {
				sb.append(s).append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}