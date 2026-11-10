package com.seguros.cotizador.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.seguros.cotizador.model.dto.PlanResponseDto;
import com.seguros.cotizador.model.entity.Plan;
import com.seguros.cotizador.repository.PlanRepository;

@Service 
public class PlanService {
    private final PlanRepository planRepository;
    

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }


    public List<PlanResponseDto> listarPlanes(){
        List<Plan> planes = planRepository.findAll();
        List<PlanResponseDto> responseDtos = new ArrayList<>();

        for(Plan plan : planes){
            PlanResponseDto responseDto = new PlanResponseDto();
            responseDto.setIdPlan(plan.getIdPlan());
            responseDto.setNombrePlan(plan.getNombrePlan());
            responseDto.setDescripcion(plan.getDescripcion());
            responseDtos.add(responseDto);
        }
        return responseDtos;
    }
}
