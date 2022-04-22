import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> numbers = new HashMap<String, String>();
		numbers.put("rohan sahu", "7007044054");
		numbers.put("ankit", "7007044051");
		numbers.put("shkhar", "7007044052");
		numbers.put("vineet", "7007044053");

		Set<String> names = numbers.keySet();
		for (String number : names) {
			System.out.println(number + "      " + numbers.get(number));
		}
		System.out.println();
		System.out.println("print in another way.....................");
		System.out.println();
		Set<Map.Entry<String, String>> values=numbers.entrySet();
		
		for(Map.Entry<String, String> e:values) {
			System.out.println(e.getKey()+"    "+e.getValue());
		}
	}
}
