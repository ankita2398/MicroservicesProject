package com.microservicesProject.restaurantManagement.service;

import com.microservicesProject.restaurantManagement.entities.RestaurantEntity;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    Optional<RestaurantEntity> getRestaurantDetailsById(int id);

    Optional<RestaurantEntity> getRestaurantDetailsByName(String name);

    List<RestaurantEntity> getListOfAllRestaurants();

    Optional<RestaurantEntity> saveRestaurantDetails(RestaurantEntity restaurant);

    Optional<RestaurantEntity> updateRestaurantDetails(RestaurantEntity restaurant);

    String deleteRestaurantById(int id);

}
