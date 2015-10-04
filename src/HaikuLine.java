
public class HaikuLine {
	String line = "";

	HaikuLine(int l) {
		int count = 0;
		String randomWord = "";
		Dictionary diction = new Dictionary();
		while (count < l) {
			randomWord = diction.randomWord();
			if (count + count(randomWord) <= l) {
				line += (randomWord + " ");
				count += count(randomWord);
			}
		}
	}

	public static int count(String s) {
		int count = 0;
		for (int index = 0; index < s.length(); index++) {
			if(index==s.length()-1 && index>1 &&((s.charAt(index)== 'e' 
					&& (s.charAt(index - 2) == 'i' 
					|| s.charAt(index - 2) == 'a' 
					|| s.charAt(index - 2) == 'e' 
					|| s.charAt(index - 2) == 'o' 
					|| s.charAt(index - 2) == 'u' 
					|| s.charAt(index - 2) == 'y')) 
					|| ((s.charAt(index)== 'a' 
					&& (s.charAt(index - 2) == 'i' 
					|| s.charAt(index - 2) == 'a' 
					|| s.charAt(index - 2) == 'e' 
					|| s.charAt(index - 2) == 'o' 
					|| s.charAt(index - 2) == 'u' 
					|| s.charAt(index - 2) == 'y')))))
{
				break;
			}
			if (s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o'
					|| s.charAt(index) == 'u' || s.charAt(index) == 'y') {
				count++;
				if (index < s.length()-1 && (s.charAt(index+1) == 'a' || s.charAt(index+1) == 'e' || s.charAt(index+1) == 'i' || s.charAt(index+1) == 'o'
						|| s.charAt(index+1) == 'u' || s.charAt(index+1) == 'y')) {
					index++;
				}
			}
		}
		return count;
	}

	public String getLine() {
		return line;
	}
}
