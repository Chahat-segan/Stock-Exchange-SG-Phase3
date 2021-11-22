package com.chahatSG.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chahatSG.companyservice.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{

}
