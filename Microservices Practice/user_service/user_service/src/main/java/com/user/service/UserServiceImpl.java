package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake list
    List<User> list = List.of(
            new User(1331L, "Manish Patel", "8563956395"),
            new User(1332L, "Kamlesh Patel", "5638579357"),
            new User(1333L, "Jyoti Singh", "9785636974"));

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserID().equals(id)).findAny().orElse(null);
    }
}
