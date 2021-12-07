/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.aykutSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import SpringCrud.aykutSpring.model.User;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u Where u.username = :username")
    public User getUserByUsername(@Param("username") String username);

}
