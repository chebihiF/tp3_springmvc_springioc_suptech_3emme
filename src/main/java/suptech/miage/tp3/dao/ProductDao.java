package suptech.miage.tp3.dao;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import suptech.miage.tp3.entities.Product;

import javax.persistence.EntityManager;
import java.util.List;

public class ProductDao implements IProductDao{

    private final EntityManager em;

    public ProductDao(EntityManager em) {
        this.em = em;
    }

    @Override @Transactional
    public Product addProduct(Product product) throws Exception {
        em.persist(product);
        return product;
    }

    @Override
    public List<Product> getProducts() throws Exception {
        return em.createQuery("from Product p",Product.class).getResultList();
    }
}
