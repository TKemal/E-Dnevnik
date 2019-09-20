package controlers;

//import entities.UceniciHasPredmetiHasOcjeneId;
import entity.Evaluation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Services;

@WebServlet(name = "GradeStudentServlet", urlPatterns = {"/GradeStudentServlet"})
public class GradeStudentServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        int id = Integer.valueOf(request.getParameter("id"));
        int clas = Integer.valueOf(request.getParameter("class"));
        int grade = Integer.valueOf(request.getParameter("grade"));
        String date = request.getParameter("time");
        Services.evaluateSudent(new Evaluation(id, clas, grade, date));
        try (PrintWriter out = response.getWriter()) {

            out.println("<body>");
             out.println("<h1>" + "Uspjesno ste ocijenili ucenika" +"</h1>");
            out.println("<h1>ID " + id + "</h1>");
            out.println("<h1>predmet " + clas + "</h1>");
            out.println("<h1>ocjena " + grade + "</h1>");
            out.println("<h1>datum " + date + "</h1>");
            out.println("</body>");
            out.println("</html>");
             out.println("<head>");
            out.println("<link rel=\"stylesheet\" type= \"text/css\" href=\"style.css\">");
            out.println("</head>");
            out.println("<div class=\"loginbox2\">");
            out.println(" <form action= teacher_index_page.jsp method=POST\">\n"
                    + "                   <input type=\"submit\" name=\"\" value=\"Nazad na pocetnu stranicu\">\n"
                    + "               </form>");
            out.println("</div>");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(GradeStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(GradeStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
