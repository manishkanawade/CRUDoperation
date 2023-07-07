package com.qio.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qio.report.entity.Thief;
@Repository
public interface thiefRepository extends JpaRepository<Thief, Long> {

}
