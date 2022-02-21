package ru.geekbrains.persist.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Component
@Entity
@Table(name = "cart")
public abstract class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @OneToMany
    private List<Product> items;

    @Column
    private BigDecimal price;

    public Cart() {
    }

    public Cart(Long id, List<Product> items, BigDecimal price) {
        this.id = id;
        this.items = items;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
