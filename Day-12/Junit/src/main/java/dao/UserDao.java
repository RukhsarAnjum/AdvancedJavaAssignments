package dao;

import entities.User;

import java.time.LocalDateTime;
import java.util.Date;

public interface UserDao {
    public User addUser(User user);
    public Date getCurrentTime();
    public void display();


    boolean isUserAdd();
}