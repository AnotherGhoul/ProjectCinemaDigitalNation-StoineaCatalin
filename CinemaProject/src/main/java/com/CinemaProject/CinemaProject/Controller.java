package com.CinemaProject.CinemaProject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


	@GetMapping("/user")
	public String user(Model model) {
		User u1 = new User();
		u1.setFirstName("catalin");
		u1.setLastName("d");
		u1.setAccountId("ang");
		u1.setPhoneNumber("22");
		model.addAttribute("user",u1);
		return "user";
		
		
	}
	
	
	@GetMapping("/movies")
	Movie[] movies() {
		Movie m1 = new Movie("The Shawshank Redemption",
				"drama","Frank Darabont","Tim Robbins and Morgan Freeman","2h 22m",14,1);
		Movie m2 = new Movie("The Godfather",
				"crime","Francis Ford Coppola","Marlon Brando and Al Pacino","2h 55m",18,2);
		Movie[] movies = {m1,m2};

		return movies;
	}
}
