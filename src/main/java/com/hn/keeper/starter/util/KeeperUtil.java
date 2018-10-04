package com.hn.keeper.starter.util;

import java.lang.reflect.Field;

public class KeeperUtil {

	public static String[] decode(String transformer) throws Exception {
		if (transformer == null) {
			throw new Exception("throw axception here !");
		}
		return transformer.split(";");
	}
	
	public static String getFieldValueOfObject(Object payload, String fieldName) {
		try {
			Field field = payload.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
			return (String) field.get(payload);
		} catch (Exception e) {
			return null;
		}
	}
}
