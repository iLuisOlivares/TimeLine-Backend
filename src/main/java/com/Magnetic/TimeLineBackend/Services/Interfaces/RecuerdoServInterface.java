package com.Magnetic.TimeLineBackend.Services.Interfaces;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import com.Magnetic.TimeLineBackend.Services.Exceptions.NotFoundException;

public interface RecuerdoServInterface {
    Recuerdo getRecuerdos() throws NotFoundException;
    Recuerdo saveRecuerdo() throws NotFoundException;
    Recuerdo DeleteRecuerdo() throws NotFoundException;
}
