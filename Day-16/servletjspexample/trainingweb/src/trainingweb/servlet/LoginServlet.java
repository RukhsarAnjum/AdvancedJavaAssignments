package trainingweb.servlet;

import trainingweb.service.UserManager;
import trainingweb.service.UserManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String username= request.getParameter("username");
        String password=request.getParameter("password");
        UserManager manager=new UserManagerImpl();
        Boolean flag=manager.verifyUsernameAndPassword(username, password);
        System.out.println("I am called");
        if(flag==true){
            HttpSession session=request.getSession(true);
            session.setAttribute("username", username);
            String uri= "member.jsp";
            request.getRequestDispatcher(uri).forward(request, response);
//out.println("<html><body"+"<h1>Hi! Welcome "+username+"</h1></body></html>");
        }else{
            out.println("<html><body"+"<h1>"+"Invalid Credentials for "+username+"</h1>"+"</body></html>");
            out.println("<a href=\"login.jsp\">"+"Login"+"</a>");
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }


    }
