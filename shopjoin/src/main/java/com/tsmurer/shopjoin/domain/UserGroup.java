package com.tsmurer.shopjoin.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Data
@Entity
@Table(name = "user_group")
public class UserGroup {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "user_group_id")
    private Long userGroupId;
    @Column(name = "name")
    private String name;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "user_x_user_group",
            joinColumns = @JoinColumn(name ="user_group_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users;

}
