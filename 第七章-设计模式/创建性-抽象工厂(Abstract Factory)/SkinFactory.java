package pattern.abstracts.factory;

/**
 * 皮肤工厂<br/>
 * 考虑将一些相关的产品组成一个产品族，由同一个工厂来统一生产<br/>
 * 这是抽象工厂思想上与工厂方法区别关键之处，要不然，使用工厂.
 * @author LuoAnDong
 *
 */
public interface SkinFactory {

	/**
	 * 创建按钮
	 * @return
	 */
	void createButton() ; 
	
	/**
	 * 创建文本域
	 */
	void crateTextField() ; 
	
	/**
	 * 创建多选框
	 */
	void crateComoBox() ;
	
}
