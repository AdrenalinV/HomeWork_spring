package ru.geekbrains.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name="HomeWork1", urlPatterns = "/home_work1")
public class HomeWork1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out= resp.getWriter();
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        resp.setContentType("text/html");
        for (int i = 0; i < 10; i++) {
            Product p=new Product(i,"Product_"+i,100+(10* r.nextDouble()));
            sb.append(p).append("<br>");
        }
        out.println("<html><body><h1>"+sb.toString()+"</h1></body></html>");
        out.close();

    }
}
