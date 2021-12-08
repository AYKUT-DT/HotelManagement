/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.aykutSpring;

import SpringCrud.aykutSpring.model.Rezervation;
import SpringCrud.aykutSpring.model.Room;
import SpringCrud.aykutSpring.model.User;
import SpringCrud.aykutSpring.repository.RezervationRepository;
import SpringCrud.aykutSpring.repository.RoomRepository;
import SpringCrud.aykutSpring.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class Tests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private RoomRepository roomRepo;

    @Autowired
    private RezervationRepository reservRepo;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setUsername("samet");
        user.setPassword("sa12");
        user.setEnabled(true);
        repo.save(user);
    }
}
