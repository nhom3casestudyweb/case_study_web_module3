-- Dữ liệu bảng LOẠI_KHÁCH
insert into product_type(`product_type_name`)
values("Bàn thông minh"),("Ghế công thái học"),("Phụ kiện");

-- Dữ liệu bảng tài khoản
insert into `account`(account_user_name,account_password,role_id)
values("tuannguyen99@gmail.com","tuan123",2),
("tinhtrandn@gmail.com","tinh123",2),
("sangnguyendn@gmail.com","sang123",2),
("thienbuiqb@gmail.com","thien123",2),
("haunguyen@gmail.com","hau123",2),
("admin@gmail.com","admin",1),
("hai123@gmail.com","hai123",2);

-- Dữ liệu bảng role
insert into `role`(role_name)
values ("admin"),
("user");

-- Dữ liệu bảng loại khách
insert into type_of_customer(type_of_customer_name)
values ("Silver"),("Plantinum"),("Gold"),("Diamond");

-- Dữ liệu bảng user
insert into `user`(user_name,user_dob,user_gender,user_id_card
					,user_phone_number,user_mail,user_address,
                    type_of_customer_id,account_user_name)
values ("Nguyễn Văn Tuấn","1999-11-10",1,"231",'0905346958',"tuannguyen99@gmail.com","Đà Nẵng",2,"tuannguyen99@gmail.com"),
("Trần Công Tịnh","1999-05-07",1,"232","0283685099","tinhtrandn@gmail.com","Đà Nẵng",3,"tinhtrandn@gmail.com"),
("Nguyễn Tấn Sang","1998-10-23",1,"233","0987563456","sangnguyendn@gmail.com","Huế",1,"sangnguyendn@gmail.com"),
("Bùi Văn Thiện","1995-10-08",1,"234","0753478972","thienbuiqb@gmail.com","Quảng Bình",4,"thienbuiqb@gmail.com"),
("Nguyễn Hữu Hậu","2000-07-08",1,"235","0865345678","haunguyen@gmail.com","Hà Nội",3,"haunguyen@gmail.com"),
("Đinh Thanh Hải","1999-08-08",1,"237","0932456987","hai123@gmail.com","Quảng Bình",2,"hai123@gmail.com");
insert into `user`(user_name,user_dob,user_gender,user_id_card
					,user_phone_number,user_mail,user_address,
                    account_user_name)
values ("Trương Nguyễn Đình Long","1999-10-11",1,"236","0932533481","long1110dn@gmail.com","Hồ Chí Minh","admin@gmail.com");


