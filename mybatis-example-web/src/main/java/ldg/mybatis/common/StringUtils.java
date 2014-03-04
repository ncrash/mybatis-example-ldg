package ldg.mybatis.common;

public class StringUtils {
	public static boolean isNotEmpty(String str) {
		if (str == null || str.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}
}
