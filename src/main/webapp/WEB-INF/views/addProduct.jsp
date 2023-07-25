<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>${action == 'edit' ? 'Edit Product' : 'Add New Product'}</title>
</head>
<body>
    <h1>${action == 'edit' ? 'Edit Product' : 'Add New Product'}</h1>
    <form action="${action == 'edit' ? 'updateProduct' : 'addProduct'}" method="post">
        <input type="hidden" name="id" value="${product.productid}">
        <label for="name">Name:</label>
        <input type="text" name="name" value="${product.productname}" required>
        <br>
        <label for="category">Category:</label>
        <select name="categoryId">
            <c:forEach items="${categories}" var="category">
                <option value="${categoryid}" ${product.categoryid == categoryid ? 'selected' : ''}>${categoryname}</option>
            </c:forEach>
        </select>
        <br>
        <label for="subCategory">Sub-category:</label>
        <select name="subCategoryId">
            <c:forEach items="${subcategories}" var="subCategory">
                <option value="${subcategoryid}" ${product.subcategoryid == subcategoryid ? 'selected' : ''}>${subcategoryname}</option>
            </c:forEach>
        </select>
        <br>
        <label for="description">Description:</label>
        <input type="text" name="description" value="${product.description}" required>
        <br>
        <label for="price">Price:</label>
        <input type="number" name="price" value="${product.price}" step="0.01" required>
        <br>
        <label for="quantity">Quantity:</label>
        <input type="number" name="quantity" value="${product.quantity}" required>
        <br>
        <input type="submit" value="${action == 'edit' ? 'Update' : 'Add'}">
    </form>
    <br>
    <a href="products">Back to Product List</a>
</body>
</html>
