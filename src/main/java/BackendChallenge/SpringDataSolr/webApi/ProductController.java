package BackendChallenge.SpringDataSolr.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BackendChallenge.SpringDataSolr.business.abstracts.ProductService;
import BackendChallenge.SpringDataSolr.entities.concretes.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
    private ProductService productService;

    @GetMapping("/updatedAfterTime")
    public List<Product> getProductsUpdatedAfterTime(@RequestParam long timestamp) {
        return productService.getProductsUpdatedAfterTime(timestamp);
    }
    
    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return ResponseEntity.ok("Product added successfully");
    }
}