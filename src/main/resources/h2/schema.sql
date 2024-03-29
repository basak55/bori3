
CREATE TABLE member(
	mno IDENTITY PRIMARY KEY,
    mid VARCHAR(30) NOT NULL,
    mpw VARCHAR(60) NOT NULL,
    exp INT);
    

CREATE TABLE level(
	loexp INT,
    hiexp INT,
    grade VARCHAR(30));

CREATE TABLE sentence(
	sno IDENTITY PRIMARY KEY,
	sent VARCHAR(4000) NOT NULL,
	writer VARCHAR(50) NOT NULL);