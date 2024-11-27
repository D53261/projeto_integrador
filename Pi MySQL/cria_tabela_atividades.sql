CREATE TABLE atividades (
    id int not null AUTO_INCREMENT,
    email varchar(255),
    atividade1 varchar(10) DEFAULT "não",
    atividade2 varchar(10) DEFAULT "não",
    atividade3 varchar(10) DEFAULT "não",
    atividade4 varchar(10) DEFAULT "não",
    PRIMARY KEY (id)
    ) DEFAULT charset = utf8;