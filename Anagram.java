public class Anagram {

	private static final int LETTER_COUNT = 26;

	public static int numberNeededForAnagram(String s1, String s2) {
		int[] charCountS1 = getCharCount(s1);
		int[] charCountS2 = getCharCount(s2);
		return getDelta(charCountS1, charCountS2);
	}

	private static int getDelta(int[] array1, int[] array2) {
		if (array1.length != array2.length)
			return -1;
		int delta = 0;
		for (int i = 0; i < array1.length; i++) {
			delta += Math.abs(array1[i] - array2[i]);
		}
		return delta;
	}

	private static int[] getCharCount(String s) {
		int[] charCount = new int[LETTER_COUNT];
		int offset = (int) 'a';
		for (int i = 0; i < s.length(); i++) {
			charCount[s.charAt(i) - offset]++;
		}
		return charCount;
	}

	public static void main(String[] args) {
		String s1= "hello";
		String s2="billion";
		System.out.println(numberNeededForAnagram(s1, s2));
	}

}
