package fr.fms.business;

import fr.fms.dao.UsersRepository;
import fr.fms.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersBusinessImpl implements Business<Users>{
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Users saveOrUpdateOne(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public void deleteOne(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Optional<Users> readOneById(Long id) {
        return usersRepository.findById(id);
    }
}
