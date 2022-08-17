package fr.fms.business;

import fr.fms.dao.HotelRepository;
import fr.fms.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelBusinessImpl implements Business<Hotel> {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel saveOrUpdateOne(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteOne(Long id) {
        hotelRepository.deleteById(id);
    }

    @Override
    public Optional<Hotel> readOneById(Long id) {
        return hotelRepository.findById(id);
    }
}
