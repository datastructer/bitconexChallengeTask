package com.bitconex.challenge.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bitconex.challenge.model.HistoryModel;

@Repository
public interface HistoryModelRepository extends JpaRepository<HistoryModel, Long> {

		
	@Query(value = "select  aupa.rev, appu.created_at, appu.updated_at, appu.full_name , p.id as product_id , "
			+ " p.technology_type , p.device_type , aupa.revtype "
			+ " from app_user_product_aud  aupa join  app_user  appu  on appu.id = aupa.user_id join "
			+ "  product p on p.id = aupa.product_id "
			+ " where aupa.revtype !=2 and aupa.user_id =:userId" , nativeQuery = true)
	List<HistoryModel> getUserHistoryById(@Param("userId") Long userId);
	
	
}


