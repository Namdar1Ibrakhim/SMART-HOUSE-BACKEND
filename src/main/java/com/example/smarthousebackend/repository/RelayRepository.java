package com.example.smarthousebackend.repository;

import com.example.smarthousebackend.entity.Relay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RelayRepository extends JpaRepository<Relay, Integer> {

}
