package pattern.abstracts.factory.impl;

import pattern.abstracts.factory.SkinFactory;

/**
 * 其它组件
 * @author LuoAnDong
 *
 */
public class SummerSkinFactory implements SkinFactory {

	@Override
	public void createButton() {
		System.out.println("summer button");
	}

	@Override
	public void crateTextField() {
		System.out.println("summer textField");
	}

	@Override
	public void crateComoBox() {
		System.out.println("summer combobox");
	}

	
}
