package com.cognizant.moviecruize.dao;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.moviecruize.model.Movie;
import com.cognizant.moviecruize.util.DateUtil;



public class MovieDaoCollectionImpl implements MovieDao {
	private static List<Movie> movieList = null;
	public MovieDaoCollectionImpl() {
		if(movieList == null){
		movieList = new ArrayList<Movie>();
		Movie mi1 = new Movie(1,"Avatar",100,true,DateUtil.convertToDate("26/03/2019"),"Science fiction",true);
		Movie mi2 = new Movie(2,"eggs",9,false,DateUtil.convertToDate("26/03/2019"),"Desert",true);
		Movie mi3 = new Movie(3,"juice",99,true,DateUtil.convertToDate("26/03/2019"),"Drinks",false);
		
		movieList.add(mi1);
		movieList.add(mi2);
		movieList.add(mi3);
		}
	}
	@Override
	public List<Movie> viewMovieListAdmin() {
		// TODO Auto-generated method stub
		return movieList;
	}

	@Override
	public List<Movie> viewMovieListCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie editMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie viewMovie(int movieId) {
		// TODO Auto-generated method stub
		return null;
	}

}
