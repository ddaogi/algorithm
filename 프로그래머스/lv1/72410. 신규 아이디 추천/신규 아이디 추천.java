class Solution {
    public static String solution(String new_id) {

		// 1. UpperCase -> LowerCase
		new_id = new_id.toLowerCase();

		// 2단게 only contains lowercase, digit, (-,.,_)
		String pattern = "[^a-z|\\-|.|_|\\d]";

		new_id = new_id.replaceAll(pattern, "");
		System.out.println(new_id);
		// 
		while (new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		// 4단계

		if (!new_id.isEmpty()) {
			// 앞에있는 . 제거
			if (new_id.charAt(0) == '.') {
				new_id = new_id.substring(1, new_id.length());
			}
		}
		// 뒤에 있는 . 제거
		if (!new_id.isEmpty()) {
			if (new_id.charAt(new_id.length() - 1) == '.') {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}		
		// 5
		if (new_id.length() == 0)
			new_id = "a";
		// 6
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
			if (new_id.charAt(new_id.length() - 1) == '.') {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}
		// 7

		if (new_id.length() <= 2) {
			while (new_id.length() < 3) {
				new_id = new_id + new_id.charAt(new_id.length() - 1);
			}
		}
		System.out.println(new_id);
		return new_id;
	}
}