import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}
class C1_SortComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("APPLE");
		list.add("BOX");
		
		StrComp cmp = new StrComp();
		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
