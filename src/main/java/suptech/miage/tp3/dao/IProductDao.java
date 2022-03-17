package suptech.miage.tp3.dao;

import suptech.miage.tp3.entities.Product;

import java.util.List;

public interface IProductDao {
    Product addProduct(Product product) throws Exception;
    List<Product> getProducts() throws Exception;
}
