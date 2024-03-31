package com.example.webas;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/he")
public class HelloServlet extends HttpServlet {
    private String message;
    private int cislo;

    public void init() {
        message = "NAZDAR PSYCHOUSI";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<ul>");
        for(int i = 0; i < 10; i ++){
            out.println("<li>" + i + "</li>" );
        }
        out.println("</ul>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}