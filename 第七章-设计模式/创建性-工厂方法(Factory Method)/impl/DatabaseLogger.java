package pattern.method.factory.impl;

import pattern.method.factory.LoggerIntr;

/**
 * ���ݿ���־
 * @author LuoAnDong
 *
 */
public class DatabaseLogger implements LoggerIntr {

	@Override
	public void writerLog() {
		System.out.println("���ݿ���־.");
	}

}
