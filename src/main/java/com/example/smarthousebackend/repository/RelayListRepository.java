package com.example.smarthousebackend.repository;

import com.example.smarthousebackend.entity.Relay;
import com.example.smarthousebackend.entity.RelayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RelayListRepository extends JpaRepository<RelayList, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM RelayList h WHERE h.id IN (SELECT hl.id FROM RelayList hl ORDER BY hl.localDate ASC LIMIT :count)")
    void deleteOldestRecords(@Param("count") int count);
}
