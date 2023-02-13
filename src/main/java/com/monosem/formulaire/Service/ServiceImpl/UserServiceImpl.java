package com.monosem.formulaire.Service.ServiceImpl;

import com.monosem.formulaire.Entity.User;
import com.monosem.formulaire.Repository.UserRepository;
import com.monosem.formulaire.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> listAll() {
       return  userRepository.findAll();

    }

    @Override
    public void save(User user) {
    userRepository.save(user);
    }

    @Override
    public String deleteUser(long id) {
        userRepository.deleteById(id);
        return  "user has deleted successfully";
    }
}
