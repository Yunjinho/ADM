CREATE TABLE  user  (
	 userid 	VARCHAR(200),
	 password 	VARCHAR(200),
	 gender 	VARCHAR(200),
	 address 	VARCHAR(1000),
	 profileimg1 	VARCHAR(200),
	 profileimg2 	VARCHAR(200),
	 phone 	VARCHAR(200),
	 email 	VARCHAR(200),
	 name 	VARCHAR(200),
	 birth 	DATETIME,
	 job 	VARCHAR(200),
	 hobby 	VARCHAR(200),
	 interest 	VARCHAR(200),
	 exposure_yn 	INT,
	 nickname 	VARCHAR(200)
);

ALTER TABLE user ADD CONSTRAINT PRIMARY KEY(userid);

CREATE TABLE  liked  (
	 likeid 	INT,
	 userid 	VARCHAR(200),
	 lid 	VARCHAR(200)
);

ALTER TABLE liked ADD CONSTRAINT PRIMARY KEY(likeid);
ALTER TABLE liked MODIFY likeid INT AUTO_INCREMENT;
ALTER TABLE liked AUTO_INCREMENT = 1;

CREATE TABLE  hate  (
	 hateid 	INT,
	 userid 	VARCHAR(200),
	 hid 	VARCHAR(200)
);

ALTER TABLE hate ADD CONSTRAINT PRIMARY KEY(hateid);
ALTER TABLE hate MODIFY hateid INT AUTO_INCREMENT;
ALTER TABLE hate AUTO_INCREMENT = 1;


CREATE TABLE chat_members (
	gmemberid	INT,
	chatroomid	INT,
	userid	VARCHAR(200)
);
ALTER TABLE chat_members ADD CONSTRAINT PRIMARY KEY(gmemberid);
ALTER TABLE chat_members MODIFY gmemberid INT AUTO_INCREMENT;
ALTER TABLE chat_members AUTO_INCREMENT = 1;


CREATE TABLE  gatherschedules  (
	 gschedules_id 	INT,
	 userid 	VARCHAR(200),
	 gatherid 	INT,
	 gcontents 	VARCHAR(10000),
	 schedules_gather 	DATETIME,
	 gplace 	VARCHAR(1000)
);
ALTER TABLE gatherschedules ADD CONSTRAINT PRIMARY KEY(gschedules_id);
ALTER TABLE gatherschedules MODIFY gschedules_id INT AUTO_INCREMENT;
ALTER TABLE gatherschedules AUTO_INCREMENT = 1;

CREATE TABLE  dateschedules  (
	 dschedules_id 	INT,
	 userid 	VARCHAR(200),
	 did 	VARCHAR(200),
	 dcontents 	VARCHAR(10000),
	 schedules_date 	DATETIME,
	 dplace 	VARCHAR(1000)
);
ALTER TABLE dateschedules ADD CONSTRAINT PRIMARY KEY(dschedules_id);
ALTER TABLE dateschedules MODIFY dschedules_id INT AUTO_INCREMENT;
ALTER TABLE dateschedules AUTO_INCREMENT = 1;


CREATE TABLE  chattingroom  (
	 chatroomid 	INT,
	 chatroomname 	VARCHAR(200),
	 chattime 	DATETIME,
	 chatting_type 	INT
);
ALTER TABLE chattingroom ADD CONSTRAINT PRIMARY KEY(chatroomid);
ALTER TABLE chattingroom MODIFY chatroomid INT AUTO_INCREMENT;
ALTER TABLE chattingroom AUTO_INCREMENT = 1;

CREATE TABLE  chattingmessage  (
	 messageid 	INT,
	 chatroomid 	INT,
	 send_date 	DATETIME,
	 userid 	VARCHAR(200),
	 message 	VARCHAR(1000)
);

ALTER TABLE chattingmessage ADD CONSTRAINT PRIMARY KEY(messageid);
ALTER TABLE chattingmessage MODIFY messageid INT AUTO_INCREMENT;
ALTER TABLE chattingmessage AUTO_INCREMENT = 1;

CREATE TABLE gather (
	gatherid	int	,
	userid	VARCHAR(200),
	gathername	VARCHAR(100),
	number_of_member	int	,
	category	VARCHAR(100),
	gather_info	VARCHAR(200),
	img	VARCHAR(200)
);

CREATE TABLE member_list (
	gmemberid	varchar(100),
	gatherid	int,
	number_of_member	int
);

CREATE TABLE categories (
	cateid	int,
	catename	VARCHAR(100)
);

CREATE TABLE album (
	albumid	int,
	gatherid	int,
	img	VARCHAR(200)
);


drop table dateschedules;
select * from chattingroom;
desc chattingroom;

