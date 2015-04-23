<html>
<head><title>Your BMI Results</title></head>
<body>
  <%--
 show the result here by extracting the attribute you set
  --%>
  <% 
  	String result = request.getAttribute("result").toString(); 
  %>
  <p><%= result %></p>
</body>
</html>
