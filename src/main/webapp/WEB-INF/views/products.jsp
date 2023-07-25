<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
     <!-- Search Bar -->
    <form action="searchProducts" method="get">
        <input type="text" name="searchKeyword" placeholder="Search by product name">
        <input type="submit" value="Search">
    </form>
    <table border="1">
        <tr>
            <th>ProductID</th>
            <th>ProductName</th>
            <th>CategoryID</th>
            <th>Sub-categoryID</th>
            <th>Description</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.productid}</td>
                <td>${product.productname}</td>
                <td>${product.categoryid}</td>
                <td>${product.subcategoryid}</td>
                <td>${product.productdescription}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td><a href="editProduct?id=${product.productid}">Edit</a></td>
                <td><a href="deleteProduct?id=${product.productid}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="addProduct">Add New Product</a>
</body>
</html>
