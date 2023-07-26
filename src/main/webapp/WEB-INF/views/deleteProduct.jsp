<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
    <h2>Delete Product</h2>
    <p>Are you sure you want to delete this product?</p>
    <p>Product ID: ${product.productid}</p>
    <p>Product Name: ${product.productname}</p>
    <form action="${pageContext.request.contextPath}/deleteProduct/${product.productid}" method="post">
        <button type="submit">Confirm Delete</button>
        <a href="${pageContext.request.contextPath}/products">Cancel</a>
    </form>
</body>
</html>
