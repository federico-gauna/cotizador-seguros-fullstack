package com.seguros.cotizador.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.seguros.cotizador.model.entity.Plan;
@Repository 
public class PlanRepository {
    public List<Plan> findAll(){
        List<Plan> planes = new ArrayList<>();
        Plan plan1 = new Plan(1L, "Bronce", "Descripcion breve");
        Plan plan2 = new Plan(2L, "Plata", "Descripcion breve");
        Plan plan3 = new Plan(3L, "Oro", "Descripcion breve");
        planes.add(plan1);
        planes.add(plan2);
        planes.add(plan3);
        return planes;
    }
}
