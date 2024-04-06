package com.monitoring.controller;

import java.util.List;

public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

     // Método para crear un usuario
    public void createUser(int id, String username, String password, String role) {
        User newUser = new User(id, username, password, role);
        userRepository.createUser(newUser);
    }

     // Método para obtener un usuario por su ID
    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

     // Método para obtener todos los usuarios
    public ListUser getAllUsers() {
        return userRepository.getAllUsers();
    }

     // Método para actualizar un usuario
    public void updateUser(int id, String username, String password, String role) {
        User updatedUser = new User(id, username, password, role);
        userRepository.updateUser(updatedUser);
    }

     // Método para eliminar un usuario
    public void deleteUser(int userId) {
        userRepository.deleteUser(userId);
    }
}
