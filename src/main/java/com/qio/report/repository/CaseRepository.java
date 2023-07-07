package com.qio.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qio.report.entity.Casee;
@Repository
public interface CaseRepository extends JpaRepository<Casee, Long> {

}
