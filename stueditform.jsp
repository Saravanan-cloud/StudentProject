<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

		<h1>Edit Student</h1>
       <form:form method="POST" action="/StudentPortal/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Roll No :</td>  
          <td><form:input path="department" /></td>
         </tr> 
         <tr>  
          <td>Tamil :</td>  
          <td><form:input path="tamil" /></td>
         </tr> 
          <td>English :</td>  
          <td><form:input path="english" /></td>
         </tr> 
          <td>Maths :</td>  
          <td><form:input path="maths" /></td>
         </tr> 
         
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit & Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
