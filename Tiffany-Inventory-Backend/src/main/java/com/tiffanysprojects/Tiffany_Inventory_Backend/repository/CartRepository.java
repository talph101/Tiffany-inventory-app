package com.tiffanysprojects.Tiffany_Inventory_Backend.repository;

import com.tiffanysprojects.Tiffany_Inventory_Backend.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
