package com.vn.entities;

public class Generator {
	
	public static void main(String[] args) {
		String beforeCode = null;
		String prefix = "P";
		int uperUnit = 10;
		int length = 10;
		String charCode = "0";
		String newId1 = generateProductID(beforeCode,
				prefix, uperUnit, length, charCode);
		String newId2 = generateProductID(newId1 ,
				prefix, uperUnit, length, charCode);
		System.out.println(newId1);
		System.out.println(newId2);
	}

	private static String generateProductID(String beforeCode, String prefix, int uperUnit, int length, String charCode) {
		StringBuilder result = new StringBuilder(prefix);
		int base = 10;
		if(beforeCode !=null) {
			base = base + uperUnit;
		}
		//
		int totalCharSpace = length - String.valueOf(base).length() - prefix.length();
		for (int i = 0; i < totalCharSpace; i++) {
			result.append(charCode);
		}
		result.append(base);
		return result.toString();
	}

}
