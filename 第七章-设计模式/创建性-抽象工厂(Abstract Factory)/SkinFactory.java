package pattern.abstracts.factory;

/**
 * Ƥ������<br/>
 * ���ǽ�һЩ��صĲ�Ʒ���һ����Ʒ�壬��ͬһ��������ͳһ����<br/>
 * ���ǳ��󹤳�˼�����빤����������ؼ�֮����Ҫ��Ȼ��ʹ�ù���.
 * @author LuoAnDong
 *
 */
public interface SkinFactory {

	/**
	 * ������ť
	 * @return
	 */
	void createButton() ; 
	
	/**
	 * �����ı���
	 */
	void crateTextField() ; 
	
	/**
	 * ������ѡ��
	 */
	void crateComoBox() ;
	
}
