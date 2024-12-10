package com.example.Joins.Tables.All.Relations.to.DB.repository;

import com.example.Joins.Tables.All.Relations.to.DB.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
