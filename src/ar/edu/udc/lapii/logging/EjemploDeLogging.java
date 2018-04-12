package ar.edu.udc.lapii.logging;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class EjemploDeLogging {
	
    private static Logger logger = LogManager.getLogger(EjemploDeLogging.class);
    
    public void hacerAlgo(){
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
    
    
    public static void main(String[] args) {
		new EjemploDeLogging().hacerAlgo();
	}

}


