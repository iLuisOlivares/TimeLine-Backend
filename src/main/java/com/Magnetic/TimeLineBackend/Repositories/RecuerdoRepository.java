package com.Magnetic.TimeLineBackend.Repositories;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecuerdoRepository extends CrudRepository<Recuerdo, Long> {
    Optional<Recuerdo> findFirstById(long id);
}
