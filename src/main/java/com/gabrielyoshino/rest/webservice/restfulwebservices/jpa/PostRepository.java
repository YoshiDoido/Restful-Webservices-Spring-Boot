package com.gabrielyoshino.rest.webservice.restfulwebservices.jpa;

import com.gabrielyoshino.rest.webservice.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
