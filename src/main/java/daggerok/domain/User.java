package daggerok.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = -1149930933472299485L;

    @Id String id;
    String username;
}
