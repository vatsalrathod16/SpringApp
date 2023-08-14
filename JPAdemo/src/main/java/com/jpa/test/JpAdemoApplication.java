package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class JpAdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpAdemoApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Vatsal Rathod");
//		user.setCity("Mumbai");
//		user.setStatus("I am java developer");
//		
//		User user1 = userRepository.save(user);
//		
		
		//create
//		System.out.println(user1);
//		User user1 = new User();
//		user1.setName("Aayush Rathod");
//		user1.setCity("Mumbai");
//		user1.setStatus("I am python developer");
//		
//		User user2 = new User();
//		user2.setName("Noopur Rathod");
//		user2.setCity("Mumbai");
//		user2.setStatus("I am js developer");
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		User resultUser = userRepository.save(user2);
//		System.out.println(resultUser);
		
		//update by id & read
//		Optional<User> optional = userRepository.findById(52);
//		User user = optional.get();
//		
//		user.setName("Kinjal Rathod");
//		User result = userRepository.save(user);
//		
//		System.out.println(result);
		
		//delete by id
//		userRepository.deleteById(52);
//		System.out.println("deleted");
		
		//delete all
		Iterable<User> allusers = userRepository.findAll();
		allusers.forEach(users->System.out.println(users));
		userRepository.deleteAll(allusers);
	}

}
