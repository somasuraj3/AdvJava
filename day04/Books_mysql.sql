

CREATE TABLE LOGIN (USERNAME VARCHAR(20) PRIMARY KEY, PASSWORD VARCHAR(20));
INSERT INTO LOGIN VALUES ('nilesh', 'nilesh');
INSERT INTO LOGIN VALUES ('soham', 'soham');

CREATE TABLE BOOKS (ID INT PRIMARY KEY, NAME TEXT, AUTHOR TEXT, SUBJECT TEXT, PRICE DOUBLE);
INSERT INTO BOOKS VALUES (11,'EXPLORING C','KANETKAR','C',123.4);
INSERT INTO BOOKS VALUES (12,'POINTERS IN C','KANETKAR','C',370);
INSERT INTO BOOKS VALUES (13,'ANSI C PROGRAMMING','BALGURUSWAMI','C',330);
INSERT INTO BOOKS VALUES (14,'ANSI C PROGRAMMING','RITCHIE','C',140);
INSERT INTO BOOKS VALUES (21,'C++ COMPLETE REFERENCE','SCHILDT','CPP',410);
INSERT INTO BOOKS VALUES (22,'C++ PRIMER','LIPPMAN','CPP',620);
INSERT INTO BOOKS VALUES (23,'C++ PROGRAMMING LANGUAGE','STROUSTRUP','CPP',540);
INSERT INTO BOOKS VALUES (31,'JAVA COMPLETE REFERENCE','SCHILDT','JAVA',520);
INSERT INTO BOOKS VALUES (32,'CORE JAVA VOLUME I','HOARSMAN','JAVA',575);
INSERT INTO BOOKS VALUES (33,'JAVA PROGRAMMING LANGUAGE','JAMES','JAVA',450);
INSERT INTO BOOKS VALUES (41,'OPERATING SYSTEM CONCEPTS','GALVIN','OS',567.3);
INSERT INTO BOOKS VALUES (42,'DESIGN OF UNIX OS','BACH','OS',421);
INSERT INTO BOOKS VALUES (43,'UNIX INTERNALS','VAHALIA','OS',352);

COMMIT;
