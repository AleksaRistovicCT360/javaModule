package main;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Server")
@MultipartConfig
public class Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Servlet() {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        solution s = new solution();
        BufferedReader reader = new BufferedReader(new FileReader("string.txt"));

        writer.println(s.maxNumberOfBalloons(reader.readLine()));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("result.txt"));
        solution s = new solution();

        String id = request.getParameter("id");

        writer1.write("U ovom stringu se nalazi " + s.maxNumberOfBalloons(id) + " br. reci BALLOON");
        writer1.close();

        writer.println("Izracunato i uspesno upisano u file result!");

    }

}
