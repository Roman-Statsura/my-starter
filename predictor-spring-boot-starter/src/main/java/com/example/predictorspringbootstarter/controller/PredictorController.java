package com.example.predictorspringbootstarter.controller;

import com.example.predictorspringbootstarter.service.PredictorService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConditionalOnWebApplication
@RestController
public class PredictorController {
    private final PredictorService predictorService;

    public PredictorController(PredictorService predictorService) {
        this.predictorService = predictorService;
    }
    @GetMapping("/predict")
    public String getPredict(){
        return predictorService.getCurrentPrediction();
    }
}
