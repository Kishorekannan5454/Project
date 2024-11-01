package com.example.ModelEcom.View;

import com.example.ModelEcom.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {



    List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"Moblie",15000),
            new Product(103,"Camera",12000),
        new Product(106,"Tv",20000),
        new Product(105,"Laptop",60000)
    ,new Product(107,"Air Coller",40000)));

    public List<Product> getproducts(){
        return products;
    }


    public Product getproductByid(int proid) {
        return products.stream().filter(p->p.getId() == proid).findFirst().orElse(new Product());

    }

    public void addproduct(Product prod){
        products.add(prod);
    }

    public void updateproduct(Product prod){
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getId()==prod.getId())
        index=i;
        products.set(index,prod);
    }

    public void deleteproduct(int proid) {
        int index=0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getId()==proid)
                index=i;
    products.remove(index);
    }
}

