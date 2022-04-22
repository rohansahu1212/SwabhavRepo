import java.util.HashSet;

import com.monocept.model.LineItem;

public class HashTest {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("rohan");


	System.out.println(set.hashCode());
	System.out.println(set.size());
	System.out.println(set);
}
}
