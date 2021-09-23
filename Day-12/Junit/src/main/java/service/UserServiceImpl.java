package service;

import dao.UserDao;
import entities.User;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Date;

public class UserServiceImpl implements UserService {
    //@Autowired
    UserDao userDao;

    @Override
    public User addUser(User user) {
        User addedUser = userDao.addUser(user);
        return addedUser;
    }

    @Override
    public Date getCurrentTime() {
        return null;
    }
}