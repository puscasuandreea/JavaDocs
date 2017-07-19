package ro.teamnet.zth.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Andreea.Puscasu on 7/19/2017.
 */
public class HttpSessionLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username =  request.getParameter("username");
        String password =  request.getParameter("password");

        if(username.equals("admin")&& password.equals("admin")){
            response.getWriter().write("Welcome back "+username+" "+session.getId());
        }else{
           session.setAttribute("username",username);
           session.setAttribute("session",session);
           request.getRequestDispatcher("/views/loginFail.jsp").forward(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
