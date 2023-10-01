package com.microservicesProject.restaurantManagement.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "restaurant")
@NoArgsConstructor
@Data
public class RestaurantEntity implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String address;
    private Integer rating;

}
