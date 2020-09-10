package com.vn.strings;

public class BuildSQL {
	
	public static void main(String[] args) {
		String tableName = "Empl";
		String[] arrayColumn = {"a", "b", "c"};
		System.out.println(buildSQLSelect(tableName, arrayColumn));
	}

	private static String buildSQLSelect(String tableName, String[] arrayColumn) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT");
		int index = 0;
		for (String element : arrayColumn) {
			sql.append(" " + element);
			if(index < arrayColumn.length - 1)
				sql.append(',');
			index++;
		}
		sql.append(" FROM");
		sql.append(" tableName");
		return sql.toString();
	}
}
