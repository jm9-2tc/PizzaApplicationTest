package com.marmucki.pizzaapplicationtest.data.entities;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @OneToMany(mappedBy = "orders_sizes")
    private Set<OrderSizeEntity> ordersSizes;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;
}
