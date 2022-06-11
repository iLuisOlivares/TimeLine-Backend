package com.Magnetic.TimeLineBackend.Services.Interfaces;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import com.Magnetic.TimeLineBackend.Services.Exceptions.NotFoundException;

import java.util.List;
import java.util.Optional;

public interface RecuerdoServInterface {
    public List<Recuerdo> getRecuerdos() throws NotFoundException;
    public Recuerdo updateRecuerdo(Recuerdo recuerdo) throws NotFoundException;
}
