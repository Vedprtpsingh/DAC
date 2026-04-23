

CREATE TABLE Departments 
(dept_id INT PRIMARY KEY AUTO_INCREMENT,
dept_name VARCHAR(50) UNIQUE NOT NULL);


CREATE TABLE Employees 
(emp_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL,
hire_date DATE NOT NULL,
salary DECIMAL(10,2) NOT NULL,
dept_id INT,
FOREIGN KEY (dept_id) 
REFERENCES Departments(dept_id) ON DELETE SET NULL);

INSERT INTO Departments (dept_name) 
VALUES
('IT'),
('HR'),
('Finance'),
('Marketing'),
('Operations');

INSERT INTO Employees 
(first_name, last_name, email, hire_date, salary, dept_id) 
VALUES
('Amit', 'Sharma', 'amit.sharma@example.com', '2022-01-15', 60000.00, 1),
('Priya', 'Verma', 'priya.verma@example.com', '2021-07-20', 75000.00, 2),
('Rohit', 'Patel', 'rohit.patel@example.com', '2020-03-12', 80000.00, 3),
('Sneha', 'Iyer', 'sneha.iyer@example.com', '2019-06-25', 90000.00, 1),
('Vikram', 'Singh', 'vikram.singh@example.com', '2023-02-10', 55000.00, NULL);

CREATE TABLE Projects 
(project_id INT PRIMARY KEY AUTO_INCREMENT,
project_name VARCHAR(100) NOT NULL,
dept_id INT,
FOREIGN KEY (dept_id) 
REFERENCES Departments(dept_id) ON DELETE CASCADE);

INSERT INTO Projects 
(project_name, dept_id) 
VALUES
('E-Governance System', 1),
('Campus Hiring Drive', 2),
('Budget Planning & Analysis', 3),
('Social Media Outreach', 4),
('Logistics Automation', 5);