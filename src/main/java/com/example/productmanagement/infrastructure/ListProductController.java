package com.example.productmanagement.infrastructure;

import com.example.productmanagement.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class ListProductController {

    private List<Product>  products = new CopyOnWriteArrayList<>();

    public Product add(Product product){
        products.add(product);
        return product;
    }
}
