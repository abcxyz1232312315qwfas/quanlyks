/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import model.Account;

/**
 *
 * @author ADMIN
 */
public interface Query<T, ID> {
    List<Account> findAll();
    void insert(T entity);
    void update(T entity);
    void delete(ID id);
}
