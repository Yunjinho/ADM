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

