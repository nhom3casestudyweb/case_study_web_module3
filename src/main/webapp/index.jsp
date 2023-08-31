<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Công thái học</title>
    <link rel="stylesheet" href="home_page2.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
</head>
<body>
<div class="header">
    <!--    header-menu-->
    <%--    người viết: hậu--%>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
<%--        logo wed--%>
        <div class="logo ">
            <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOAAAADgCAMAAAAt85rTAAAAe1BMVEX///9ERET8/PxBQUHt7e0pKSlnZ2c9PT3y8vJsbGyJiYlGRkYtLS1CQkI1NTW/v79eXl7Hx8cyMjJ9fX2Kioo4ODiDg4Ph4eHGxsbNzc3c3NykpKTT09OamppNTU2srKxWVlZ1dXW1tbWenp6Tk5MWFhYdHR0AAAAjIyNJY066AAALtklEQVR4nO1dCXvjqg7FmHoJtvG+73F7+/9/4RPgpHG29vY2iZPHmX5TxzGMjgWSEMsgpKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoPBjYIwfLcJt8fIEq+DREtwMGP6gOEw69JpK5Kws26NuOKHXJIgQ6U1N06gXvR5BzH9qU9copRpNfPJogf4avH0yD7hpuqtRV6fZoyX6YwDBytF0Sr1Nq7tA03k1Y4rTEHqf5lSI+Ca/CrtHi/R3AN9uGQnozfUY/zgk0BU1Z+I+/yXMDUZZa2qupuuldIaTx62NNwjT8woouPnUzD6T1gajLoTPWtKTF3D5wGCUdAbr626Q6NARdb1GTx/WYGiQQI+GmwMmGJVgUjVNT/LnJxh5EL1oziIChUviJ8BQe6ueuhsCD8Pk3j3MT2jgwYNvaBij57Wl0BIpd3qmVp7jMIUiMjWs522mwWw+yRkKcKNzgCDlXz8lMCcA/Uz4u/MA/0FdzU3qe8r1V8AwuAXvPkcsF1BSnZughD1hN7QGz6UwvO2upGEwsrgxdalTPR1B0idA7xtHx4PRweNDxDB9JoYgd63x3mXycd91yTE3pvAqEtu6+tyqgBELRdcyyLdpQiwiU25r2ycaBFciepHDhW+aHn8BQci9iW4+gzEVCtvIwW1z4etTlK0p4rnx1uL9d+xyg5RHnz8vI0wSmJpm9e4CBrfUpDBSAOd9TlYIy06NCTemaahzhuvOKPKoueaeGzieRp9AoxggtLbT+pxpjR2eU0xWHZmCZOOb5rog5jkZie8kKUK++TacBKd8XOyIV2Ou2Jhi1IhsCzS0M1rgbdfkBHXKXcLRA9yY8mG+puvBSnUIDTQSPtvZnpOQ6CC+uREENV0jaNFOxWXWmtAP9ZAb0/VxlHGlK+Q7kQ5uDCC8JjUIejKHMw+JYT4EsMKYro7g/P5NcNfnBn+FyDztCVKnOKUg2wAMQSBEWJsGeQ9yuWZ4bvDc27fFuGhPUNPtM4/BjUYGeT5ZlwrBfIYutK7Et87LZYng7YCg5l0IrrkxdaWfWQ9FMSTg5nNzqe/UIT0iGF6KPAtd51GNF6xIhyJDBoPb7UXrF5xqMD9PAGIhTcTeq5mewRgiSWhVuphauYDiRIPJ5ciaGAmfSgxjvApbgy0xFjAvRJ8SpxpMqitVRiGfCvY2NxD3FyBC9LO5wT3YCUFzuvgwN6Yen7sw1jH9ZPEec8l8zmAiUU/1A4Kbq8J3iXQla4A1i3tN3vHT87zEcyKE+9DjCKNrdWILBherIUi/1QfKRsYxQvzCJMars/TrIxhffQQfXOCjW+dB1kbwusHDhwxP7p2t9LkIoo72HC2M6I1WXGrX0/XPRrBKdFd3pZswdd119fBKWICekKB5Eqq9FsHtqxNsFMHjSp+M4PTqBDfm8XDpxQjGQoOHwfY309bPRjCSEfZBsP35Whos2HGwza6n6J+N4Dm8VCz67ytVBO8HRfBXlSqC94Mi+KtKFcH7QRH8VaWK4P2gCP6qUkXwflAEf1XpQwku11JcJHhhf+Bueunc1/sbD9bgguFlDbLFHOByhgn4ZcebCQ4mnB6sQetHBLP39LDQvgye/+7fT6bQ9rt8HkgQY+z3P2miuB+qfRlUePPKn8Dhi5j4vmy7XS44hIf4NjxZ6SM1GNnD4cfzBDHq0qjYfcDE9EpxkZleJpRJEhYvCGJEaJ/vKn0gQWbE46KJaucJOmX71SjtpsVCSf5W3MUo3sbBEUGj25d4GEGMLLNuF13nQhMdhzyeiyBUGyxFJN+0lT3GiLBUrz1CF+vxMBrtcb8VAQjyZSSPWOm0rZoOLY2Mfo5gXxpyZTouisIf+rbv2yb3Iz5/PQVWNy1bKDzXZnRnZDBx6EMIggIptLylBk3TTE4Ilj3pJQErjQa9opmFN6mtVW0mFNdm/dHGpnFqvnb0kjeo1Lj/QicwHVs/WAqGiQVYPMQXWI4btvfm22qSBnXqNp14ouxLX1rO/bKSln29OSwrfQA/1EbHi8wWZPFOaLNs5bEH7xb/kAhhsQ4XokjM/HIukDHxdnK7L48rXTbhu9BliXH1HyJp24j9ddHsI3IGFPxJrsQv7U0lZW3HSHZQ3HiTza9s8/phSF1/l2NoDHplNTXwovlG2I54EL5SHshR6FSWyTUqS5d+T+atBDGZuLUtP2PRZKUPmdvCV83YaJhu4Uvx7Z+h/KilGGQa5DkNWbR/78Cm3RqRkNI25d7BQhD8mP13/jG7fvYhNkegLDRtX2gu9md+49CJQAdvMnlHsNrak1aKEuNNCVYN62thS92C8hujs4X3Km0MRszcloI2extFV+zeedga7Rznpp91ENlC8szZSpuKt06Zis0EzSf/F7gV7okFL1L2afw2BKIgodcnTv8roq1fmNx06HRsMRn7QbP7dqSJsA9E18RTVuzLMLR64+3OHloZh9a0lXak9nr+qzQ3wr3gorf9dNyA+SpDvTEKq4h63/AT1rvS+m4cqXoW3njDtu1kyIbW5VdWq7V+k7G3DfIdkregiExjrO3yMXJjTN6YVRhRSxDxY8REHyzDemwFP6e2Y5JNtEQxWGVbMwri+RCdWqhzsm3Y+lFhaS3pPjqsAzOc2oQ2OWtav/xGwP8KwwA5k8r+YJ0MtHyIF20YFY1uFVNwkFkVQ5jCHd0AUuKkrjzeWGO/rmN+kNPGgIuwQNbk2yNvfVkQlPzlfEDTa4zONWpdNMLxM0P5Oz9sJ67aCXoBm+Lx9mY04j4g64oMNCDEC+FXwTsKYfnX1r+9Ax/tShqbcRg6saq7g4vdgwd+3XrnG9JYl01DIcyKAaaH8I1oOGDZPh64uS8sjrdz4PnnZEHod5Ic+/DuqIAcU59ZZ3pj3OoVrma72a3EWAm9G/I7zj/d6B/6DW4hC76TTfkRrAjwxzupsDVApdM6GMKAV//zbUbk8zED3nN4wdT9Ev8fBK/vfPn3wGsiyNe3tsYfQ18ZQU3/Y9C1Efxj8PMQV0OQ3oKhJLgKN0HenLdbwPn0V+HoMSY3wxr43TRgXMU2c7SfjMf7ZOYuVkZHO+HxwdD84FqU2w3y8dftdUTbs2BoN/c+391/ffL8/NcXd4wO8r27Ond0byX2z4FR0TQik4HzKt7Km53MdlrNUn+kajYicVSmKSdIpm1XyYRnMaeEq6brOs6rqHi+/45ELiPuMl+sp4invBAikX/k+grLXKqgpDnjszCkrUveKi3WGLmY2kbD7PQKluTiPNntJg/WwQ81BapFLDoFc2NjaSpevqUtRczmU2TYtOu3wWYezhu2NfdjKr+pxpU0USDIiCFymc0wycRsWvZCNktfnhqTaY0YGRN9xHKiJU8lvzLuZE4ew0sRtCp7unY6xv2AUeXPCfYqZkTosEcbcaQRpss5TNLObTgb5umKIJrrYNm8dAPr8psxZd+ebXkndGPmi4tKzN7ybHQ6iDVAWLMWMhJ/f2nLDGswn/hgR+m8JgG7M8FqNcnErkLSyFRxLubJxgkhoQds1nV9ICWhgZjOtbLdSo1A6s1yoV3LOTaczASjIF9HF0RFjupRXMTcTWDUgXYacTbcNk6jgxlTa5qEm8jsRs5/olJmq7IGoVpe4q3UZB3HzTr4ocve/PDXN2UPU/73T9hfx9dsM56Dkl1sMt9dPIkXJb5il1Xnfk+AL37CCxX9eK5GQUFBQUFBQeFRWMmo4IZYSe7hhnhxhgFPaVTd64bUXYRw9s+T/vdDP0GXIiQOQH9VjH693O+EXmwEOJqTWe0mXPj/KElQ8FJWB5oofs8RJh0ueDaXNZhgUnxf8FnAN0mU/2DLRnVMptSqWcHYWs7R/guMfJ1QmlojYhUZ6xKVJCuz12mj80QolkBzDu2VOuFMZ/8z33qwVH+NuoYfXGeWTIO/Gj2EWUG6DLGa2K/p8nFeoKDAeQ029OW0x/HVB1cyKaagoKCgoKCgoKCgoKCgoKCgoKCgoPCU+B+pgagX4So7CwAAAABJRU5ErkJggg=="
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
                    <li><a href=""></a>Trang chủ</li>
                    <li><a href=""></a>Sản phẩm</li>
                    <li><a href="https://nhom3casestudyweb.github.io/demo_profile_card/">Liên hệ</a></li>
                </div>

                <div class="nav-btns">
                    <%--                    đăng nhập--%>
                    <button class="btn-primary"><a
                            href="http://localhost:63342/case_tudy_wed/login/login.html?_ijt=pbcsdpi12lmrbrb4ndv47f4af5&_ij_reload=RELOAD_ON_SAVE">Đăng
                        nhập</a></button>

                    <%--    tìm kiếm--%>
                    <div class="search-box">
                        <input class="search-box-input" type="search" placeholder="Tìm tên sản phẩm...">
                        <button class="search-box-btn">
                            <i class='bx bx-search-alt'></i>
                        </button>
                    </div>

