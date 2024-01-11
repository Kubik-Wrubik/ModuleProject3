<%@ page import="answers.UFOAnswer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Defeat</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1 style="font-weight:lighter"><%=((UFOAnswer)session.getAttribute("answer")).getMessage()%></h1>
    <h1>Поразка</h1>
    <div class="form">
        <form action="/startChallenge" method="post">
            <input type="hidden" name="choice" value="true">
            <input type="submit" value="Спробувати ще раз">
        </form>
    </div>
</body>
</html>
