package com.hn.keeper.starter.util;

public class KeeperUtil {

	public static String[] decode(String transformer) throws Exception {
		if (transformer == null) {
			return null;
			// throw new Exception("throw axception here !");
		}
		return transformer.split(";");
	}
}