<%--                        giỏ hàng--%>
                    <button class="search-box-cart">
                        <i class="fa-solid fa-cart-plus"></i>
                    </button>
                </div>
            </ul>
        </div>
    </nav>
<%--    hết--%>

    <!--//header2-->
    <div class="header-content">
        <div class="row">
            <div class="col-xl-5 col-md-12">
                <div class="intro-text col-md-12">
                    <h1>Thưởng thức sự tiện nghi</h1>
                    <p>Sự kết hợp mới mẻ</p>
                    <div class="btns">
                        <button class="btn-primary" style="width: 150px; font-size: 23px">Bắt đầu</button>
                    </div>
                </div>
            </div>

<%--            ảnh phần header--%>
            <div class="col-xl-7 col-md-12">
                <div id="carouselExampleFade" class="carousel slide carousel-fade">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <div class="hero-img">
                                <img src="header10.jpg" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header6.png" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header7.jpg" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header8.png" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header9.jpg" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header5.jpg" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header11.jpg" alt="">
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="hero-img">
                                <img src="header12.jpg" alt="">
                            </div>
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade"
                            data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade"
                            data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                    </button>
                </div>
            </div>
        </div>
    </div>
<%--    hết--%>

    <!--    mô tả 1-->
    <div class="row class-content">
        <div class="col-md-12 col-xl-6">
            <!--        nội dung mô tả công thái học-->
            <div class="content-text">
                <h2>Ergonomic3 Store</h2>
                <p>Nội thất công thái học là một phong cách thiết kế nội thất phổ biến
                    trong công nghiệp hiện đại. Phong cách này thường tập trung vào sự tiện nghi,
                    tính chất thực tế và sự hài hòa giữa chức năng và thẩm mỹ.</p>
                <p>Trong nội thất công thái học, không gian được sắp xếp một cách hợp lý và tối ưu hóa .
                    Các đồ vật và nội thất được sắp xếp sao cho phù hợp với chức năng sử dụng và
                    tận dụng tối đa không gian có sẵn. Nguyên tắc sắp xếp và tổ chức được chú trọng để
                    tạo ra sự thông thoáng và thoải mái cho người sử dụng.</p>
                <p>Phong cách này tạo ra không gian thoáng đãng, gọn gàng và tạo cảm giác thoải
                    mái cho người sử dụng.</p>
            </div>
        </div>
        <div class="col-md-12 col-xl-6">
            <!--        hình ảnh mô tả-->
            <div class="content-img">
                <img src="https://banghevanphong.net.vn/wp-content/uploads/2020/12/khong-gian-hoc-tap-lam-viec-tai-nha-5.jpg"
                     alt="">
            </div>
        </div>
    </div>

    <!--mô tả 2-->
    <div class="row class-content">
        <div class="col-md-12 col-xl-6">
            <!--        nội dung mô tả công thái học-->
            <div class="content-text">
                <h2 id="h2">Tại sao nên chọn <b>Ergonomic3 Store</b> ?</h2>
                <ul class="class-ul">
                    <li>Đảm bảo chất lượng sản phẩm luôn là số 1</li>
                    <li>Hoàn tiền lập tức nếu không hài lòng về sản phẩm</li>
                    <li>Giảm 30% ngay từ lần mua đầu tiên</li>
                    <li>Sản phẩm nhập khẩu hoàn toàn chính hãng</li>
                    <li>Luôn cung cấp các giá trị có lợi ích cho khách hàng</li>
                </ul>
            </div>
        </div>
        <div class="col-md-12 col-xl-6">
            <!--        hình ảnh mô tả-->
            <div class="content-img">
                <img src="header1.jpg" alt="">
            </div>
        </div>
    </div>
