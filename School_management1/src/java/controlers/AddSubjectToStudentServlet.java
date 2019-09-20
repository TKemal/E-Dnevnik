package controlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddSubjectToStudentServlet", urlPatterns = {"/AddSubjectToStudentServlet"})
public class AddSubjectToStudentServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    int studentId = Integer.valueOf(request.getParameter("studentId"));
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            Connection conn = null;
            Statement stmt = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/school_management3", "root", "Kemo.111");
                stmt = conn.createStatement();
                String id = request.getParameter("studentId");
                String query = "{ CALL studentHasSubject (" + id + " ) }";
                stmt.executeQuery(query);
               
            } catch (SQLException e) {
                out.println("Doslo je do greške " + "! "
                        + e.toString());
            } catch (ClassNotFoundException e) {
                throw (new ServletException(e.toString()));
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                }
            }
            out.println("<head>");
            out.println("<h1>Uspjesno ste dodali predmete uceniku.</h1>");
            out.println("<link rel=\"stylesheet\" type= \"text/css\" href=\"style.css\">");
            out.println("</head>");
            out.println("<div class=\"loginbox2\">");
            out.println(" <form action= admin_index.jsp method=POST\">\n"
                    + "                   <input type=\"submit\" name=\"\" value=\"Nazad na početnu stranicu\">\n"
                    + "               </form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            out.close();
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
