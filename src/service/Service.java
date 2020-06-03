/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;

/**
 *
 * @author ADMIN
 */

public interface Service {
    void insert(User user);
    void update(User user);
    void delete(int ID);
    List<User>findAll();
}

