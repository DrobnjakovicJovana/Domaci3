/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Manufacturer;
import domain.Product;
import domain.User;
import java.util.List;
import storage.StorageMemoryManufacturer;
import storage.StorageMemoryProduct;
import storage.StorageMemoryUser;
import ui.form.FMain;
import ui.form.FProduct;
import ui.form.ModeForm;

/**
 *
 * @author student1
 */
public class Controller {

    private static Controller instance;
    private final StorageMemoryUser storageMemoryUser;
    private final StorageMemoryProduct storageMemoryProduct;
    private final StorageMemoryManufacturer storageMemoryManufacturer;

    private Controller() {
        storageMemoryUser = new StorageMemoryUser();
        storageMemoryProduct = new StorageMemoryProduct();
        storageMemoryManufacturer = new StorageMemoryManufacturer();
    }
    public static Controller getInstance(){
        if(instance==null) instance=new Controller();
        return instance;
    }
    
    public void login(String username,String password){
        
    }

    public List<Manufacturer> getAllManufacturers() {
        return storageMemoryManufacturer.getAll();
    }

    public void saveProduct(Product product) {
        storageMemoryProduct.save(product);
    }

    public List<Product> getAllProducts() {
        return storageMemoryProduct.getAll();
    }

    public Product getProductByID(long id) throws Exception {
        return storageMemoryProduct.getProductID(id);
    }

    public void setProduct(Product p) {
        storageMemoryProduct.setProduct(p);
    }

    public User getUser(String username, String password) throws Exception {
       return storageMemoryUser.getUser(username,password);
    }


    
   
}