insert into product(product_name,product_price,product_description,product_type_id,product_inventory)
values ("SMARTDESK GAMING WALNUT",12500000,"Sử dụng động cơ điện điều khiển tự động, với bảng điều khiển thông minh, nhớ những vị trí mình đã cài đặt, bảng hiển thị LED.
 Mặt bàn có kích thước 65x1m50. Mặt bàn của Smartdesk Gaming được làm từ gỗ cao su tự nhiên cao cấp chuẩn xuất khẩu, chống nước, chống mối mọt, chống cong vênh, sau này có thể sơn lại như mới.
 Với hai động cơ cực mạnh ở 2 chân cho lực nâng lên tới 160 kg , chuyển động êm ái , không tiếng động .
 Độ ồn thấp, không làm ảnh hưởng tới sự tập trung của người xung quanh.
 Điều chỉnh từ 65cm lên đến 1m30 . Phù hợp mọi tư thế đứng ngồi làm việc .
 chân bàn được làm từ thép dày , độ nặng và độ chịu lực cao , sơn tĩnh điện cao cấp .
 Tích hợp hộc đi dây rộng, giúp bạn đi dây gọn gàng.
 Phối màu độc đáo theo yêu cầu.
 Bảo hành chính hãng Nội thất 2 năm
 Mặt bàn thiết kế hiện đại, tích hợp nhiều tính năng cao cấp
 Tích hợp xạc không dây, xạc được cho các điện thoại hỗ trợ
Hộc chứa ổ cắm tích hợp, phía dưới có hộc đi dây giúp bàn gọn gàng.
Có rãnh đi dây sạc kiêm chân đế đựng điện thoại , ipad","1",5);
insert into product(product_name,product_price,product_description,product_type_id,product_inventory)
values ("SMARTDESK GAMING GRAY",12500000,"Sử dụng động cơ điện điều khiển tự động, với bảng điều khiển thông minh, nhớ những vị trí mình đã cài đặt, bảng hiển thị LED.
 Mặt bàn có kích thước 65x1m50. Mặt bàn của Smartdesk Gaming được làm từ gỗ cao su tự nhiên cao cấp chuẩn xuất khẩu, chống nước, chống mối mọt, chống cong vênh, sau này có thể sơn lại như mới.
 Với hai động cơ cực mạnh ở 2 chân cho lực nâng lên tới 160 kg , chuyển động êm ái , không tiếng động .
Độ ồn thấp, không làm ảnh hưởng tới sự tập trung của người xung quanh.
 Điều chỉnh từ 65cm lên đến 1m30 . Phù hợp mọi tư thế đứng ngồi làm việc .
 chân bàn được làm từ thép dày , độ nặng và độ chịu lực cao , sơn tĩnh điện cao cấp .
 Tích hợp hộc đi dây rộng, giúp bạn đi dây gọn gàng.
 Phối màu độc đáo theo yêu cầu.
 Bảo hành chính hãng Nội thất GỌN 2 năm 
 Mặt bàn thiết kế hiện đại, tích hợp nhiều tính năng cao cấp
 Tích hợp xạc không dây, xạc được cho các điện thoại hỗ trợ
Hộc chứa ổ cắm tích hợp, phía dưới có hộc đi dây giúp bàn gọn gàng.
Có rãnh đi dây sạc kiêm chân đế đựng điện thoại , ipad" ,"1",5),
("SMARTDESK GAMING RED PC",13500000,"Bàn làm bằng gỗ cao su cao cấp , sơn PU chống nước – kich thươc : 70 x1m50 – Chân bàn được diều chỉnh bằng động cơ điện , co thể điều chỉnh từ 65cm lên đến 1m30 , phù hợp đứng ngồi kết hợp , giảm chết sớm nếu ngồi nhiều",
"1",7),
("TECHDESK PRO WHITE",9500000,"Thừa hưởng những tính năng nỗi bật của TECHDESK : lỗ thông gió cho laptop , dock đựng điện thoại và máy tính bảng , tích hợp nhiêu ftiện ích thông minh khác – Điều chỉnh từ 65cm lên đến 1m30 . Phù hợp mọi tư thế điều chỉnh – Sử dụng 2 đông cơ mạnh mẽ cho lực nâng lên đến 160kg – độ bền tuyệt đối – chuẩn quốc tế",
"1",8),
("SMARTDESK OFFICE PLUS",9800000,"Sử dụng động cơ điện điều khiển tự động, với bảng điều khiển thông minh, nhớ những vị trí mình đã cài đặt, bảng hiển thị LED.
 Mặt bàn có kích thước 1m60 x80. Mặt bàn của Smartdesk Office Plus được làm từ gỗ tự nhiên cao cấp chuẩn xuất khẩu, chống nước, chống mối mọt, chống cong vênh, sau này có thể sơn lại như mới.
Độ ồn thấp, không làm ảnh hưởng tới sự tập trung của người xung quanh.
 Điều chỉnh từ 65cm lên đến 1m30 . Phù hợp mọi tư thế đứng ngồi làm việc .
 Chân bàn được làm từ thép dày , độ nặng và độ chịu lực cao , sơn tĩnh điện cao cấp .
 Sử dụng hệ thống khung nâng cao cấp, 2 động cơ cho lực nâng lên tới 160 kg, chân hình chữ V để gọn gàng và không vướng, cho không gian để ghế rộng rãi dễ di chuyển.
 phối màu độc đáo theo yêu cầu.
 Bảo hành chính hãng Nội thất GỌN 2 năm ","1",6),
 ("SMARTDESK OFFICE WOOD",8900000,"Sử dụng động cơ điện điều khiển tự động . với bảng điều khiển thông minh , nhớ những vị trí mình đã cài đặt . bảng hiển thị LED .
 Mặt bàn có kích thước 60x1m20 , làm từ gỗ co su ghép AA tự nhiên , chuẩn xuất khẩu  , độ bền gấp 3 lần gỗ MDF , có thể sơn sửa lại một cách dễ dàng  , sơn PU chống nước .
 Với hai động cơ cực mạnh ở 2 chân cho lực nâng lên tới 160 kg , chuyển động êm ái , không tiếng động .
 Điều chỉnh từ 65cm lên đến 1m30 . Phù hợp mọi tư thế đứng ngồi làm việc .
 chân bàn được làm từ thép dày , độ nặng và độ chịu lực cao , sơn tĩnh điện cao cấp .
  Sản xuất tại Việt Nam với chuẩn Xuất Khẩu Châu Âu , phụ kiện sẵn có , thay thế nhanh chóng , dễ dàng khi có sự cố hỏng hóc xẩy ra 
 phối màu độc đáo theo yêu cầu 
 Sản xuất và phân phối chính hãng bởi Nội thất GỌN , Bảo hành chính hãng 2 năm , Bảo trì vĩnh viến","1",7),
 ("SMARTDESK HOME BLACK",6000000,"Sử dụng động cơ điện điều khiển tự động . với bảng điều khiển thông minh , nhớ những vị trí mình đã cài đặt . bảng hiển thị LED .
 Mặt bàn có kích thước 60x1m20 , làm từ gỗ co su ghép AA tự nhiên , chuẩn xuất khẩu  , độ bền gấp 3 lần gỗ MDF , có thể sơn sửa lại một cách dễ dàng  , sơn PU chống nước .
 Phiên bản 1 động cơ với lực nâng 80kg qua bộ truyền động độc lập , đáp ứng tối thiểu nhu cầu điều chỉnh độ cao của bàn
 Điều chỉnh từ 75cm lên đến 1m20 . Phù hợp mọi tư thế đứng ngồi làm việc .
 Tích hợp cảm biến chống va chạm , tự động dừng khi gặp vật cản 
 Chân bàn được làm từ thép dày , độ nặng và độ chịu lực cao , sơn tĩnh điện cao cấp .
 phối màu độc đáo theo yêu cầu ","1",5),
 ("SMARTDESK GO",6500000," Sử dụng động cơ điện điều khiển tự động . với bảng điều khiển thông minh , nhớ những vị trí mình đã cài đặt . bảng hiển thị LED .
 Hộc ẩn dây đa năng gọn kích thước lớn ,  sẽ không còn một cọng dây nào luộm thuộm ở ngoài
 chân bàn được làm từ thép dày , độ nặng và độ chịu lực cao , sơn tĩnh điện cao cấp .
 phối màu độc đáo theo yêu cầu ","1",4),
 ("ERGONOMIC E1 CHAIR BLACK",6500000,"Thiết kế đạt giải chuẩn Ergonomic được ưa chuộng nhất , với chất liệu cao cấp , khung ghế chắc chắn , chẩn Ergonomic , giúp bạn bảo vệ toàn diện cho cơ thể khi ngồi , nhất là hệ xương sống.
  Kiểu dáng thanh thoát .. khung chắc chắn chịu trọng lượng lên đến 150 kg
 Cơ cấu khung Ergonomic  Nâng đỡ cột sống một cách tối đa , giúp bạn không hề mỏi , đau lưng khi ngồi .
 Tựa tay thiết kế khoa học , có thể nâng lên hạ xuống , đẩy tới đẩy lui cho phù hợp với tư thế ngồi
 Tựa đầu có thể điều chỉnh nhiều tư thế …
 Tay điều chỉnh 4D. Hệ thống cần xoay điều chỉnh , có thể điều chỉnh cả nệm ngồi giúp chúng ta có tư thế ngồi thoải mái nhất","2",6),
 
 ("ERGONOMIC E3 CHAIR",4400000,"Thiết kế đạt giải chuẩn Ergonomic được ưa chuộng nhất , với chất liệu cao cấp , khung ghế chắc chắn , chẩn Ergonomic , giúp bạn bảo vệ toàn diện cho cơ thể khi ngồi , nhất là hệ xương sống.
Kiểu dáng thanh thoát .. khung chắc chắn chịu trọng lượng lên đến 150 kg
Cơ cấu khung Ergonomic  Nâng đỡ cột sống một cách tối đa , giúp bạn không hề mỏi , đau lưng khi ngồi .
Tựa tay thiết kế khoa học , có thể nâng lên hạ xuống , đẩy tới đẩy lui cho phù hợp với tư thế ngồi
Tựa đầu có thể điều chỉnh nhiều tư thế …
Tay điều chỉnh 4D
Hệ thống cần xoay điều chỉnh , có thể điều chỉnh cả nệm ngồi giúp chúng ta có tư thế ngồi thoải mái nhất","2",5),

("GHẾ ERGONOMIC E2", 5500000, "Thiết kế đạt giải chuẩn Ergonomic được ưa chuộng nhất , với chất liệu cao cấp , khung ghế chắc chắn , chẩn Ergonomic , giúp bạn bảo vệ toàn diện cho cơ thể khi ngồi , nhất là hệ xương sống.
Kiểu dáng thanh thoát  khung chắc chắn chịu trọng lượng lên đến 150 kg.
 Cơ cấu khung Ergonomic  Nâng đỡ cột sống một cách tối đa , giúp bạn không hề mỏi , đau lưng khi ngồi .
 Tựa tay thiết kế khoa học , có thể nâng lên hạ xuống , đẩy tới đẩy lui cho phù hợp với tư thế ngồi
 Tựa đầu có thể điều chỉnh nhiều tư thế
 Tay điều chỉnh 4D
Hệ thống cần xoay điều chỉnh , có thể điều chỉnh cả nệm ngồi giúp chúng ta có tư thế ngồi thoải mái nhất","2",6),

("Ergochair pro 1 Gray",7900000,"ErgoChair Pro 1 được tính toán, thiết kế và sản xuất theo các tiêu chuẩn công thái học mà các dòng ghế hàng đầu đang theo đuổi , cùng nhà sản xuất với Ergochair Pro , mẫu ghế công thái học đưuọc giải thiết kế đẹp và dòng ghế Ergochair Pro 2
 mà Vinachair đang phân phối với hệ thống khung nhôm nguyên khối thế hệ mới","2",7),
 
 ("Ergochair Pro 3",11000000,"THIẾT KẾ ERGONOMIC –KHUNG NHÔM ĐA ĐỘNG LỰC THẾ HỆ MỚI SO VỚI DÒNG PRO VÀ PRO 
Dành cho bạn sự thoải mái nhất
ErgoChair Pro 3 được tính toán, thiết kế và sản xuất theo các tiêu chuẩn công thái học mà các dòng ghế hàng đầu đang theo đuổi , cùng nhà sản xuất với Ergochair Pro , mẫu ghế công thái học được giải thiết kế đẹp và dòng ghế Ergochair Pro 3 
mà Vinachair đang phân phối với hệ thống khung nhôm nguyên khối thế hệ mới mang lại cảm giác cao cấpTỐI ƯU TÍNH NĂNG
Đường cong hỗ trợ ôm sát cơ thể , với phần đệm lưng nhô cao dạng lưng kép giúp chúng ta đỡ đau lưng hơn nhiều .
Thiết kế ôm sát từng đường cong của cơ thể, các tính năng được tối ưu, hỗ trợ tối da cho người sử dụng 
PHỐI MÀU VÀ KIỂU DÁNG , PHẦN KIỂU DÁNG THÌ ĐƯỢC ĐÁNH GIÁ CAO PHỐI MÀU RẤT ĐẸP
Phù hợp với không gian làm việc của bạn
Kiểu dáng tinh tế, sang trọng, phù hợp với mọi không gian làm việc của bạn
ASPA – AUTOMATIC SITTING POSTURE ADAPT SYSTEM
Tự động Điều chỉnh theo cơ thể của bạn
Lưng ghế thiết kế 3D ôm trọn đường cong của cột sống
Cơ chế tự bám sát cơ thể khi chuyển động về trước, có thể ngả về trước 16 độ
Tối ưu cho những lúc cần tập trung cao độ","2",6),

("Ghế ErgoChair Plus",9200000,"THÔNG SỐ KỸ THUẬT VÀ CÁC CHỨC NĂNG QUAN TRỌNG
 Thiết kế đạt giải chuẩn Ergonomic được ưa chuộng nhất , với chất liệu cao cấp , khung ghế chắc chắn , chẩn Ergonomic , giúp bạn bảo vệ toàn diện cho cơ thể khi ngồi , nhất là hệ xương sống.
  Kiểu dáng thanh thoát .. khung chắc chắn chịu trọng lượng lên đến 150 kg
 Cơ cấu khung Ergonomic  Nâng đỡ cột sống một cách tối đa , giúp bạn không hề mỏi , đau lưng khi ngồi .
 Tựa tay thiết kế khoa học , có thể nâng lên hạ xuống , đẩy tới đẩy lui cho phù hợp với tư thế ngồi
 Tựa đầu có thể điều chỉnh nhiều tư thế
 Tay điều chỉnh 5D 360 độ mới nhất
Hệ thống cần xoay điều chỉnh , có thể điều chỉnh cả nệm ngồi giúp chúng ta có tư thế ngồi thoải mái nhất .","2",3),

("ERGONOMIC FLY PRO",10900000,"–Thiết kế mâm kim loại nguyên khối cực kì chắc chắn, điều chỉnh tính năng ghế được tích hợp ở rìa mâm ghế cực kì tiện lợi
– Tay điều chỉnh 4D
– Ghế sử dụng công nghệ lưới tiên tiến wintex nhập khẩu hàn quốc, tạo cảm giác đàn hồi, êm ái thoải mái khi ngồi
– Pistol samhongsa nhập hàn quốc chuẩn cấp 4
– Phần lưng lưới thiết kế điều chỉnh lên xuống linh động, không bị gắn cố định, ngả 140 độ, hỗ trợ chống gù, đỡ lưng đem lại cảm giác dễ chịu, chống đau cột sống cho anh em dân văn phòng đang bị đau
– Chân ghế thiết kế sang trọng lịch lãm, kết hợp góc nghiêng 130 độ phần thân, và tùy chỉnh phần cổ, giúp thư gian mỗi khi cần nghỉ ngơi.
– Ghế bảo hành 30 tháng chính hãng","2",5),

("GHẾ DVARY BUTTERFLY GRAY",13900000,"GTCHAIR (GT CHAIR) được ủy quyền sản xuất và bán ghế làm việc cao cấp bởi Dvary Ergo Seating, Inc. có trụ sở tại Hoa Kỳ. 
Kể từ khi thành lập vào năm 1992, GTCHAIR đã cung cấp trên thị trường các loại ghế làm việc tuyệt vời: ghế văn phòng, ghế lưới và ghế xoay, …
Dvary Butterfly là dòng ghế cao cấp nhất của GTChair. Hiện tại ghế được bán với giá 1299 USD tại thị trường Úc. 
Khung ghế là nhôm nguyên khối chịu lực tốt nhưng vẫn duy trì dc trọng lượng nhẹ để tiện di chuyển. Lưng ghế được thiết kế lấy cảm hứng từ cánh bướm Mothra. 
Cơ chế điều khiển ngả ghế và nâng hạ ghế đặt ở phần để tay, người dùng hoàn toàn ko cần cúi xuống gầm ghế điểu chỉnh như các mẫu ghế truyền thống. 
Lưới nhập khẩu tự điều chỉnh theo trọng lượng người dùng, chịu tải cực tốt. Chất liệu lưới cực thoáng mát vào mùa hè mà vẫn đảm bảo êm ái vào mùa đông. 
Cơ chế điều chỉnh kháng lực lưng, mâm ghế cao cấp, tựa eo điều chỉnh linh hoạt tạo nên trải nghiệm thoải mái nhất khi sử dụng.
Ghế làm việc – ghế văn phòng cao cấp Dravy Butterfly được trang bị đầy đủ tính năng Ergonomic cao cấp, 
có thể điều chỉnh 100% phù hợp với cơ thể người dùng, giúp phòng chống các bệnh văn phòng thường gặp như đau mỏi lưng – vai – gáy, thoát vị đĩa đệm","2",4),

("USB HUB PRO",900000,"Hỗ trợ kết nối dễ dàng với các thiết bị khác
Thiết kế thông minh phù hợp với tất cả các loại bàn","3",5),

("Giá đỡ CPU HOLD 2",1500000,"Tại sao nên sử dụng Giá đỡ CPU của Phụ kiện Bàn ? Để bảo vệ máy tính của bạn khỏi mặt đất hoặc máy tính để bàn, bụi bẩn và tràn. Đây chỉ là một trong những lý do, hoặc để mở rộng không gian để chân bên dưới Bàn điện , Bàn đứng là Bàn làm việc có thể ngồi và đứng luân phiên. 
Vì vậy, khi ngồi, nếu bạn có thể để cho đôi chân được thư giãn vừa đủ, không gian đủ rộng thì sẽ thư giãn tốt hơn. Do đó, giá đỡ CPU này áp dụng phương pháp cài đặt treo, không chỉ có thể nâng lên và
 hạ xuống theo sự lên xuống của Bàn văn phòng mà còn tiết kiệm không gian.","3",4),
 
("Ổ CẮM ĐIỆN ÂM BÀN",1500000,"Ổ cắm điện âm bàn với nhiều tiện ích , tích hợp gọn gàng vào mặt bàn .
Bao gồm : 3 lỗ cắm thông dụng , 3 lỗ cắm cổng 3 chân , 2 lỗ cắm USB chuẩn xạc .","3",4),

("BỘ BÁNH XE CHỊU LỰC BÀN SMARTDESK",500000,"THÔNG SỐ KỸ THUẬT VÀ CÁC CHỨC NĂNG QUAN TRỌNG
 Bộ bánh xe chịu lực bằng cao su đúc chuẩn chịu lực nặng lên đến 200kg
 có khóa vững chăc và di chuyển êm ái ,
 thường được sử dụng trên các sản phẩm cao cấp .","3",7),
 
 ("SẠC KHÔNG DÂY THÔNG MINH",1500000,"THÔNG SỐ KỸ THUẬT VÀ CÁC CHỨC NĂNG QUAN TRỌNG
 Sạc không dây thế hệ mới , tích hợp xạc nhanh 15W Cho tốc độ xạc nhanh , tích hợp cổng USB chuẩn , và cổng USB C .
Chống nước , thiết kế đẹp mắt","3",7);

insert into product_images(images_url,product_id)
values("SMARTDESK GAMING GREY.png",2),
("SMARTDESK GAMING RED PC.png",3),
("SMARTDESK GAMING WALNUT.png",1),
("SMARTDESK GO.png",8),
("SMARTDESK HOME BLACK.png",7),
("SMARTDESK OFFICE PLUS.png",5),
("SMARTDESK OFFICE WOOD.png",6),
("TECHDESK PRO WHITE.png",4),
("Ergochair pro 1 Gray.jpg",12),
("Ergochair Pro 3.jpg",13),
("ERGONOMIC E1 CHAIR BLACK.png",9),
("ERGONOMIC E3 CHAIR.png",10),
("ERGONOMIC FLY PRO.png",15),
("GHẾ DVARY BUTTERFLY GRAY.png",16),
("Ghế ErgoChair Plus.png",14),
("GHẾ ERGONOMIC E2.png",11),
("BỘ BÁNH XE CHỊU LỰC BÀN SMARTDESK.png",20),
("Giá đỡ CPU HOLD 2.jpeg",18),
("SẠC KHÔNG DÂY THÔNG MINH.jpeg",21),
("USB HUB PRO.jpeg",17),
("Ổ CẮM ĐIỆN ÂM BÀN.jpg",19);



