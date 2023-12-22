package BackendChallenge.SpringDataSolr.entities.concretes;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "products")
public class Product {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;

    @Indexed(name = "updatedAt", type = "long")
    private Long updatedAt;

}
