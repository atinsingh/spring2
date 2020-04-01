package co.pragra.learning.spring2;

import co.pragra.learning.spring2.domain.Product;
import co.pragra.learning.spring2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Spring2Application {


    public static void main(String[] args) {
      ApplicationContext context =  SpringApplication.run(Spring2Application.class, args);
        ProductService service = context.getBean("productService", ProductService.class);


        service.queryData();


    }

}

