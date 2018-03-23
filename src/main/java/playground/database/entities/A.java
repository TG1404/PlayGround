package playground.database.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

@Data
@Builder
@Entity
public class A {
    @Id
    private String id;
    @OneToMany(cascade = ALL, fetch = LAZY)
    private List<B> bList;
}
