package com.marmucki.pizzaapplicationtest.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizza_size", orphanRemoval = true)
    private Set<PizzaSizeEntity> sizes;
}
