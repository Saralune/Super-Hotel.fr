-- ------------------------------------------------------------------------------
-- - Gestion droit d'accès                                 						  ---
-- ------------------------------------------------------------------------------

USE superhotel;

-- -----------------------------------------------------------------------------
-- - Construction de la table des users                         			     ---
-- -----------------------------------------------------------------------------

INSERT INTO users(mail, PASSWORD, active, name) VALUES('saralune@mail.fr',	'$2a$12$PQBgT26y7hjZKdGChlkdPOaO16hNcwa3WFrEYFuuMUi2oyxqBs59K', 1, "saralune");
INSERT INTO users(mail, PASSWORD, active, name) VALUES('test@test.fr',	'$2a$12$0suqSj/n2RsVKao..cGqLuO41/9gUXPEZKrq5sF3y45uadbxfSYsm', 1, "test");
INSERT INTO users(mail, PASSWORD, active, name) VALUES('sara@test.fr',	'$2a$12$9uHBCsoPwLVgfKfLIkX2GO3B1O6PO6UiMFU4gSrL4eEKMulUA89TK', 1, "sara");

SELECT * FROM users;

-- -----------------------------------------------------------------------------
-- - Construction de la table avec 1 role						                    ---
-- -----------------------------------------------------------------------------

INSERT INTO role ( role ) VALUES ( 'ADMIN' );
INSERT INTO role ( role ) VALUES ( 'GESTIONNAIRE' );

SELECT * FROM role;

-- -----------------------------------------------------------------------------
-- - Construction de la table des roles par user   						        ---
-- -----------------------------------------------------------------------------

INSERT INTO users_role(users_id, role_id) VALUES('1', '1');
INSERT INTO users_role(users_id, role_id) VALUES('2', '2');
INSERT INTO users_role(users_id, role_id) VALUES('3', '2');
INSERT INTO users_role(users_id, role_id) VALUES('3', '1');

SELECT * FROM users_role;