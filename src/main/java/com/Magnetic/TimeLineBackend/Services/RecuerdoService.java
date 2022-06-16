package com.Magnetic.TimeLineBackend.Services;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import com.Magnetic.TimeLineBackend.Repositories.RecuerdoRepository;
import com.Magnetic.TimeLineBackend.Services.Exceptions.NotFoundException;
import com.Magnetic.TimeLineBackend.Services.Interfaces.RecuerdoServInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class RecuerdoService implements RecuerdoServInterface {
    @Autowired
    RecuerdoRepository recuerdoRepository;

    @Override
    public List<Recuerdo> getRecuerdos() throws NotFoundException {
        return recuerdoRepository.findAllByActivoIsTrueOrderByFecha();
    }

    @Override
    public Recuerdo saveRecuerdos(Recuerdo recuerdo)  {
        return recuerdoRepository.save(recuerdo);
    }

    @Override
    public Recuerdo updateRecuerdo(Long id) throws NotFoundException {
        Recuerdo recuerdo_old = recuerdoRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Recuerdo no encontrado")
        );
        recuerdo_old.setActivo(false);
        return recuerdoRepository.save(recuerdo_old);
    }

}
