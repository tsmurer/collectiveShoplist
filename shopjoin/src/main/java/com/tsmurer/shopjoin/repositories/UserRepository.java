package com.tsmurer.shopjoin.repositories;

import com.tsmurer.shopjoin.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
