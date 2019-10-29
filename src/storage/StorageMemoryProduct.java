/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.Product;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author student1
 */
public class StorageMemoryProduct {

    private final List<Product> products;

    public StorageMemoryProduct() {
        products = new LinkedList<>();
    }

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> getAll() {
        return products;
    }

    public Product getProductID(long id) throws Exception {
        for (Product product : products) {
            if(id==product.getId())
                return product;
        }
        throw new Exception();
    }

    public void setProduct(Product p)  {
       
        for (Product product : products) {
            if(p.getId().equals(product.getId())){
                product = p;
            break;
            }
        }
        
    }

}
