<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 02/09/2023
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
  <link rel="stylesheet" href="/khung_suon/form_product.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
        crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
  <link rel="stylesheet" href="/khung_suon/form.css">
  <link rel="stylesheet" href="/khung_suon/cart.css">
</head>
<body>
<div class="header">
  <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="logo ">
      <img src="/khung_suon/img.png"
           alt="">
    </div>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
            aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="nav-list navbar-nav me-auto mb-2 mb-lg-0">
        <div class="nav-links">
          <li>
            <div class="dropdown" id="admin">
              <a style="font-weight: bold; border: unset" class="btn" type="button"
                 data-bs-toggle="offcanvas" data-bs-target="#offcanvasTop" aria-controls="offcanvasTop">
                Admin
              </a>
            </div>
          </li>

          <li>
            <a href="/admin_home.jsp">Trang chủ</a>
          </li>
            <h2 style="margin: 15px 123px;">Danh sách người dùng</h2>
        </div>

      </ul>
    </div>
  </nav>
</div>

<%--    danh sách phân quyền admin--%>
<div class="offcanvas offcanvas-top" tabindex="-1" id="offcanvasTop" aria-labelledby="offcanvasTopLabel">
  <div class="offcanvas-header">
    <h3 class="offcanvas-title" id="offcanvasTopLabel">Danh sách quản lý bởi Admin</h3>
    <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
  </div>
  <div class="offcanvas-body">
    <ul class="nav-list navbar-nav me-auto mb-2 mb-lg-0">
      <div class="nav-links">
        <li>
          <a href="/user_management.jsp">Quản lí người dùng</a>
        </li>
        <li>
          <a href="">Quản lí Sản phẩm</a>
        </li>
      </div>
    </ul>
  </div>
</div>

<%--    hết--%>

<div class="none"></div>
<br>

<!--content-->
<div class="edit-user">
  <form style="margin: 0 auto;
    width: 465px;
    color: white;
    background: burlywood;
    border: 2px solid rgba(255, 255, 255, .2);
    border-radius: 13px;
    padding: 34px 11px;
    box-shadow: 4px 5px 5px black;">
    <div class="mb-3">
      <label class="form-label">Id người dùng</label>
      <input type="number" class="form-control" aria-describedby="emailHelp" readonly autofocus>
    </div>
    <div class="mb-3">
      <label class="form-label">Tên người dùng</label>
      <input type="text" class="form-control" >
    </div>
    <div class="mb-3">
      <label class="form-label">Ngày sinh</label>
      <input type="date" class="form-control">
    </div>
    <div class="mb-3">
      <label class="form-label">Giới tính</label>
      <input type="text" class="form-control" readonly>
    </div>
    <div class="mb-3">
      <label class="form-label">Số điện thoại</label>
      <input type="number" class="form-control">
    </div>
    <div class="mb-3">
      <label class="form-label">Email</label>
      <input type="email" class="form-control">
    </div>
    <div class="mb-3">
      <label class="form-label">Địa chỉ</label>
      <input type="text" class="form-control">
    </div>
    <div class="mb-3">
      <label class="form-label">Tài khoản user</label>
      <input type="text" class="form-control">
    </div>
    <button style="    background: black;
    margin: 14px 132px;
    height: 57px;
    width: 163px;
    font-size: 25px;" type="submit" class="btn btn-primary">Xác nhận</button>
  </form>
</div>



<%--modal--%>
<div class="modal" tabindex="-1" id="exampleModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <form action="customer?action=delete" method="post">
        <div class="modal-header">
          <h5 class="modal-title">Xóa user</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <input type="hidden" id="id" name="id">
          Bạn có chắc muốn xóa <span id="name_delete" class="text-danger"></span> ?
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
          <button style="background: grey;height: 43px;width: 77px;" type="submit" class="btn btn-primary">Xóa</button>
        </div>
      </form>
    </div>
  </div>
</div>

<script>
  function sendInfoToModal(id,name){
    document.getElementById("name_delete").innerText = name;
    document.getElementById("id").value = id;
  }
</script>

<%--hết--%>



<!--footer-->
<footer class="py-3 my-4">
  <hr>
  <p class="text-center text-body-secondary">© C0523G1 Group3</p>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>
