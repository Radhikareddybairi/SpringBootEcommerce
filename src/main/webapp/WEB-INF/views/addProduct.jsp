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
 <h1>Product Form</h1>

<div>
<form:form   modelAttribute="product" action="/spring/addProduct" method="post">
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <td><form:label path="productId"  >Product Id:</form:label></td>
 <td><form:input path="productId" value="${product.productId}" readonly="true" /></td>
 <td><form:errors path="productId" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="productName"> Name:</form:label></td>
 <td><form:input path="productName" value="${product.productName}"/></td>
 <td><form:errors path="productName" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="productPrice"> Address:</form:label></td>
 <td><form:input path="productPrice" value="${product.productPrice}"/></td>
 <td><form:errors path="productPrice" cssClass="error" /></td>
 </tr>
 
 
 
  <tr>
 <td colspan="2"><input type="submit" value="Add Product"/></td>
 </tr>
 </table>
 </form:form>
</div>


<div>
<c:if test="${!empty products}">
 <h2>List of Products</h2>
 <table class="table table-stripped table-responsive table-hover">
  <tr>
 <th>Product Id</th>
 <th>Name</th>
 <th>Cost</th>

 
</tr>
<c:forEach items="${products}" var="p">
<tr>
<td>${p.productId}</td>
<td>${p.productName}</td>
<td>${p.productPrice}</td>

<td align="center">
<a href="/edit/${p.productId}">
<input type="button" value="EDIT" class="btn btn-info">
</a> 
</td>
<td>
<a href="/delete?id=${p.productId}">
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