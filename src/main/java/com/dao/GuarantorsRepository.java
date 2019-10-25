package com.dao;

import com.entities.Guarantor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuarantorsRepository extends CrudRepository<Guarantor, Long> {
    @Override
    void deleteById(Long aLong);

    @Override
    Optional<Guarantor> findById(Long aLong);

}

