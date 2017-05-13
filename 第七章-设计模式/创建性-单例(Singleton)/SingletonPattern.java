package pattern.singleton;

/**
 * 单例模式
 * @author LuoAnDong
 *
 */
public class SingletonPattern {

	/**
	 * 开始创建对象
	 */
	private static SingletonPattern singleton = new SingletonPattern() ; 

	/**
	 * 禁止私有方法
	 */
	private SingletonPattern(){
	}
	
	/**
	 * 获取一个单例
	 * @return
	 */
	public SingletonPattern getInstance(){
		return singleton ; 
	}
	
}
