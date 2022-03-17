package suptech.miage.tp3.metier;

import suptech.miage.tp3.entities.Product;

import java.util.List;

public interface IProductMetier {
    Product addProduct(Product product) throws Exception;
    List<Product> getProducts() throws Exception;
}
