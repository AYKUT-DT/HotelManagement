/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCrud.aykutSpring.services;

import java.util.List;
import SpringCrud.aykutSpring.repository.RezervationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import SpringCrud.aykutSpring.model.Rezervation;

@Service
public class RezervationServices {

    @Autowired
    private RezervationRepository reserveRepo;

    public List<Rezervation> listAll() {
        return (List<Rezervation>) reserveRepo.findAll();
    }

    public void save(Rezervation rezervation) {
        reserveRepo.save(rezervation);
    }

    public Rezervation get(Long id) {
        return reserveRepo.findById(id).get();
    }

    public void delete(Long id) {
        reserveRepo.deleteById(id);
    }

}
