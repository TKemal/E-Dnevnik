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

@WebServlet(name = "ViewStudentsServlet", urlPatterns = {"/ViewStudentsServlet"})
public class ViewStudentsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            Connection conn = null;
            Statement stmt = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/school_management3", "root", "Kemo.111");
                stmt = conn.createStatement();
                String query = "{ CALL selectAllStudents  }";
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    int studenId = rs.getInt("students_id");
                    String studentName = rs.getString("name");
                    String studentParentsName = rs.getString("parent_name");
                    String studentSurname = rs.getString("surname");
                    int dob = rs.getInt("dob");
                    int clas = rs.getInt("class");
                    int subClas = rs.getInt("sub_class");
                    out.println("<center><h1>Ucenik: " + studentName + " " + studentSurname + "</h1>");
                    out.print(" Ucenik I.D: " + studenId + "  ;");
                    out.print("  Ime ucenika: " + studentName + "  ;");
                    out.print("  Ime roditelja: " + studentParentsName + "  ;");
                    out.print(" ; Prezime ucenika: " + studentSurname + "  ;");
                    out.print("  Godina rodjenja: " + dob + "  ;");
                    out.print(" ; Razred ucenika: " + clas + "  ;");
                    out.print("  Odjeljenje ucenika: " + subClas + "  ;");
                    out.print("");
                }
            } catch (SQLException e) {
                out.println("An error occured while retrieving " + "Prikaz studenta "
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
            out.print("<br> ");
            out.print("<br> ");
            out.print("<br> ");
            out.print("<br> ");
            out.print("<br> ");
            out.print("<br> ");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type= \"text/css\" href=\"style.css\">");
            out.println("</head>");
            out.println("<div class=\"loginbox2\">");
            out.println(" <form action= teacher_index_page.jsp method=POST\">\n"
                    + "                   <input type=\"submit\" name=\"\" value=\"Nazad na početnu stranicu\">\n"
                    + "               </form>");
            out.println("</div>");
            out.println("</center>");
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
