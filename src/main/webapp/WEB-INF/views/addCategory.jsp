<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>${action == 'edit' ? 'Edit Category' : 'Add New Category'}</title>
</head>
<body>
    <h1>${action == 'edit' ? 'Edit Category' : 'Add New Category'}</h1>
    <form action="${action == 'edit' ? 'updateCategory' : 'addCategory'}" method="post">
        <input type="hidden" name="id" value="${categoryid}">
        <label for="name">Name:</label>
        <input type="text" name="name" value="${categoryname}" required>
        <br>
        <input type="submit" value="${action == 'edit' ? 'Update' : 'Add'}">
    </form>
    <br>
    <a href="products">Back to Product List</a>
</body>
</html>
