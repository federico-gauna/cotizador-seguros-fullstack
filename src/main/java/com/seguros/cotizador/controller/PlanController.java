package com.seguros.cotizador.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguros.cotizador.model.dto.PlanResponseDto;
import com.seguros.cotizador.service.PlanService;

@RestController 
public class PlanController {
    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }
    
    @GetMapping("/api/plan")
    public ResponseEntity<List<PlanResponseDto>> listarPlanes(){
        List<PlanResponseDto> planes = planService.listarPlanes();
        return ResponseEntity
                    .status(200)
                    .body(planes);
    }
}
