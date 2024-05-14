package com.gabrielyoshino.rest.webservice.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    // Checa a quantidade de usuários
    private static Integer usersCount = 0;

    static {
        users.add(new User(++usersCount, "Adão", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eva", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Caim", LocalDate.now().minusYears(10).minusMonths(9)));
        users.add(new User(++usersCount, "Abel", LocalDate.now().minusYears(10)));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
