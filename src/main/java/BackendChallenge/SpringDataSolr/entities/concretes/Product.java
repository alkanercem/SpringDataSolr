package BackendChallenge.SpringDataSolr.entities.concretes;

import org.apache.solr.client.solrj.beans.Field;
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

    @Field
    @Indexed(name = "updatedAt", type = "long")
    private Long updatedAt;

}
