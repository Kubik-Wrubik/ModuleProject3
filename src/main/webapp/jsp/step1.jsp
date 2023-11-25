<%@ page import="answers.UFOAnswer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accepting UFO Challenge</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1 style="font-weight:lighter"><%=((UFOAnswer)session.getAttribute("answer")).getMessage()%>.</h1>
    <h1>Прийняти виклик НЛО?</h1>
    <div class="form">
        <form action="/step1" method="post">
            <label>Прийняти виклик:</label>
            <input type="radio" name="choice" value="true"><br>
            <label>Відхилити виклик:</label>
            <input type="radio" name="choice" value="false"><br>
            <input type="submit" value="Підтвердити">
        </form>
    </div>
</body>
</html>
