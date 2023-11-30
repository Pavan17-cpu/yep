<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title> Work List</title>
</head>
<body>
    <table border="1px">
        <tr>
        <th>Id</th>
          <th>Work</th>  
          <th>End Date</th>
          <th>Type</th>
        </tr>
        <%@ page import="com.p1.trail.model.Work"  %>
        <%@ page import="java.util.*"  %>

    <% for(Work w: (List<Work>)request.getAttribute("wk")){  %>
      <tr>
        <td><%= w.getId() %></td>
        <td><%= w.getWorkname() %></td>
        <td><%= w.getEnddate() %></td>
        <td><%= w.getWorktype() %></td>
      </tr>


   <% } %>
    </table>

</body>
</html>
