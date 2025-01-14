package com.example.demo;

import com.example.demo.entity.Room;
import com.example.demo.entity.User;
import com.example.demo.repository.RoomRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoomRepository roomRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		try {
			User admin = new User();
			admin.setUsername("admin");
			admin.setPassword("admin123");
			admin.setEmail("admin@example.com");

			User user = new User();
			user.setUsername("user");
			user.setPassword("user123");
			user.setEmail("user@example.com");

			userRepository.save(admin);
			userRepository.save(user);

			Room room1 = new Room();
			room1.setNumber("101");
			room1.setType("Single");
			room1.setPrice(100.0);
			room1.setAvailable(true);

			Room room2 = new Room();
			room2.setNumber("102");
			room2.setType("Double");
			room2.setPrice(150.0);
			room2.setAvailable(true);

			roomRepository.save(room1);
			roomRepository.save(room2);

			System.out.println("Данные успешно добавлены в базу.");
		} catch (Exception e) {
			System.err.println("Ошибка при сохранении данных: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
//test git commands