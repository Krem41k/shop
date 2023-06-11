package com.example.shop.dao.repositories;

import com.example.shop.dao.entity.HardDisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepository extends JpaRepository<HardDisk, Long> {
}
