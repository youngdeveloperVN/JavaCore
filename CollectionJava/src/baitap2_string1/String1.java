package baitap2_string1;

public class String1 {

	public static void main(String[] args) {
		String s = new String("BaiTap 1 (5) BaiTap a (7) (8)");
		System.out.println(sumNumber(s));

	}

	public static int sumNumber(String s) {
		String subStr1 = "(";
		String subStr2 = ")";
		int index1 = 0;
		int index2 = 0;
		int sum = 0;

		while (index1 != -1) {
			index1 = s.indexOf(subStr1, index1);
			if (index1 != -1) {
				index2 = s.indexOf(subStr2, index1);
				sum += Integer.valueOf(s.substring(index1 + 1, index2));

				index1 = index2;
			}
		}
		return sum;

	}
}
