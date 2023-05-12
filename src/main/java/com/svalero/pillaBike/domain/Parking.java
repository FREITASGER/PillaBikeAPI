package com.svalero.pillaBike.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "parking")
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotNull
    private String name;

    @Column
    private String city;

    @Column
    private LocalTime open;

    @Column
    private LocalTime close;

    @Column
    private boolean isFull;

    @OneToMany(mappedBy = "parking")
    @JsonBackReference(value = "bikes_parking")
    private List<Bike> bikes;

}
