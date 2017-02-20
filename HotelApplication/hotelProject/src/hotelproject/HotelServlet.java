package hotelproject;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Enumeration;

import java.util.Iterator;

import javax.servlet.*;
import javax.servlet.http.*;

public class HotelServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        
        //Steva
        //String atmName = request.getParameter("atmName");
        
        String regId = request.getParameter("regId");
        String distCity = request.getParameter("distCity");
        String distName =  request.getParameter("distName");
        String startDate =  request.getParameter("startDate");
        String endDate =  request.getParameter("endDate");
        String lengthStay = request.getParameter("lengthStay");
        String minStar = request.getParameter("minStar");
        String maxStar = request.getParameter("maxStar");
                                                                
                                                                
                                                    

        
        out.println("<p>Region ID: " + regId + "</p>");
        out.println("<p>Distination city: " + distCity + "</p>");
        out.println("<p>Distination name: " + distName + "</p>");
        out.println("<p>Trip start date: " + startDate + "</p>");
        out.println("<p>Trip end date: " + endDate + "</p>");
        out.println("<p>Length of stay: " + lengthStay + "</p>");
        out.println("<p>Minimum star rate: " + minStar + "</p>");
        out.println("<p>Maximum star rate: " + maxStar + "</p>");
     
        out.close();
    }
    private static String jsonFile = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
 
        JSONObject jObj = new JSONObject(request.getParameter("jsonFile")); // this parses the json
        Iterator it = jObj.keys(); //gets all the keys

        while(it.hasNext())
        {
            Object session;
            String key = (String)it.next(); // get key
            Object o = jObj.get(key); // get value
           // session.putValue(key, o); // store in session
        }
        
      
        out.close();
    }

    private static class JSONObject {
        private JSONObject(String string) {
        }

        private Iterator keys() {
            return null;
        }

        private Object get(String string) {
            return null;
        }
    }
}
