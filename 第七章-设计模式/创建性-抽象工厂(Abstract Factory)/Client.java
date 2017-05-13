package pattern.abstracts.factory;

import pattern.abstracts.factory.impl.SpringSkinFactory;
import pattern.abstracts.factory.impl.SummerSkinFactory;

/**
 * ¿Í»§¶Ë
 * @author LuoAnDong
 *
 */
public class Client {

	public static void main(String[] args) {
		SkinFactory skin = new SpringSkinFactory() ; 
		skin.createButton() ;
		
		skin = new SummerSkinFactory() ;
		skin.createButton() ;
	}
	
}
