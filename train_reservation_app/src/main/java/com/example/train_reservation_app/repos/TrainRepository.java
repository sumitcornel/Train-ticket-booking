package com.example.train_reservation_app.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.train_reservation_app.entities.Train;
public interface TrainRepository extends JpaRepository<Train, Long> {

}
