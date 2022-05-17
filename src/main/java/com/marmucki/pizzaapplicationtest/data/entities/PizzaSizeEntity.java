package com.marmucki.pizzaapplicationtest.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas_sizes")
public class PizzaSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizza")
    private Set<PizzaEntity> pizzas;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;

    public Integer getId() {
        return id;
    }

    public Integer getPizzaId() {
        return pizzaId;
    }

    public String getName() {
        return name;
    }

    public Set<PizzaEntity> getPizzas() {
        return pizzas;
    }

    public PizzaEntity getPizza() {
        return pizza;
    }
}
