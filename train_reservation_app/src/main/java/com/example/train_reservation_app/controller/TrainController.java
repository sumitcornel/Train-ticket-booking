package com.example.train_reservation_app.controller;

import com.example.train_reservation_app.entities.Train;
import com.example.train_reservation_app.models.ResponseModel;
import com.example.train_reservation_app.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/train")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @PostMapping("/add")
    public ResponseModel<Train> addTrain(@RequestBody Train train){
        final Train savedTrain = trainService.addTrain(train);
        return new ResponseModel<>(HttpStatus.OK.value(), "Train saved",savedTrain);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Train>> getAllTrain(){
        return ResponseEntity.ok(trainService.getAllTrain());
    }
}
