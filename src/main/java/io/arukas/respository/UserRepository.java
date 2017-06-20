package io.arukas.respository;

import io.arukas.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 20/06/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    public User findUserByUsername(String username);

}
