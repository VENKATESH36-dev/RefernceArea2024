package test1;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuringIpAddress {

	public static void main(String[] args) {
		String[] str = {
	            "10.0.0.1 bytes=32 time=50ms TTL=63",
	            "10.0.0.2 bytes=32 time=50ms TTL=73",
	            "10.0.0.4 bytes=32 time=50ms TTL=83",
	            "10.0.0.2 bytes=32 time=50ms TTL=93"
	        };
		String result = findMaxOccurringIP(str);
		System.out.println("The Ip Address that occurs the most is:: " + result);
	}

	public static boolean isValidIpAddress(String str) {

		String[] arr = str.split("\\.");
		if (arr.length != 4) {
			return false;
		}
		for (String part : arr) {
			try {
				int num = Integer.parseInt(part);
				if (num < 0 || num > 255) {
					return false;

				}
			} catch (NumberFormatException ex) {
				return false;
			}
		}
		return true;
	}

	public static String findMaxOccurringIP(String[] str) {
		Map<String, Integer> ipCount = new HashMap<String, Integer>();

		String maxIp = "";
		int maxCount = 0;

		for (String log : str) {
			String ip = log.split(" ")[0];
			if (isValidIpAddress(ip)) {
				ipCount.put(ip, ipCount.getOrDefault(ip, 0) + 1);

				if (ipCount.get(ip) > maxCount) {
					maxCount = ipCount.get(ip);
					maxIp = ip;
				}
			}
		}

		return maxIp;
	}
}
