package com.hulk.springboot.util;

import org.apache.log4j.Logger;

public class LogUtils {
	public final static <T> Logger getLogger(Class<T> clazz) {
		return Logger.getLogger(clazz);
	}
}
