package BackendChallenge.SpringDataSolr.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BackendChallenge.SpringDataSolr.business.abstracts.ProductService;
import BackendChallenge.SpringDataSolr.entities.concretes.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
    private ProductService productService;
	
    @GetMapping("/updatedAfterDate/{date}")
    public List<Product> getProductsUpdatedAfterDate(@PathVariable String date) {
        return productService.getProductsUpdatedAfterDate(date);
    }
    
    
}