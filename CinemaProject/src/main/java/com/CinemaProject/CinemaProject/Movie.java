package com.CinemaProject.CinemaProject;

public class Movie {
	private String nameOfMovie;
	private String genre;
	private String director;
	private String leadActor;
	private String howLong;
	private int ageLimit;
	private int idMovie;
	public Movie() {
		super();
	}
	public Movie(String nameOfMovie,
			String genre, 
			String director, 
			String leadActor, 
			String howLong, 
			int ageLimit,
			int idMovie) {
		super();
		this.nameOfMovie = nameOfMovie;
		this.genre = genre;
		this.director = director;
		this.leadActor = leadActor;
		this.howLong = howLong;
		this.ageLimit = ageLimit;
		this.idMovie = idMovie;
	}
	public String getNameOfMovie() {
		return nameOfMovie;
	}
	public void setNameOfMovie(String nameOfMovie) {
		this.nameOfMovie = nameOfMovie;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getHowLong() {
		return howLong;
	}
	public void setHowLong(String howLong) {
		this.howLong = howLong;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public int getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}
	@Override
	public String toString() {
		String s ="Movie [nameOfMovie=" + nameOfMovie + ", genre=" + genre + ", director=" + director + ", leadActor="
				+ leadActor + ", howLong=" + howLong + ", ageLimit=" + ageLimit + ", idMovie=" + idMovie + "]";
		return s;
	}




}

