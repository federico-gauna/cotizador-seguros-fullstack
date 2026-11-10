package com.seguros.cotizador.model.dto;

public class PlanRequestDto {
    private String nombrePlan;
    private String descripcion;
    
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
