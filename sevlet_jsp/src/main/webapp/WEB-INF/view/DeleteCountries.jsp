<%--
  Created by IntelliJ IDEA.
  User: zeezx
  Date: 10/27/2021
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
    <script language="javascript" src="http://code.jquery.com/jquery-2.0.0.min.js"></script>
</head>
<body>
    <form action="deletecountries" method="post">
        <h4>Delete ID:</h4>
        <input type="text" name="countryID" id="id">
        <input type="submit" id="delete" value="Delete">
    </form>
    <a href="showcountries">Show Countries</a><br>
    <a href="/index.jsp">Home</a>
</body>
<script language="JavaScript">
    $(document).ready(function() {
        $(document).on("click", "#delete" , function (e) {
            e.preventDefault();
            var countryID = document.getElementById("id").value;
            if (confirm("Bạn có chắc muốn xóa ID: ") === true) {
                $.ajax({
                    url: "/deletecountries",
                    type: "post",
                    data: {
                        countryID: countryID
                    },
                    success: function (result) {
                        console.log('success')
                        alert("Xóa thành công ID: " + countryID)
                    },
                    error: function (request, status, error) {
                        alert("ID không tồn tại!")
                    }
                })
            }
        })
    })
</script>

</html>
