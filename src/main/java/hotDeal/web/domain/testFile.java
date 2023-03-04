package hotDeal.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class testFile {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String name;
}
