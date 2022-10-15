import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'c', 'd', 'a', 'c', 'l', 'o','c' };
		HashMap<Character, Integer> obj =CharacterCount.countcharacter(a);
		System.out.println(obj);
	}
static HashMap<Character, Integer> countcharacter(char a[]) {

	HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
		for (char c : a) //for each loop
		{
			if (obj.containsKey(c)) {
				obj.put(c, obj.get(c) + 1);
			} else
				obj.put(c, 1);
		}
		return obj;
	}
}