package kr.or.tv.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.tv.model.vo.SamsungTv;
import kr.or.tv.model.vo.Tv;
import kr.or.tv.model.vo.TvFactory;

/**
 * Servlet implementation class dependencyServlet
 */
public class dependencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dependencyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String brand = request.getParameter("brand");
		TvFactory factory = new TvFactory();
		
		Tv tv = factory.getTv(brand);
		tv.powerOn();
		
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
