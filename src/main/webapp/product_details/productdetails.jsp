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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
    <link rel="stylesheet" href="productdetails.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
</head>
<body>
<div class="header">
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="logo">
            <img src="logo_pixian.png"
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
                    <li><a href="index.jsp">Trang chủ</a></li>

                    <li>
                        <a data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
                            Sản phẩm
                        </a>
                    </li>

                    <li><a href="/profile_card/profilecard.jsp" target="_blank">Liên hệ</a></li>
                    </li>
                </div>

                <div class="nav-btns">
                    <button class="btn-primary"><a
                            href="/login/login.jsp">Đăng
                        nhập</a></button>

                    <div class="search-box">
                        <input list="topics" class="search-box-input" type="text" placeholder="Tìm tên sản phẩm...">
                        <datalist id="topics">
                            <option value="Ghế Văn Phòng Tay Gập Chân Xoay Xiaomi Manson Oasis Màu Đen">
                            <option value="Gác Chân Công Thái Học Ergonomic Footrest Ghế Kê Chân Văn Phòng - Phiên Bản Hợp Kim Phủ Nano, Manson FR-09">
                            <option value="Ghế Công Thái Học Manson Vera Lưới Vân Rồng Đen, Lưng Nâng Hạ, Mặt Ngồi Trượt, Tay 3D, Piston 4 Cấp BIFMA">
                            <option value="Ghế Văn Phòng Tay Gập Xiaomi Manson Ergonomic - Trắng">
                            <option value="Bàn SMARTDESK GAMING">
                            <option value="Bàn SMARTDESK GAMING BLACK PC">
                            <option value="Bàn SMARTDESK STUDIO PRO">
                            <option value="Bàn SMARTDESK STUDIO PIANO">
                            <option value="BỘ BÁNH XE CHỊU LỰC BÀN SMARTDESK">
                            <option value="Giá Treo CPU Buddy">
                        </datalist>
                        <button type="submit" class="search-box-btn">
                            <i class='bx bx-search-alt'></i>
                        </button>
                    </div>



                    <!--                          giỏ hàng-->
                    <button class="search-box-cart" type="submit" class="btn btn-primary" type="button"
                            data-bs-toggle="offcanvas"
                            data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">
                        <i class="fa-solid fa-cart-plus"></i>
                    </button>
                </div>
            </ul>
        </div>
    </nav>
</div>

<!--    danh sách option sản phẩm-->
<div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
    <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasExampleLabel" style="font-weight: bold">
            Ergonomic3 Store
            <i class="fa-solid fa-bag-shopping"></i>
        </h5>
        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
    </div>
    <div class="offcanvas-body">
        <div>
            Chúng tôi đặt quyền lợi khách hàng lên hàng đầu,
            cung cấp các dịch vụ và trải nghiệm tuyệt vời nhất cho khách hàng về sản phẩm tại shop
        </div>
        <div class="dropdown mt-3">
            <button id="selection-product" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
                Xem sản phẩm của shop tại đây
            </button>
            <ul class="dropdown-menu">
                <li><a style="font-weight: bold" class="dropdown-item" href="/product-servlet?action=showListChair">Ghế công thái học</a></li>
                <li><a style="font-weight: bold" class="dropdown-item" href="/product-servlet?action=showListDesk">Bàn công thái học</a></li>
                <li><a style="font-weight: bold" class="dropdown-item" href="/product-servlet?action=showListAccessories">Phụ kiện công thái học</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a style="font-weight: bold" class="dropdown-item" href="#">
                    Sản phẩm HOT
                    <i class="fa-solid fa-fire"></i>
                </a></li>
            </ul>
        </div>
    </div>
</div>
<!--    hết-->

<!--    menu giỏ hàng-->
<form action="" method="">
    <div style="background: grey" class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
        <div class="offcanvas-header">
            <h3 class="offcanvas-title" id="offcanvasRightLabel">Giỏ hàng của bạn</h3>
            <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
        </div>
        <div class="offcanvas-body">
            Giỏ hàng của bạn đang trống !
        </div>
        <hr>
        <div class="price-product">
            <h4 class="total-price">Tổng tiền</h4>
            <h4 class="price">0 đ</h4>
        </div>
        <p style="font-size: 13px; margin: 19px 14px">Phí vận chuyển sẽ được tính khi bạn thanh toán sản phẩm</p>
        <button class="buy-product" type="submit">
            Thanh Toán
        </button>
    </div>
</form>
<!--    hết-->

<div class="none"></div>
<br>

<!--header-->
<div class="header">
    <!--//chi tiết sản phẩm-->
    <div class="header-content">
        <div class="row">
            <!--        ảnh-->
            <div class="col-xl-5 col-md-12">
                <div class="hero-img">
                    <img src="top7.jpg" alt="">
                </div>
            </div>


            <div class="col-xl-7 col-md-12">
                <div class="intro-text col-md-12">
                    <h1>Ghế Công Thái Học Manson Vera Lưới Wintex Xám Gác Chân, Lưng Nâng Hạ, Mặt Ngồi Trượt, Tay 3D,
                        Piston 4 Cấp BIFMA</h1>

                    <div class="container text-center">
                        <div class="row">
                            <p id="old-price">10.890.000 đ</p>
                            <p id="new-price">7.800.000 đ</p>
                        </div>
                    </div>
                    <h3 id="intro">Với cơ chế Lưng nâng hạ cải tiến của Manson Vera, lưới Wintex Hàn Quốc, phần lưng phụ
                        độc lập giúp dễ dàng điều chỉnh linh động đến 8cm, mặt ngồi trượt 5cm, tay nâng hạ 3D và Piston
                        4 cấp tiêu chuẩn BIFMA</h3>
                    <div class="btns">
                        <button class="btn-primary" type="submit">
                            Thêm vào giỏ hàng
                            <i class="fa-solid fa-cart-shopping"></i>
                        </button>
                        <button class="btn-primary" type="submit">
                            Mua ngay
                            <i class="fa-brands fa-rebel"></i>
                            <p style="font-size: 14px; text-align: center; font-style: italic">Ship cod tại nhà toàn
                                quốc</p>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--    hết-->
</div>


<!--footer-->
<footer class="py-3 my-4">
    <hr>
    <p class="text-center text-body-secondary">© C0523G1 Group3</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
<script src="/product/search.js"></script>
</body>
</html>
