package com.bitconex.challenge.test.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bitconex.challenge.controller.UserController;
import com.bitconex.challenge.domain.Product;
import com.bitconex.challenge.domain.User;
import com.bitconex.challenge.repository.ProductRepository;
import com.bitconex.challenge.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ProductRepositoryTest {

	private MockMvc mockMvc;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private EntityManager entityManager;

	@Before
	public void init() {
		 MockitoAnnotations.initMocks(this);
	        mockMvc = MockMvcBuilders
	                .standaloneSetup(productRepository)
	                .build();
	}

	@Test
	@Transactional
	public void whenFindAll() {
		Product firstProduct = new Product();	
		firstProduct.setDeviceType("DSLAM");
		firstProduct.setTechnologyType("VSDL");
		entityManager.persist(firstProduct);
		entityManager.flush();
		Product secondProduct = new Product();	
		secondProduct.setDeviceType("DSLAM");
		secondProduct.setTechnologyType("VSDL");
		entityManager.persist(secondProduct);
		// when
		List<Product> productList = productRepository.findAll();
		// then
		assertThat(productList.size()).isEqualTo(2);
		assertThat(productList.get(0)).isEqualTo(firstProduct);
		assertThat(productList.get(1)).isEqualTo(secondProduct);
	}

	@Test
	public void whenGetProductById() {
	    // given
	    Product product = new Product();
	    product.setTechnologyType("VSDL");
	    product.setDeviceType("DPU");
	    entityManager.persist(product);
	    entityManager.flush();
	    // when
	    Product foundProduct = productRepository.getProductById(product.getId());
	    // then
	    assertThat(foundProduct.getTechnologyType())
	      .isEqualTo(product.getTechnologyType());
	}

	    
    
    
}
