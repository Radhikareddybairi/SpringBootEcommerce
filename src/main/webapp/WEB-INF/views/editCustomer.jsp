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
 <h1>Customer Form</h1>

<div>
<form:form   modelAttribute="customer" action="/spring/updateCustomer" method="post">
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <td><form:label path="customerId"  >Customer Id:</form:label></td>
 <td><form:input path="customerId" value="${customer.customerId}" readonly="true" /></td>
 <td><form:errors path="customerId" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="customerName"> Name:</form:label></td>
 <td><form:input path="customerName" value="${customer.customerName}"/></td>
 <td><form:errors path="customerName" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="customerAddress"> Address:</form:label></td>
 <td><form:input path="customerAddress" value="${customer.customerAddress}"/></td>
 <td><form:errors path="customerAddress" cssClass="error" /></td>
 </tr>
 
 
 <tr>
 <td><form:label path="customerEmail">Email:</form:label></td>
 <td><form:input path="customerEmail" value="${customer.customerEmail}"/></td>
 <td><form:errors path="customerEmail" cssClass="error" /></td>
 </tr>
 
 
 <tr>
 <td><form:label path="customerPhoneNo">Contact Info:</form:label></td>
 <td><form:input path="customerPhoneNo" value="${customer.customerPhoneNo}"/></td>
 <td><form:errors path="customerPhoneNo" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="customerGender">Gender:</form:label></td>
 <td><form:input path="customerGender" value="${customer.customerGender}"/></td>
 <td><form:errors path="customerGender" cssClass="error" /></td>
 </tr>
 
 
  <tr>
 <td colspan="2"><input type="submit" value="Update Customer"/></td>
 </tr>
 </table>
 </form:form>
</div>


<div>
<c:if test="${!empty customers}">
 <h2>List of Customers</h2>
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <th>Customer Id</th>
 <th>Name</th>
 <th>Address</th>
 <th>Email</th>
 <th>Contact</th>
 <th>Gender</th>
</tr>
<c:forEach items="${customers}" var="c">
<tr>
<td>${c.customerId}</td>
<td>${c.customerName}</td>
<td>${c.customerAddress}</td>
<td>${c.customerEmail}</td>
<td>${c.customerPhoneNo}</td>
<td>${c.customerGender}</td>
<td align="center">
<a href="/edit/${c.customerId}">
<input type="button" value="EDIT" class="btn btn-info">
</a> 
</td>
<td>
<a href="/delete?id=${c.customerId}">
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