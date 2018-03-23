package playground.database.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.CascadeType.DETACH;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REFRESH;
import static javax.persistence.CascadeType.REMOVE;
import static javax.persistence.FetchType.LAZY;

@Data
@Builder
@Entity
public class B {
    @Id
    private String id;
    @OneToOne(cascade = {PERSIST, REFRESH, REMOVE, DETACH}, fetch = LAZY)
    private C cEntity;
}
