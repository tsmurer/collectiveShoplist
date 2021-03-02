package com.tsmurer.shopjoin.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private Set<UserGroup> userGroups;

}
