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
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container-fluid">
  <div class="container" style="text-align: center ; margin: 6% ;margin-top: 50px ;background: #bb2d3b">
    <div class="row" style="display: flex">
      <form method="post" action="/product-servlet?action=createProduct" style="display: flex">
        <div class="col-md-6">
          <div class="col-md-6">
            <img id="imagePreview" src="#" alt="Ảnh xem trước" width="300px" height="300px">
            <br><br>
            <input type="file" id="fileInput" onchange="displayImage(event)">

          </div>
        </div>
        <div class="col-md-6">
          <br><br>
          <h1>Thêm mới sản phẩm</h1>
          <br><br>
          <div>
            <h3>Tên sản phẩm</h3>
            <input style="width: 350px ; height: 40px" name="product_name">
          </div>
          <div>
            <h3>Giá cũ sản phẩm</h3>
            <input style="width: 350px ;height: 40px" name="old_price">
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
          <div style="display: inline flex ">
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
              <button type="submit"
                      style="border-radius: 10px ; width: 100px ; background: #1e47e5 ; color: white">
                Thêm mới
              </button>
            </div>
          </div>
          <br><br>
        </div>
      </form>
    </div>
  </div>
</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>

  <script>
    function displayImage(event) {
    const fileInput = event.target;
    const imagePreview = document.getElementById('imagePreview');

    const file = fileInput.files[0];
    const reader = new FileReader();

    reader.onload = function(e) {
    imagePreview.src = e.target.result;
  }

    reader.readAsDataURL(file);
  }
</script>
<script>
  var inputFile = document.getElementById('fileInput');

  // Đăng ký sự kiện "change" cho input file
  inputFile.addEventListener('change', function(event) {
    // Lấy danh sách các tệp đã chọn
    var files = event.target.files;

    // Kiểm tra xem đã chọn tệp nào hay chưa
    if (files.length > 0) {
      // Lấy tệp đầu tiên trong danh sách
      var file = files[0];

      // Hiển thị thông tin tệp
      console.log('Tên tệp: ' + file.name);
      console.log('Kích thước: ' + file.size + ' bytes');
      console.log('Loại tệp: ' + file.type);
    }
  });
</script>






</html>
