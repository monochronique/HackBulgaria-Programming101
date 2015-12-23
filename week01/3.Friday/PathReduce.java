
public class PathReduce {

	public static String reduce_file_path(String path) {
		String ans = "";
		String[] splittedPath = path.split("/");
		if (!path.matches("/[a-zA-Z_1-9_/_.]*")) {
			System.out.println("Invalid input");
			return "";
		}
		for (int i = 0; i < splittedPath.length; i++) {

			if (splittedPath[i].length() > 0 && !splittedPath[i].contains(".")) {
				ans += "/";
				ans += splittedPath[i];
			} else {
				if (i > 0 && splittedPath[i].contains("..") && ans.length() > 0) {
					ans = ans.substring(0, ans.lastIndexOf('/'));

				}
			}

		}

		if (ans.length() == 0)
			return "/";
		return ans;
	}

}
