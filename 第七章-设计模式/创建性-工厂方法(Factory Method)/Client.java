package pattern.method.factory;


public class Client {

	public static void main(String[] args) {
		LoggerIntr logger = new LoggerFactory().createLogger("file") ; 
		logger.writerLog();
		
		logger = new LoggerFactory().createLogger("database") ;
		logger.writerLog();
	}
	
}
