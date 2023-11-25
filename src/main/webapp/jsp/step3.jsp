<%@ page import="answers.UFOAnswer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Speaking with aliens</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<h1 style="font-weight:lighter"><%=((UFOAnswer)session.getAttribute("answer")).getMessage()%></h1>
<h1>Хто ви?</h1>
<div class="form">
    <form action="/step3" method="post">
        <label>Розповісти правду про себе:</label>
        <input type="radio" name="choice" value="true"><br>
        <label>Збрехати про себе:</label>
        <input type="radio" name="choice" value="false"><br>
        <input type="submit" value="Підтвердити">
    </form>
</div>
</body>
</html>
