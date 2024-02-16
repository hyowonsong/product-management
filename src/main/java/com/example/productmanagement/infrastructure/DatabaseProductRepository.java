package com.example.productmanagement.infrastructure;

import com.example.productmanagement.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseProductRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseProductRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public Product add(Product product){
        jdbcTemplate
                .update("INSERT INTO products (name,price,amount) Values (?,?,?)",
                        product.getPrice(),product.getPrice(),product.getAmount());
        return product;
    }

}
