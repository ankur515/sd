package com.infy.Product.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infy.Product.entity.Subscribedproduct;

public interface SubscribedproductRepository extends JpaRepository<Subscribedproduct, Integer>{

	Optional<Subscribedproduct>findById(int subid);
	
}
