INSERT INTO user_details (id, birth_date, name) VALUES (10001, current_date(), 'Yoshi');
INSERT INTO user_details (id, birth_date, name) VALUES (10002, current_date(), 'Mario');
INSERT INTO user_details (id, birth_date, name) VALUES (10003, current_date(), 'Luigi');

INSERT INTO post (id, description, user_id) VALUES (20001, 'Test Post', 10001);
INSERT INTO post (id, description, user_id) VALUES (20002, 'Hello World!', 10002);
INSERT INTO post (id, description, user_id) VALUES (20003, 'Lorem Ipsum', 10002);
INSERT INTO post (id, description, user_id) VALUES (20004, 'Never gonna give you up', 10003);
INSERT INTO post (id, description, user_id) VALUES (20005, 'Never gonna let you down', 10003);