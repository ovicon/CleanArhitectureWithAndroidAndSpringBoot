package ro.ovidiuconeac.server.features.food.data.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Ovidiu CONEAC on 2/14/2017.
 */
@Entity(name = "fruit")
@Table(name = "fruits")
public class FruitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

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