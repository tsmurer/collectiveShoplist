package com.tsmurer.shopjoin.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "shoplist")
public class Shoplist {

    @Id
    @Column(name = "shoplist_id")
    private Long shoplistId;
    @Column(name = "name")
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shoplist")
    private Set<Product> products;

}
