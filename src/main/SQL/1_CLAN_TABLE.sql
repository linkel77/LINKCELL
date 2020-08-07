CREATE TABLE CLAN (
id int,
tag varchar(100),
clanWarTrophies int,
requieredTrophies int,
donationsPerWeek int,
clanChestMaxLevel int,
clanChestStatus varchar(100),
clanChestLevel int,
clanScore int,
badgeld int,
name varchar(100),
location_id int,
type varchar(100),
members int,
description varchar(300),
clanChestPoints int,
PRIMARY KEY (id, tag)
)