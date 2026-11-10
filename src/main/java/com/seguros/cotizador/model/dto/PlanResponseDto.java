package com.seguros.cotizador.model.dto;

public class PlanResponseDto {
    private Long idPlan;
    private String nombrePlan;
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
