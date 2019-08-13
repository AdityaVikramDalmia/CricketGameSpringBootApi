package com.springboot.mysqlconnector.repo;

import com.springboot.mysqlconnector.model.BallData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BallJpaRepo extends JpaRepository<BallData, Integer> {

    BallData findTopByOrderByIdDesc();
}
