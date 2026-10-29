package br.com.dataata.controla_apontamento.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String name;
    private String neighborhood;
    private String number;
    private String complement;

    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
    private Patient patient;



}
