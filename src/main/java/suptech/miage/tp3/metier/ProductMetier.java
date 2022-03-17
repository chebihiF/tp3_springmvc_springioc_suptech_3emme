package suptech.miage.tp3.metier;

import suptech.miage.tp3.dao.IProductDao;
import suptech.miage.tp3.entities.Product;

import java.util.List;

public class ProductMetier implements IProductMetier{

    private IProductDao dao;

    public void setDao(IProductDao dao) {
        this.dao = dao;
    }

    @Override
    public Product addProduct(Product product) throws Exception {
        return dao.addProduct(product);
    }

    @Override
    public List<Product> getProducts() throws Exception {
        return dao.getProducts();
    }
}
