package com.seguros.cotizador.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name = "planes")
public class Plan {
    @Id 
    @SequenceGenerator(
        name = "plan_seq",
        sequenceName = "plan_seq",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "plan_seq"
    )
    private Long idPlan;
    @Column(name = "nombre_plan", nullable = false, length = 50)
    private String nombrePlan;
    @Column(name = "descripcion_plan", nullable = false, length = 180)
    private String descripcion;
    
    public Long getIdPlan() {
        return idPlan;
    }
    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }
    
    public String getNombrePlan() {
        return nombrePlan;
    }
    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
