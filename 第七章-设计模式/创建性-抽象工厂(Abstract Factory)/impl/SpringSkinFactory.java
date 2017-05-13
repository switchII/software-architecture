package pattern.abstracts.factory.impl;

import pattern.abstracts.factory.SkinFactory;

/**
 * ÂÌÉ«×é¼þ 
 * @author LuoAnDong
 *
 */
public class SpringSkinFactory implements SkinFactory {

	@Override
	public void createButton() {
		System.out.println("spring button"); 
	}

	@Override
	public void crateTextField() {
		System.out.println("spring textField");
	}

	@Override
	public void crateComoBox() {
		System.out.println("spring combobox");
	}
	
}
