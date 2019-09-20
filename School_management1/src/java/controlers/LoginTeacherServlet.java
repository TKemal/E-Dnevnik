package controlers;

import entity.Teachers;
import entity.Users;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PasswordHashUtil;
import model.Services;

@WebServlet(name = "LoginTeacherServlet", urlPatterns = {"/LoginTeacherServlet"})
public class LoginTeacherServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("usernameTeacher");
        String password = request.getParameter("passwordTeacher");
        String hashPassword = PasswordHashUtil.getHashPass(password);
        RequestDispatcher rd;
       boolean u;
        try (PrintWriter out = response.getWriter()) {
            if(user.equals("admin") && password.equals("admin")){
                rd = request.getRequestDispatcher("admin_index.jsp");
                rd.forward(request, response);}
            u = Services.loginTeacher(new Teachers(user, hashPassword));
            if (u == true) {
                rd = request.getRequestDispatcher("teacher_index_page.jsp");
                rd.forward(request, response);
            } else {
                rd = request.getRequestDispatcher("wrong_pass.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
