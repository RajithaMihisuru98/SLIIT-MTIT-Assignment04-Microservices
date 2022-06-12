package com.sliit.mtit.microservice.productservice.controller;

import com.sliit.mtit.microservice.productservice.dto.*;
import com.sliit.mtit.microservice.productservice.impl.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @PostMapping(consumes = "application/json", produces="application/json")
    public @ResponseBody ProductResponse productController(@RequestBody ProductRequest request){
        return productServiceImpl.GetProductData(request);
    }
}