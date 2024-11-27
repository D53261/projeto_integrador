CREATE TABLE recompensas (
    id int not null AUTO_INCREMENT,
    email varchar(255),
    recompensa1 varchar(10) DEFAULT "não",
    recompensa2 varchar(10) DEFAULT "não",
    recompensa3 varchar(10) DEFAULT "não",
    recompensa4 varchar(10) DEFAULT "não",
    PRIMARY KEY (id)
    ) DEFAULT charset = utf8;