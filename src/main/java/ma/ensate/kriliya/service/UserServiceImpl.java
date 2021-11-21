package ma.ensate.kriliya.service;

import ma.ensate.kriliya.model.User;
import ma.ensate.kriliya.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userrepository;

    @Override
    public Optional<User> findById(int id) {

        return userrepository.findById(id);
    }

    @Override
    public void RemoveUser(Integer id) {
        userrepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userrepository.findAll();
    }

    @Override
    public long getCountOfUsers() {
        long count = userrepository.count();
        return count;
    }
    @Override
    public User addUser(User user) {
        return userrepository.save(user); }
}
