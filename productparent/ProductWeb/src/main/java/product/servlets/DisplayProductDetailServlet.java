package product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import cnp.dao.ProductDAO;
import cnp.model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DisplayProductDetailServlet
 */
public class DisplayProductDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDAO bo = new ProductDAO();
		Product product = findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID: " + product.getId());
		out.print("Product Name: " + product.getName());
		out.print("Product Description: " + product.getDescription());
		out.print("Product Price: " + product.getPrice());
		
		
	}


	private Product findProduct(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}

}