</div>
<!--hết-->

<!--giới thiệu sp bán chạy-->
<div class="row">
    <div class="col" style="text-align: center">
        <h2>Top các sản phẩm công thái học bán cháy hàng nhất tại shop</h2>
    </div>
</div>

<%--xem ảnh sản phẩm bán chạy --%>
<div id="carouselExampleCaptions" class="carousel slide">
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active"
                aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                aria-label="Slide 3"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3"
                aria-label="Slide 4"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4"
                aria-label="Slide 5"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="5"
                aria-label="Slide 6"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="6"
                aria-label="Slide 7"></button>
    </div>
    <div class="carousel-inner" id="text">
        <div class="carousel-item active">
            <img src="top8.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h3 class="text">Ergochair pro 1 Gray</h3>
                <p class="text">Đã bán 103 ghế</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="top1.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h5 class="text">Ergochair Pro 2</h5>
                <p class="text">Đã bán 194 ghế</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="top3.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h5 class="text">KD-09</h5>
                <p class="text">Đã bán 123 ghế</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="topp4jpg.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h5 class="text">ERGOHUMAN PLATINUM</h5>
                <p class="text">Đã bán 201 ghế</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="header3.webp" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h5 class="text">ERGONOMIC E6</h5>
                <p class="text">Đã bán 163 bàn</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="top6.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h5 style="color: black">SMARTDESK GAMING WHITE BLACK PC</h5>
                <p style="color: black">Đã bán 351 bàn</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="top7.jpg" class="d-block w-100" alt="...">
            <div class="carousel-caption d-none d-md-block">
                <h5 class="text">Ergochair Pro 3</h5>
                <p class="text">Đã bán 122 ghế</p>
            </div>
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>
<%--hết--%>
<br>



