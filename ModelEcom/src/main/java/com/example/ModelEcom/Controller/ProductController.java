package com.example.ModelEcom.Controller;


import com.example.ModelEcom.Model.Product;
import com.example.ModelEcom.View.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts(){
        return service.getproducts();
    }

    @GetMapping("/products/{proid}")
    public Product getproductByid(@PathVariable int proid){
        return service.getproductByid(proid);
    }

    @PostMapping("/products")
    public void addproduct(@RequestBody Product prod){
        service.addproduct(prod);
    }

    @PutMapping("/products")
    public void updateproduct(@RequestBody Product prod){
        service.updateproduct(prod);
    }

    @DeleteMapping("/products/{proid}")
    public void deleteproduct(@PathVariable int proid){
        service.deleteproduct(proid);
    }



}
