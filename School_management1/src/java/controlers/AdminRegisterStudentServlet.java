
package controlers;

import entity.Students;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Services;

@WebServlet(name = "AdminRegisterStudentServlet", urlPatterns = {"/AdminRegisterStudentServlet"})
public class AdminRegisterStudentServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
  
        String name = request.getParameter("name");
        String parents = request.getParameter("parents");
        String surname = request.getParameter("surname");
        int dob = Integer.valueOf(request.getParameter("dob"));
        int clas = Integer.valueOf(request.getParameter("clas"));
        int subclas = Integer.valueOf(request.getParameter("subclas"));

        try (PrintWriter out = response.getWriter()) {
           
            try {
                Services.insertStudent(new Students(name, parents, surname, dob, clas, subclas));
            } catch (SQLException ex) {
                ex.getMessage();
            }
            out.println("Uspjesno ste registrovali novog ucenika:");
            out.println("Ime ucenika :" + name);
            out.println("Ime roditelja :" +parents);
            out.println("Prezime ucenika: " + surname);
            out.println("Godina rodjenja: " + dob);
            out.println("Razred: " + clas);
            out.println("Odjeljenje: " + subclas);
            out.println("Uspjesno ste registrovali novog ucenika:");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type= \"text/css\" href=\"style.css\">");
            out.println("</head>");
            out.println("<div class=\"loginbox2\">");
            out.println(" <form action= admin_index.jsp method=POST\">\n"
                    + "                   <input type=\"submit\" name=\"\" value=\"Nazad na početnu stranicu\">\n"
                    + "               </form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
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
