    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">



	<h1>Students List</h1>
	<table border="2" width="70%" cellpadding="2" class="table table-striped">
	
	
	<tr><th>Name</th><th>Roll No</th><th>View/Edit Marks</th><th>Delete</th></tr>
    
    
    <c:forEach var="Student" items="${list}"> 
  
    <tr>

    <td>${Student.name}</td>
    <td>${Student.department}</td>
    <td><a href="editstu/${Student.id}">View/Edit</a></td>
    <td><a href="deletestu/${Student.id}">Delete</a></td>
    </tr>
    
    </c:forEach>
    </table>
    <br/>
    <a href="stuform/">Add New Student</a>