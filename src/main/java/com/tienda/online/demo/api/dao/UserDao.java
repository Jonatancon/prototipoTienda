
package com.tienda.online.demo.api.dao;

import com.tienda.online.demo.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User, Long>{
 
}
