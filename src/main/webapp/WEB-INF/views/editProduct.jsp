<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
    <h2>Edit Product</h2>
    <form:form modelAttribute="product" method="post" action="${pageContext.request.contextPath}/products/editProduct/${productid}">
        <table>
            <tr>
                <td>Product ID:</td>
                <td><form:input path="productid" readonly="true" /></td>
            </tr>
            <tr>
                <td>Product Name:</td>
                <td><form:input path="productname" /></td>
            </tr>
            <tr>
                <td>Category ID:</td>
                <td><form:input path="categoryid" /></td>
            </tr>
            <tr>
                <td>Subcategory ID:</td>
                <td><form:input path="subcategoryid" /></td>
            </tr>
            <tr>
                <td>Product Description:</td>
                <td><form:input path="productdescription" /></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><form:input path="price" /></td>
            </tr>
            <tr>
                <td>Quantity:</td>
                <td><form:input path="quantity" /></td>
            </tr>
        </table>
        <input type="submit" value="Save" />
    </form:form>
</body>
</html>
