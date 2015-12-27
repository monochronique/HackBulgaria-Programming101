import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapToString {

	public static String toString(
			HashMap<? extends Object, ? extends Object> map) {
		String ans = "{ ";

		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry) it.next();
			ans += pair.getKey().toString() + ":" + pair.getValue().toString()
					+ ", ";
			it.remove();
		}
		ans = ans.substring(0, ans.length() - 2);

		return ans + " }";
	}

}
