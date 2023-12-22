package BackendChallenge.SpringDataSolr.dataAccess.abstracts;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import BackendChallenge.SpringDataSolr.entities.concretes.Product;

@Repository
public interface ProductRepository extends SolrCrudRepository<Product, String> {

}
