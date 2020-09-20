package baitap3_string2;

import java.util.ArrayList;
import java.util.List;

public class SubString {

	public static void main(String[] args) {
		SubString sb = new SubString();
		String s = new String("Nam quoc son ha Nam de cu Nam Nam");
		sb.getSubString(s, "Nam");
	}

	public void getSubString(String string, String subString) {
		int count = 0;
		int lastIndex = 0;
		List<Integer> indexs = new ArrayList<Integer>();

		while (lastIndex != -1) {
			lastIndex = string.indexOf(subString, lastIndex);
			if (lastIndex != -1) {
				count++;
				indexs.add(lastIndex);
				lastIndex += subString.length();
			}
		}
		System.out.println("So luong chuoi con: " + count);
		System.out.println("Vi tri bat dau: ");
		for (Integer e : indexs) {
			System.out.print(e + "  ");
		}
		System.out.println();
	}
}
