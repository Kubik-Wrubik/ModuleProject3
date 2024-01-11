<%@ page import="answers.UFOAnswer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Going to negotiations</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <h1 style="font-weight:lighter"><%=((UFOAnswer)session.getAttribute("answer")).getMessage()%></h1>
    <h1>Піднятися на капітанський місток?</h1>
    <div class="form">
        <form action="/goingToNegotiations" method="post">
            <label>Піднятися на місток:</label>
            <input type="radio" name="choice" value="true"><br>
            <label>Відмовитись підніматися на місток:</label>
            <input type="radio" name="choice" value="false"><br>
            <input type="submit" value="Підтвердити">
        </form>
    </div>
</body>
</html>
