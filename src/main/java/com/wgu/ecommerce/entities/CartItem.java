package com.wgu.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="cart_items")
@Getter
@Setter
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id", nullable=false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vacation_id", nullable = false)
    private Vacation vacation;

    @ManyToMany
    @JoinTable(
            name = "excursion_cartitem",
            joinColumns = @JoinColumn(name = "cart_item_id"),
            inverseJoinColumns = @JoinColumn(name = "excursion_id"))
    private Set<Excursion> excursions = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @Column(name = "create_date")
    @CreationTimestamp(source = SourceType.DB)
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp(source = SourceType.DB)
    private Date last_update;
}
