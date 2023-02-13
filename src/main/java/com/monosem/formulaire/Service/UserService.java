package com.monosem.formulaire.Service;

import com.monosem.formulaire.Entity.User;

import java.util.List;

public interface UserService  {
    List<User> listAll();
    void save(User user);

   String deleteUser(long id);
}
