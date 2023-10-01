package com.microservicesProject.restaurantManagement.repositories;

import com.microservicesProject.restaurantManagement.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//@Repository //Tag is not needed. Because it is already being extended by JpaRepository in its hierarchy.
/*
*
*  Repository
*  CrudRepository extends Repository
*  PagingAndSortingRepository extends CrudRepository
*  JpaRepository extends PagingAndSortingRepository, QueryByExampleExecutor
*
* */
public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Integer> {
    Optional<RestaurantEntity> findByName(String name);

}
