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
    FileWriter fwriter;
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
        fwriter = new FileWriter("result.txt");
        BufferedWriter writer1 = new BufferedWriter(fwriter);
        solution s = new solution();

        String string = request.getParameter("string");

        writer1.write("U ovom stringu se nalazi " + s.maxNumberOfBalloons(string) + " br. reci BALLOON");
        writer1.close();
        writer.println("Izracunato i uspesno upisano u file result!");

    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        fwriter = new FileWriter("result.txt", false);
        BufferedWriter writer2 = new BufferedWriter(fwriter);
        solution s = new solution();

        String string = req.getParameter("string");

        writer2.write("U ovom stringu se nalazi " + s.maxNumberOfBalloons(string) + " br. reci BALLOON");
        writer2.close();

        writer.println("Izracunato i uspesno updateovan file result!");

    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        fwriter = new FileWriter("result.txt", false);
        BufferedWriter writer2 = new BufferedWriter(fwriter);

        writer2.write("");
        writer2.close();

        writer.println("Uspesno izbrisani podatci iz filea result!");

    }
}
