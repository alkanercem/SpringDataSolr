package BackendChallenge.SpringDataSolr.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import BackendChallenge.SpringDataSolr.entities.concretes.Product;

@Repository
public interface ProductRepository extends SolrCrudRepository<Product, String> {
	@Query("updatedAt:[?0 TO *]")
	List<Product> findByUpdatedAtAfter(long timestamp);
}