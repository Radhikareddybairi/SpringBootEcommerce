<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 </head>
 <body>
 <div class="container">
 <h1>Cart Form</h1>

<div>
<form:form   modelAttribute="cart" action="/spring/addCart" method="post">
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <td><form:label path="cartId"  >Cart Id:</form:label></td>
 <td><form:input path="cartId" value="${cart.cartId}" readonly="true" /></td>
 <td><form:errors path="cartId" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="cartQuantity"> No of Products:</form:label></td>
 <td><form:input path="cartQuantity" value="${cart.cartQuantity}"/></td>
 <td><form:errors path="cartQuantity" cssClass="error" /></td>
 </tr>
 
 
 
  <tr>
 <td colspan="2"><input type="submit" value="Add cart"/></td>
 </tr>
 </table>
 </form:form>
</div>


<div>
<c:if test="${!empty carts}">
 <h2>List of carts</h2>
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <th>Cart Id</th>
 <th>No Of Products</th>
 

 
</tr>
<c:forEach items="${carts}" var="c">
<tr>
<td>${c.cartId}</td>
<td>${c.cartQuantity}</td>


<td align="center">
<a href="/edit/${c.cartId}">
<input type="button" value="EDIT" class="btn btn-info">
</a> 
</td>
<td>
<a href="/delete?id=${c.cartId}">
<input type="button" value="DELETE" class="btn btn-primary">
</a></td>
</tr>
</c:forEach>
</table>
 </c:if>
 
 
 </div>
</div>
 </body>
 </html>