package BackendChallenge.SpringDataSolr.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BackendChallenge.SpringDataSolr.business.abstracts.ProductService;
import BackendChallenge.SpringDataSolr.dataAccess.abstracts.ProductRepository;
import BackendChallenge.SpringDataSolr.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	@Autowired
    private ProductRepository productRepository;
	
	public List<Product> getProductsUpdatedAfterTime(long timestamp) {
        return productRepository.findByUpdatedAtAfter(timestamp);
        }
	
	public void saveProduct(Product product) {
	    productRepository.save(product);
	    }

	}