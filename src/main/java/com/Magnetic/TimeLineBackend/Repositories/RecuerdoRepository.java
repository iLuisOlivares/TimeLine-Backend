package com.Magnetic.TimeLineBackend.Repositories;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RecuerdoRepository extends CrudRepository<Recuerdo, Long> {
    List<Recuerdo> findAllByActivoIsTrue();
    List<Recuerdo> findAllByActivoIsTrueOrderByFecha();
}
