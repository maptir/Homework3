import java.util.ArrayList;
import java.util.List;

public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List<String> unique(List<String> list) {
		if (list.size() == 1)
			return list;
		if (list.size() > 1) {
			if (!list.get(0).equals(list.get(1))) {
				return unique(list.subList(1, list.size()));
			} else {
				list.remove(0);
				return unique(list);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("a");
		a.add("b");
		a.add("b");
		a.add("b");
		a.add("c");
		a.add("b");
		a.add("c");
		a.add("c");
		for (String out : a)
			System.out.print(out);
		System.out.println("\n---------------");
		unique(a);
		for (String out : a)
			System.out.print(out);
	}
}
