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
import com.bitconex.challenge.repository.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class UserRepositoryTest {

	private MockMvc mockMvc;

	@InjectMocks
	private UserController userController;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EntityManager entityManager;

	@Before
	public void init() {
		 MockitoAnnotations.initMocks(this);
	        mockMvc = MockMvcBuilders
	                .standaloneSetup(userRepository)
	                .build();
	}

	@Test
	@Transactional
	public void whenFindAll() {
		User firstUser = new User();
		Product firstProduct = new Product();
		List<Product> productList = new ArrayList<Product>();
		firstProduct.setDeviceType("DSLAM");
		firstProduct.setTechnologyType("VSDL");
		firstUser.setFullName("Sarp Dursun");
		firstUser.setProduct(productList);
		entityManager.persist(firstUser);
		entityManager.flush();
		User secondUser = new User();
		secondUser.setFullName("Pars Dursun");
		entityManager.persist(secondUser);
		// when
		List<User> userList = userRepository.findAll();
		// then
		assertThat(userList.size()).isEqualTo(2);
		assertThat(userList.get(0)).isEqualTo(firstUser);
		assertThat(userList.get(1)).isEqualTo(secondUser);
	}

	@Test
	public void whenGetUserById() {
	    // given
	    User user = new User();
	    user.setFullName("Ozan Ozgur");
	    entityManager.persist(user);
	    entityManager.flush();
	    // when
	    User found = userRepository.getUserById(user.getId());
	    // then
	    assertThat(found.getFullName())
	      .isEqualTo(user.getFullName());
	}

	    
    
    
}
