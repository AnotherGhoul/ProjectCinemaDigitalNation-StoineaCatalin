package com.CinemaProject.CinemaProject;

import java.util.ArrayList;

public class MovieList {
	public void movieList(){
		String[] nameOfMovie = {
				"The Shawshank Redemption",
				"The Godfather",
				"The Dark Knight",
				"The Lord of the Rings: The Return of the King",
				"Fight Club"
		};
		String[] genre = {
				"drama",
				"crime",
				"action",
				"adventure",
				"drama"
		};
		String[] director = {
				"Frank Darabont",
				"Francis Ford Coppola",
				"Christopher Nolan",
				"Peter Jackson",
				"David Fincher",
		};
		String[] leadActor = {
				"Tim Robbins and Morgan Freeman",
				"Marlon Brando and Al Pacino",
				"Christian Bale and Heath Ledger",
				"Elijah Wood and Viggo Mortensen",
				"Brad Pitt and Edward Norton",
		};
		String[] howLong = {
				"2h 22m",
				"2h 55m",
				"2h 32m",
				"3h 21m",
				"2h 19m",
		};
		int[] ageLimit = {
				14,
				18,
				13,
				13,
				19,
		};
		int[] idMovie = {
				1,
				2,
				3,
				4,
				5,
		};
		ArrayList <Movie> movieList= new ArrayList();
		
			for(int i = 0; i < nameOfMovie.length; i++) {
				Movie movies = new Movie(nameOfMovie[i], genre [i] , director [i] , leadActor[i] ,howLong [i],ageLimit[i], idMovie[i] );
				movieList.add(movies);

			}
			movieList.forEach((n) -> System.out.println(n.toString()));
		}
	

}
