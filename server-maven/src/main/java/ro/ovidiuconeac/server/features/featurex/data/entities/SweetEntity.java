package ro.ovidiuconeac.server.features.featurex.data.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@Entity(name = "sweet")
@Table(name = "sweets")
public class SweetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    public SweetEntity() {
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