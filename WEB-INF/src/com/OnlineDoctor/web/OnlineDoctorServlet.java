package com.OnlineDoctor.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.OnlineDoctor.model.DataGenerator;

public class OnlineDoctorServlet extends HttpServlet {

	DataGenerator d = new DataGenerator();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String name;
	String height;
	String weight;
	/* retrieve values for name, ,height and weight from the html form*/
	String bmi;

	
	try
	{
		float h = Float.parseFloat(height);
		float w = Float.parseFloat(weight);

	/*check whether the height and weight are floating values which are greater than zero. If there are errors, generate appropriate error messages. 
create a DataGenerator object, give inputs and get the results into the bmi variable. 
*/
	}
	catch(Exception ex)
	{
		bmi = "There is an error in the entered data";
	}
/* now set an attribute and dispatch the request to result.jsp */	
}
}
