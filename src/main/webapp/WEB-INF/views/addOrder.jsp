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
 <h1>Order Form</h1>

<div>
<form:form   modelAttribute="order" action="/spring/addOrder" method="post">
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <td><form:label path="orderId"  >Order Id:</form:label></td>
 <td><form:input path="orderId" value="${order.orderId}" readonly="true" /></td>
 <td><form:errors path="orderId" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="orderNumber"> Order Number:</form:label></td>
 <td><form:input path="orderNumber" value="${order.orderNumber}"/></td>
 <td><form:errors path="orderNumber" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="orderName"> Name:</form:label></td>
 <td><form:input path="orderName" value="${order.orderName}"/></td>
 <td><form:errors path="orderName" cssClass="error" /></td>
 </tr>
 
 
 <tr>
 <td><form:label path="orderDate">Date of Order:</form:label></td>
 <td><form:input path="orderDate" value="${order.orderDate}"/></td>
 <td><form:errors path="orderDate" cssClass="error" /></td>
 </tr>
 
 
 <tr>
 <td><form:label path="orderAmount">Amount:</form:label></td>
 <td><form:input path="orderAmount" value="${order.orderAmount}"/></td>
 <td><form:errors path="orderAmount" cssClass="error" /></td>
 </tr>
 
  <tr>
 <td colspan="2"><input type="submit" value="Add Order"/></td>
 </tr>
 </table>
 </form:form>
</div>


<div>
<c:if test="${!empty orders}">
 <h2>List of Orders</h2>
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <th>Order Id</th>
 <th>Order Number</th>
 <th>Order Name</th>
<th>Order Date</th>
<th>Amount</th> 
</tr>
<c:forEach items="${orders}" var="o">
<tr>
<td>${o.orderId}</td>
<td>${o.orderNumber}</td>
<td>${o.orderName}</td>
<td>${o.orderDate}</td>
<td>${o.orderAmount}</td>
<td align="center">
<a href="/edit/${o.orderId}">
<input type="button" value="EDIT" class="btn btn-info">
</a> 
</td>
<td>
<a href="/delete?id=${o.orderId}">
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