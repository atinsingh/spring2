package co.pragra.learning.spring2.aop;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
    private Logger logger  = LoggerFactory.getLogger(LogginAspect.class);

    @Pointcut("execution( * co.pragra.learning.spring2.service.ProductService.addProduct(*))")
    public void printData(){
        logger.info("Called logger on execution of method add product");
    }

    @Before( "printData()")
    public void log(){
    }
}
