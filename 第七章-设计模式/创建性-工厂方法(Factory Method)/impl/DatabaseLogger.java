package pattern.method.factory.impl;

import pattern.method.factory.LoggerIntr;

/**
 * 数据库日志
 * @author LuoAnDong
 *
 */
public class DatabaseLogger implements LoggerIntr {

	@Override
	public void writerLog() {
		System.out.println("数据库日志.");
	}

}
