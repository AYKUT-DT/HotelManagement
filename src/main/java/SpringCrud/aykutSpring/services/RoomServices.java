/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.aykutSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringCrud.aykutSpring.model.Room;
import SpringCrud.aykutSpring.repository.RoomRepository;

@Service
public class RoomServices {

    @Autowired
    private RoomRepository repo;

    public List<Room> listAll() {
        return (List<Room>) repo.findAll();
    }

    public void save(Room room) {
        repo.save(room);
    }

    public Room get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
