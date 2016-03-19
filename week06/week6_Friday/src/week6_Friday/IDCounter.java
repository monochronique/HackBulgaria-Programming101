package week6_Friday;

import java.util.UUID;

public class IDCounter {

	private IDCounter() {
	}

	public static int getID() {
		UUID idOne = UUID.randomUUID();
		String str = "" + idOne;
		int uid = str.hashCode();
		String filterStr = "" + uid;
		str = filterStr.replaceAll("-", "");
		System.out.println(str);
		return Integer.parseInt(str);
	}

}
