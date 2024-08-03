package hn.unah.lenguajes.creditos.modelos;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Prestamos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoprestamo")
    private Integer codigoPrestamo;

    @Column(name="fechaapertura")
    private LocalDate fechaApertura;

    private Long monto;

    private Long cuota;

    private Integer plazo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

     @OneToMany(mappedBy = "prestamos", cascade = CascadeType.ALL)
    private List<Cuotas> cuotas;
}
