package com.tsmurer.shopjoin.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shoplist_id")
    private Shoplist shoplist;

}