<!--    footer-->
<div class="class-endow">
    <div class="class-endow-i">
        <i class="fa-brands fa-android"></i>
        <h3>Phương thức đổi trả</h3>
        <hr>
        <p>Đổi trả miễn phí trong 30 ngày</p>
    </div>
    <!--        i-->
    <div class="class-endow-i">
        <i class="fa-solid fa-truck-fast"></i>
        <h3>Miễn phí giao hàng</h3>
        <hr>
        <p>Áp dụng khi mua tại shop</p>
    </div>
    <!--        i-->
    <div class="class-endow-i">
        <i class="fa-brands fa-shopify"></i>
        <h3>Ưu đãi và khuyến mãi</h3>
        <hr>
        <p>Luôn có nhiều voucher cho bạn</p>
    </div>
    <!--        i-->
    <div class="class-endow-i">
        <i class="fa-solid fa-money-check-dollar"></i>
        <h3>Giá cả phải chăng</h3>
        <hr>
        <p>Mức giá hợp lý về mọi sản phẩm</p>
    </div>
    <!--        i-->
</div>

<%--nhãn--%>
<div class="none"></div>
<footer class="py-3 my-4">
    <p class="text-center text-body-secondary">© C0523G1 Group3</p>
</footer>

<!--top-->
<button onclick="topFunction()" id="myBtn" title="Go to top">
    <i class="fa-solid fa-arrow-up"></i>
</button>
<script>
    let mybutton = document.getElementById("myBtn");
    window.onscroll = function () {
        scrollFunction()
    };

    function scrollFunction() {
        if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
            mybutton.style.display = "block";
        } else {
            mybutton.style.display = "none";
        }
    }

    function topFunction() {
        document.body.scrollTop = 0;
        document.documentElement.scrollTop = 0;
    }
</script>
<%--Ký tên: Nguyễn Hữu Hậu--%>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
<script src="search.js"></script>
</html>
