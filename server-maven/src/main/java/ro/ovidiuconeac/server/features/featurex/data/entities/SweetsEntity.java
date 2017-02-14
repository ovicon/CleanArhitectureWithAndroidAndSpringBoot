package ro.ovidiuconeac.server.features.featurex.data.entities;

import javax.persistence.*;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@Entity
@Table(name = "sweets")
public class SweetsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public SweetsEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}