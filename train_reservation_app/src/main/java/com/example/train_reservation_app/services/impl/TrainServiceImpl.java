package com.example.train_reservation_app.services.impl;

import com.example.train_reservation_app.entities.Train;
import com.example.train_reservation_app.repos.TrainRepository;
import com.example.train_reservation_app.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainRepository trainRepository;
    @Override
    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }

    @Override
    public List<Train> getAllTrain() {
        return trainRepository.findAll();
    }
}
