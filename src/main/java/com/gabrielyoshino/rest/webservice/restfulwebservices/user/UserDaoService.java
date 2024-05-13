package com.gabrielyoshino.rest.webservice.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adão", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Eva", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Caim", LocalDate.now().minusYears(10).minusMonths(9)));
        users.add(new User(4, "Abel", LocalDate.now().minusYears(10)));
    }

    public List<User> findAll() {
        return users;
    }
}
