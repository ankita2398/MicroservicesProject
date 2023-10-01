package com.microservicesProject.restaurantManagement.controllers;

import com.microservicesProject.restaurantManagement.entities.RestaurantEntity;
import com.microservicesProject.restaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // Get Restaurant details by ID
    @GetMapping("/getRestaurantById")
    public Optional<RestaurantEntity> getRestaurantDetailById(@RequestParam int id){
        return restaurantService.getRestaurantDetailsById(id);
    }

    // Get Restaurant details by restaurant-name
    @GetMapping("/getRestaurantByName")
    public Optional<RestaurantEntity> getRestaurantDetailByName(@RequestParam String name){
        return restaurantService.getRestaurantDetailsByName(name);
    }

    // Get List Of All Restaurants
    @GetMapping("/getAllRestaurants")
    public List<RestaurantEntity> getAllRestaurants(){
        return restaurantService.getListOfAllRestaurants();
    }

    // Add Restaurant in the DB
    @PostMapping("/addRestaurant")
    public Optional<RestaurantEntity> addRestaurantDetails(@RequestBody RestaurantEntity restaurant){
        return restaurantService.saveRestaurantDetails(restaurant);
    }

    // Update Restaurant details in the DB
    @PutMapping("/updateRestaurant")
    public Optional<RestaurantEntity> updateRestaurantDetails(@RequestBody RestaurantEntity restaurant){
        return restaurantService.updateRestaurantDetails(restaurant);
    }

    // Delete Restaurant by ID
    @DeleteMapping("/deleteRestaurant")
    public String deleteRestaurantById(@RequestParam int id){
        return restaurantService.deleteRestaurantById(id);
    }

}
