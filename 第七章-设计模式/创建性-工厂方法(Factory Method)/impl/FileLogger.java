package pattern.method.factory.impl;

import pattern.method.factory.LoggerIntr;

/**
 * 文件日志
 * @author LuoAnDong
 *
 */
public class FileLogger implements LoggerIntr {

	@Override
	public void writerLog() {
		System.out.println("文件日志.");
	}

}
