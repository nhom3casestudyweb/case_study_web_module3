<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 9/7/2023
  Time: 8:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container-fluid">
    <div class="container" style="text-align: center ; margin: 6% ;margin-top: 50px ;background: #bb2d3b" >
        <form method="post" action="/product-servlet?action=createProduct">
            <br><br>
            <h1>Thêm mới sản phẩm</h1>
            <br><br>
            <div>
                <h3>Tên sản phẩm</h3>
                <input style="width: 350px ; height: 40px" name="product_name">
            </div>
            <div>
                <h3>Giá sản phẩm</h3>
                <input style="width: 350px ;height: 40px" name="product_price">
            </div>
            <div>
                <h3>Mô tả sản phẩm</h3>
                <input style="width: 350px ;height: 40px" name="product_description">
            </div>
            <br>
            <div style="display: inline flex " >
                <h3>Kiểu sản phẩm &nbsp &nbsp &nbsp</h3>
                <select name="product_type" style="height: 40px ; width: 200px">
                    <option value="1">Bàn thông minh</option>
                    <option value="2">Ghế công thái học</option>
                    <option value="3">Phụ kiện</option>
                </select>
            </div>
            <br>
            <br>
            <div>
                <h3>Số lượng</h3>
                <input style="width: 350px ; height: 40px" name="product_inventory">
            </div>
            <br><br>
            <div style="display: inline flex">
                <div style="padding-right: 250px">
                    <button style="border-radius: 10px ; width: 100px ; background: #1e47e5 ;color: white">
                        <a style="text-decoration: none" href="/product-servlet">Thoát</a>
                    </button>
                </div>
                <div>
                    <button type="submit" style="border-radius: 10px ; width: 100px ; background: #1e47e5 ; color: white">
                        Thêm mới
                    </button>
                </div>
            </div>
            <br><br>
        </form>
    </div>
</div>
</body>

<script>


</script>
</html>
