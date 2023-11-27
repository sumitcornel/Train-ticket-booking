package com.example.train_reservation_app.services;

import com.example.train_reservation_app.entities.Train;

import java.util.List;

public interface TrainService {
    Train addTrain(Train train);
    List<Train> getAllTrain();
}
