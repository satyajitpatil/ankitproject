package com.cognizant.moviecruize.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruize.dao.MovieDao;
import com.cognizant.moviecruize.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecruize.model.Movie;

/**
 * Servlet implementation class ShowMovieListAdminServlet
 */
@WebServlet("/ShowMovieListAdminServlet")
public class ShowMovieListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMovieListAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rdMovie= request.getRequestDispatcher("movie-list-admin.jsp");
				MovieDao movieDao = new MovieDaoCollectionImpl();
				List<Movie> movielistadmin=movieDao.viewMovieListAdmin();
				request.setAttribute("movie",movielistadmin );
				rdMovie.forward(request, response);
				
	}



}
