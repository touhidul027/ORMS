package company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateCompanyProfile
 */
@WebServlet("/UpdateCompanyProfile")
public class UpdateCompanyProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCompanyProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int companyId = Integer.parseInt(request.getParameter("companyId")); 
		String companyName = request.getParameter("companyName") ; 
		String company_address = request.getParameter("company_address") ; 
		String email = request.getParameter("email") ; 
		String cellPhoneNumber = request.getParameter("cellPhoneNumber") ; 
		String website = request.getParameter("website") ; 
		int size = Integer.parseInt(request.getParameter("size")) ; 
		String industryType = request.getParameter("industryType") ; 
		String founded = request.getParameter("founded") ; 
		String headQuarter = request.getParameter("headQuarter") ; 
		String publicInfo = request.getParameter("publicInfo") ; 
		
		Company company =new Company(companyId, companyName, headQuarter, founded, industryType, size, company_address, email, website, cellPhoneNumber, publicInfo) ; 
	
		CompanyDAO.updateCompany(company);
		response.sendRedirect("company/upDateCompanyProfile.jsp");
	}
}
