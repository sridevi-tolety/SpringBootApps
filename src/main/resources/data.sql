DROP TABLE IF EXISTS employee;
 
CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  dob Date DEFAULT NULL
);
 
INSERT INTO employee (name, dob) VALUES
  ('Aliko', sysdate),
  ('Bill', sysdate),
  ('Folrunsho', sysdate);

DROP TABLE IF EXISTS employee_swipe;
 
CREATE TABLE employee_swipe (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  emp_id int not null,
  location varchar(200) not null,
  date Date ,
  swipe_in Time ,
  swipe_out Time	

);
 
INSERT INTO employee_swipe (emp_id,date,location , swipe_in,swipe_out) VALUES
(1, sysdate, 'thislocation', now(),null),
(2, sysdate, 'thislocation', now(),null),
(3, sysdate, 'thislocation', null,now()),
(4, sysdate, 'thislocation', null,now());
