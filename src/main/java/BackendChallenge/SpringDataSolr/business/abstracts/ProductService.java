package BackendChallenge.SpringDataSolr.business.abstracts;

import java.util.List;

import BackendChallenge.SpringDataSolr.entities.concretes.Product;

public interface ProductService {
	List<Product> getProductsUpdatedAfterTime(long timestamp);
	void saveProduct(Product product);
}
