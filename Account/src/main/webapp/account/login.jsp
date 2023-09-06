<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/6/2023
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link rel="stylesheet" >
  <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <link rel="stylesheet" href="/account/login.css">
</head>
<body>

<form class="form-signin" action="">
  <div class="row">
    <div class="col col-xl">
      <div class="wrapper">
        <div class="class-img">
          <img src="/account/user.jpg"/>
        </div>
        <div class="input-box">
          <input id="userName" type="text" placeholder="Tên đăng nhập hoặc email" required autofocus>
          <i class='bx bxs-user-circle'></i>
        </div>
        <div class="input-box">
          <input id="password" type="password" placeholder="Mật khẩu" required>
          <i class='bx bxs-lock'></i>
        </div>
        <div class="remember-forgot">
                    <span class="col-md-6 col-xl">
                        <label>
                            <input type="checkbox"> Nhớ mật khẩu
                        </label>
                    </span>
          <span class="col-md-6 col-xl">
                        <a href="/account?action=forgotPassword">Quên mật khẩu?</a>
                    </span>
        </div>
        <button class="btn" type="submit" >
          Đăng nhập
        </button>
        <div class="register-link">
          <p>Không có tài khoản ? <a href="/account/create.jsp">Đăng ký</a></p>
        </div>
      </div>
    </div>
  </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>
