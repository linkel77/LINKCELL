CREATE TABLE PLAYER (
id int NOT NULL,
tag varchar(100) NOT NULL,
name varchar(100),
wins int,
losses int,
totalDonations int,
currentFavoriteCard int,
expLevel int,
trophies int,
bestTrophies int,
battleCount int,
threeCrownWins int,
challengeCardsWon int,
challengeMaxWins int,
tournamentCardsWon int,
tournamentBattleCount int,
warDayWins int,
clanCardsCollected int,
starPoints int,
PRIMARY KEY (id, tag)

)