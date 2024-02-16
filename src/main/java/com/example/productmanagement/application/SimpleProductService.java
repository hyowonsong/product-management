package com.example.productmanagement.application;

import com.example.productmanagement.domain.Product;
import com.example.productmanagement.infrastructure.ListProductRepository;
import com.example.productmanagement.presentation.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProductService {

    private ListProductRepository listProductRepository;

    @Autowired
    SimpleProductService(ListProductRepository listProductRepository){
        this.listProductRepository = listProductRepository;
    }

    public ProductDto add(ProductDto productDto){
        Product product = ;
    }
}
