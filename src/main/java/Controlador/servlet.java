package Controlador;

@WebServlet("/servlet")
public class servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String campo1 = request.getParameter("campo1");
        String campo2 = request.getParameter("campo2");
        String campo3 = request.getParameter("campo3");
        String campo4 = request.getParameter("campo4");
        String campo5 = request.getParameter("campo5");

        Tabla Tabla = new Tabla();
        Tabla.setCampo1(campo1);
        Tabla.setCampo2(campo2);
        Tabla.setCampo3(campo3);
        Tabla.setCampo4(campo4);
        Tabla.setCampo5(campo5);

        TablaDAO TablaDAO = new TablaDAO();
        TablaDAO.create(Tabla);
        TablaDAO.edit(Tabla);
        TablaDAO.destroy(Tabla);

        response.sendRedirect("index.jsp");
    }
}
