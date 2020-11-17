//Travel Table
drop table Travel;
create table Travel(sid int not null auto_increment primary key, busname varchar(150), deparaturedate varchar(100), leavingfrom varchar(100), goingto varchar(100), deparaturetime varchar(100), price varchar(100), s1 varchar(100), s2 varchar(100), s3 varchar(100), s4 varchar(100), s5 varchar(100), s6 varchar(100), s7 varchar(100), s8 varchar(100), s9 varchar(100), s10 varchar(100), s11 varchar(100), s12 varchar(100), s13 varchar(100), s14 varchar(100), s15 varchar(100), s16 varchar(100), s17 varchar(100), s18 varchar(100), s19 varchar(100), s20 varchar(100), s21 varchar(100), s22 varchar(100), s23 varchar(100), s24 varchar(100), s25 varchar(100), s26 varchar(100), s27 varchar(100), s28 varchar(100), s29 varchar(100), s30 varchar(100), s31 varchar(100), s32 varchar(100), s33 varchar(100), s34 varchar(100), s35 varchar(100), s36 varchar(100), s37 varchar(100), s38 varchar(100), s39 varchar(100), s40 varchar(100), s41 varchar(100), s42 varchar(100), s43 varchar(100), s44 varchar(100), numOfSeat int);
insert into Travel values(0, 'Travel Myanmar', '26/08/2019', 'Yangon', 'Mandalay', '6:00 AM', '22000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 44);
insert into Travel values(0, 'Travel Myanmar','26/08/2019', 'Yangon', 'Meiktila', '6:00 AM', '12000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 44);
insert into Travel values(0, 'Travel Myanmar','26/08/2019', 'Mandalay', 'Yangon', '6:00 AM', '22000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 44);
insert into Travel values(0, 'Travel Myanmar','26/08/2019', 'Mandalay', 'Meiktila', '6:00 AM', '5000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 44);
insert into Travel values(0, 'Travel Myanmar','26/08/2019', 'Meiktila', 'Yangon', '6:00 AM', '12000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 44);
insert into Travel values(0, 'Travel Myanmar','26/08/2019', 'Meiktila', 'Mandalay', '6:00 AM', '5000', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 44);
select * from Travel;
update Travel set deparaturedate = '11/10/2019' where deparaturedate = '09/10/2019';

//Check Table
drop table SoldCheck;
create table SoldCheck(check1 boolean, check2 boolean, check3 boolean, check4 boolean, check5 boolean, check6 boolean, check7 boolean, check8 boolean, check9 boolean, check10 boolean, check11 boolean, check12 boolean, check13 boolean, check14 boolean, check15 boolean, check16 boolean, check17 boolean, check18 boolean, check19 boolean, check20 boolean, check21 boolean, check22 boolean, check23 boolean, check24 boolean, check25 boolean, check26 boolean, check27 boolean, check28 boolean, check29 boolean, check30 boolean, check31 boolean, check32 boolean, check33 boolean, check34 boolean, check35 boolean, check36 boolean, check37 boolean, check38 boolean, check39 boolean, check40 boolean, check41 boolean, check42 boolean, check43 boolean, check44 boolean);
select * from SoldCheck;

//User Table
drop table User;
create table User(uid int not null auto_increment primary key, name varchar(100), gender varchar(100), email varchar(100), phone varchar(100), busname varchar(150), deparaturedate varchar(100), leavingfrom varchar(100), goingto varchar(100), deparaturetime varchar(100), seatno varchar(100), price varchar(100));
select * from User;

//Admin Login
drop table Login;
create table Login(id int not null auto_increment primary key, name varchar(30), password varchar(11));
insert into Login values(1, 'admin', 'admin');
select * from Login;

//Service data
drop table Service;
create table Service(serviceid int not null auto_increment primary key, servicedata varchar(500) );
insert into Service values(1, 'All express buses from Travel Myanmar Express are high class models express buses with air bags.');
insert into Service values(2, 'We provide fully air condition system in all of the Travel Myanmar Express Buses.');
insert into Service values(3, 'The seats are wide and very convenient for the passenger.(We never put extra seats in the middle of passenger)');
insert into Service values(4, 'We installed the 32 inches LCD TVs on all of the express buses to provide clear and complete entertainment for the passengers.');
insert into Service values(5, 'Very well-disciplined two drives and two helper are allocated in every Travel Myanmar Buses which is the proof of our safety for the passengers.');
insert into Service values(6, 'We are providing good services and we offer free tooth-paste,tooth brush,drinking water and towel to all of the passengers.');
select * from Service;

//About data
drop table About;
create table About(aboutid int not null auto_increment primary key, city varchar(200), place varchar(500), phoneInfo varchar(600) );
insert into About values(1, 'Yangon', 'Aung Mingalar', 'Ph:09-5020181,09-259354411,09-253379954,09-253379964');
insert into About values(2, 'Yangon', 'Parcek Delivery', 'Ph:09-450066418,09-798582000');
insert into About values(3, 'Yangon', 'Aung San Staidum', 'Ph:09-796782000,09-73105000');
insert into About values(4, 'Yangon', 'Upper Pansodan Street', 'Ph:09-764900940,09-954900940');
insert into About values(5, 'Mandalay', 'Chan Myae shwepyi', 'Ph:02-78991,02-73481,09-6807272,09-43062159,09-977225980');
insert into About values(6, 'Mandalay', '83th Street', 'Ph:09-91007993,09-977225982');
insert into About values(7, 'Meiktila', 'Lann Ma Taw (1)', 'Ph:09-493524543,09-790425284');
select * from About;