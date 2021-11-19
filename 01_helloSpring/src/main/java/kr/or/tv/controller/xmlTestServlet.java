package kr.or.tv.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.member.model.vo.Member;
import kr.or.member.model.vo.MemberMgr;
import kr.or.member.model.vo.TestData;

/**
 * Servlet implementation class xmlTestServlet
 */
public class xmlTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xmlTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AbstractApplicationContext cntx = new GenericXmlApplicationContext("sample.xml");
		Member m1 = (Member)cntx.getBean("m1");
		Member m2 = (Member)cntx.getBean("m2");
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		MemberMgr mgr = (MemberMgr)cntx.getBean("mm");
		Member member = mgr.getM();
		System.out.println(member.getName());
		TestData data1 = (TestData)cntx.getBean("data1");
		System.out.println(data1.getData()); 
		data1.setData(data1.getData()+1);
		System.out.println(data1.getData());
		
		TestData data2 = (TestData)cntx.getBean("data1");
		System.out.println(data2.getData());
		TestData data3 = (TestData)cntx.getBean("data2");
		System.out.println(data3.getData()); 
		data3.setData(data3.getData()+1);
		System.out.println(data3.getData());
		
		TestData data4 = (TestData)cntx.getBean("data2");
		System.out.println(data4.getData());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
