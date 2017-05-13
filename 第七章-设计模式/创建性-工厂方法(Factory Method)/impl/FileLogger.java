package pattern.method.factory.impl;

import pattern.method.factory.LoggerIntr;

/**
 * �ļ���־
 * @author LuoAnDong
 *
 */
public class FileLogger implements LoggerIntr {

	@Override
	public void writerLog() {
		System.out.println("�ļ���־.");
	}

}
