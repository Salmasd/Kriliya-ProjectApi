package ma.ensate.kriliya.service;

import ma.ensate.kriliya.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    Optional<User> findById(int id);
    public void RemoveUser(Integer id);
    public List<User> getAllUsers();
    public long getCountOfUsers();
    public User addUser(User user);
}
