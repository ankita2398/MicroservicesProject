package com.microservicesProject.restaurantManagement.service;

import com.microservicesProject.restaurantManagement.entities.RestaurantEntity;
import com.microservicesProject.restaurantManagement.repositories.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RestaurantServiceImpl implements RestaurantService{

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Optional<RestaurantEntity> getRestaurantDetailsById(int id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public Optional<RestaurantEntity> getRestaurantDetailsByName(String name) {
        return restaurantRepository.findByName(name);
    }

    @Override
    public List<RestaurantEntity> getListOfAllRestaurants(){
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<RestaurantEntity> saveRestaurantDetails(RestaurantEntity restaurant)
    {
        return Optional.of(restaurantRepository.save(restaurant));
    }

    @Override
    public Optional<RestaurantEntity> updateRestaurantDetails(RestaurantEntity restaurant){
        return Optional.of(restaurantRepository.save(restaurant));
    }

    @Override
    public String deleteRestaurantById(int id){
        try{
            restaurantRepository.deleteById(id);
            return "Deleted Successfully";
        }
        catch(Exception e){
            log.info("Error while deleting data:: {}",e.getMessage());
            return "Database Issue Occurred";
        }
    }

}
