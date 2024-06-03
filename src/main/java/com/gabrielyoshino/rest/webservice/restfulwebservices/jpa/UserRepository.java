package com.gabrielyoshino.rest.webservice.restfulwebservices.jpa;

import com.gabrielyoshino.rest.webservice.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
