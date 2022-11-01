create table CommunityList
(communityId INT(5) AUTO_INCREMENT PRIMARY key,
community_name VARCHAR(50) UNIQUE,
city_name VARCHAR(50) not null DEFAULT 'Toronto'
);

INSERT into communityList (community_name)
VALUES('North York'),  
('Toronto Downtown'),
('Markham'),
('Scarborough');