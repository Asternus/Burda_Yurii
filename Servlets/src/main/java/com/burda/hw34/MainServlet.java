package com.burda.hw34;

import lombok.Getter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Getter
public class MainServlet extends HttpServlet {
    private String user1;
    private String user2;
    private String user3;
    private String user4;
    private String user5;
    private String user6;
    private String user7;
    private String user8;
    private String reqUser;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        this.reqUser = req.getRemoteAddr();
        Repository.lastFifeUsers.put(this.reqUser, "reqUser");
        List<String> usersIp = new ArrayList<>(Repository.lastFifeUsers.keySet());
        out.println("<html>");
        out.println("<head><title>Last 5 user IP</title></head>");
        out.println("<body>");
        out.println("<h3>Last 5 user IP</h3>");
        for (int i = usersIp.size() - 2; i > usersIp.size() - 6; i--) {
            out.println("<p>user" + (i + 1) + " = " + usersIp.get(i) + "</p>");
        }
        out.println("<b><p>requestUser" + usersIp.get(usersIp.size() - 1) + "</p></b>");
        out.println("</body>");
        out.println("<html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.user1 = config.getInitParameter("user1");
        this.user2 = config.getInitParameter("user2");
        this.user3 = config.getInitParameter("user3");
        this.user4 = config.getInitParameter("user4");
        this.user5 = config.getInitParameter("user5");
        this.user6 = config.getInitParameter("user6");
        this.user7 = config.getInitParameter("user7");
        this.user8 = config.getInitParameter("user8");
        Repository.lastFifeUsers.put(this.user1, "user1");
        Repository.lastFifeUsers.put(this.user2, "user2");
        Repository.lastFifeUsers.put(this.user3, "user3");
        Repository.lastFifeUsers.put(this.user4, "user4");
        Repository.lastFifeUsers.put(this.user5, "user5");
        Repository.lastFifeUsers.put(this.user6, "user6");
        Repository.lastFifeUsers.put(this.user7, "user7");
        Repository.lastFifeUsers.put(this.user8, "user8");
    }
}