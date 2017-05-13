package pattern.method.factory;

import pattern.method.factory.impl.DatabaseLogger;
import pattern.method.factory.impl.FileLogger;

/**
 * 日志工厂
 * @author LuoAnDong
 *
 */
public class LoggerFactory {

	LoggerIntr createLogger(String type){
		if(type.equals("file")){
			return new FileLogger() ; 
		}else if(type.equals("database")){
			return new DatabaseLogger() ; 
		}
		return null ; 
	}
	
}
