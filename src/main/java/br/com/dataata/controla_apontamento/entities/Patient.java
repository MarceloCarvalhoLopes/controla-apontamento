package br.com.dataata.controla_apontamento.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="tb_patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    private String phone;
    private String email;
    private String cpf;

    @OneToOne
    @MapsId
    private Address address;




    public Patient() {
    }


}
