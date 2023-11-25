<%@ page import="answers.UFOAnswer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Victory</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1 style="font-weight:lighter"><%=((UFOAnswer)session.getAttribute("answer")).getMessage()%></h1>
    <h1>Перемога</h1>
    <div class="form">
        <form action="/">
            <input type="submit" value="Повернутись на головну сторінку">
        </form>
    </div>
</body>
</html>
