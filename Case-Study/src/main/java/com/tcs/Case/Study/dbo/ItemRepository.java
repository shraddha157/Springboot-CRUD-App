package com.tcs.Case.Study.dbo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Case.Study.entity.Items;

//jpa repository:- It contains API for basic CRUD operations
public interface ItemRepository extends JpaRepository<Items,Long> {

}
