package com.seguros.cotizador.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seguros.cotizador.model.entity.Plan;
@Repository 
public interface PlanRepository extends JpaRepository<Plan, Long>{
    
}
