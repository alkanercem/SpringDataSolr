package BackendChallenge.SpringDataSolr.business.concretes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.stereotype.Service;

import BackendChallenge.SpringDataSolr.business.abstracts.ProductService;
import BackendChallenge.SpringDataSolr.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	 @Autowired
	 private SolrTemplate solrTemplate;

	    public List<Product> getProductsUpdatedAfterDate(String date) {
	        try {	        	
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	            Date givenDate = dateFormat.parse(date);
	          
	            SimpleQuery query = new SimpleQuery("updatedAt:[" + givenDate.getTime() + " TO *]");

	            return solrTemplate.query("gettedByUpdatedAt",query, Product.class).getContent();	          
	        } 
	        
	        catch (ParseException e) {
	            e.printStackTrace();	          
	            return Collections.emptyList();
	        }
	    }

	}