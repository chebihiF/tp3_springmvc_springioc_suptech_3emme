package suptech.miage.tp3.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import suptech.miage.tp3.entities.Product;

import java.util.List;

public class ProductDao implements IProductDao{

    private final SessionFactory factory;

    public ProductDao(SessionFactory factory) {
        this.factory = factory;
    }

    @Override @Transactional
    public Product addProduct(Product product) throws Exception {
        Session session = factory.openSession();
        session.save(product);
        session.close();
        return product;
    }

    @Override
    public List<Product> getProducts() throws Exception {
        Session session = factory.openSession();
        List<Product> products = session.createQuery("from Product p ").getResultList();
        session.close();
        return products;
    }
}
