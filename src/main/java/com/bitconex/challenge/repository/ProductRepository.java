package com.bitconex.challenge.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bitconex.challenge.domain.Product;



@Repository
public interface ProductRepository  extends JpaRepository<Product, Long>{
	
	@Query(value = "SELECT *  FROM  PRODUCT  WHERE ID =:productId ", nativeQuery = true)
	Product getProductById(@Param("productId") Long productId);
	
}
