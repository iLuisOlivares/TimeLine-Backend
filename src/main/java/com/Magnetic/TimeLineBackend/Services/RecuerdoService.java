package com.Magnetic.TimeLineBackend.Services;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import com.Magnetic.TimeLineBackend.Services.Exceptions.NotFoundException;
import com.Magnetic.TimeLineBackend.Services.Interfaces.RecuerdoServInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class RecuerdoService implements RecuerdoServInterface {


    @Override
    public Recuerdo getRecuerdos() throws NotFoundException {
        return null;
    }

    @Override
    public Recuerdo saveRecuerdo() throws NotFoundException {
        return null;
    }

    @Override
    public Recuerdo DeleteRecuerdo() throws NotFoundException {
        return null;
    }
}
