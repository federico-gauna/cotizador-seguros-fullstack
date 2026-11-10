package com.seguros.cotizador.model.entity;
public class Plan {
    private Long idPlan;
    private String nombrePlan;
    private String descripcion;

    public Plan(Long idPlan, String nombrePlan, String descripcion) {
        this.idPlan = idPlan;
        this.nombrePlan = nombrePlan;
        this.descripcion = descripcion;
    }
    
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
