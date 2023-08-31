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



