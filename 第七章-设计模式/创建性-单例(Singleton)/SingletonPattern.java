package pattern.singleton;

/**
 * ����ģʽ
 * @author LuoAnDong
 *
 */
public class SingletonPattern {

	/**
	 * ��ʼ��������
	 */
	private static SingletonPattern singleton = new SingletonPattern() ; 

	/**
	 * ��ֹ˽�з���
	 */
	private SingletonPattern(){
	}
	
	/**
	 * ��ȡһ������
	 * @return
	 */
	public SingletonPattern getInstance(){
		return singleton ; 
	}
	
}
