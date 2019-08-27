insert into users (user_id, password, enabled) values ('admin', '(noop)admin', true);
insert into users (user_id, password, enabled) values ('user', '(noop)user', true);

insert into authorities (user_id, authority) values ('admin', 'ROLE_ADMIN');
insert into authorities (user_id, authority) values ('user', 'ROLE_USER');