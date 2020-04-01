package co.pragra.learning.spring2.service;

import co.pragra.learning.spring2.domain.Instructor;
import co.pragra.learning.spring2.domain.Product;
import co.pragra.learning.spring2.mapper.InstructorRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private JdbcTemplate template;

    public ProductService(JdbcTemplate template) {
        this.template = template;
    }

    public Product addProduct(Product product){
        return product;
    }

    public void queryData(){

        Instructor instructor = template.queryForObject("select * from table_instructor", new InstructorRowMapper());
        System.out.println(instructor);
    }
}
