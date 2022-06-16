package com.Magnetic.TimeLineBackend.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Recuerdo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String imgUrl;
    private String fecha;
    private boolean activo;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
