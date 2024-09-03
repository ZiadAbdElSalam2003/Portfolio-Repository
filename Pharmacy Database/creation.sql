use pharmacy;
-- Supplier table
CREATE TABLE Supplier (
    supp_id INT PRIMARY KEY auto_increment,
    e_mail VARCHAR(100)  not null check(e_mail like '%@gmail.com'),
    company_name VARCHAR(100) not null 
);

-- Supplier Phone table
CREATE TABLE Supplier_Phone (
    supp_id INT ,
    phone varchar(11) check(length(phone)=11 or length(phone)=7 ), #phone no. or telephone no.
    primary key(supp_id,phone), 
    FOREIGN KEY (supp_id) REFERENCES Supplier(supp_id)
);

-- Medication table
CREATE TABLE Medication (
    drug_id INT PRIMARY KEY auto_increment,
    drug_name VARCHAR(100) unique not null,
    dosage VARCHAR(50),
    price DECIMAL(10, 2)not null,
    description TEXT not null,
    manufacture VARCHAR(100) not null,
    supp_id INT,
    FOREIGN KEY (supp_id) REFERENCES Supplier(supp_id)
);

-- Employee table
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY auto_increment,
    first_name VARCHAR(50) not null,
    last_name VARCHAR(50)not null,
    street VARCHAR(100),
    city VARCHAR(50),
    country VARCHAR(50),
    phone VARCHAR(11)  not null unique check(length(phone)=11),
    manager INT not null ,
    FOREIGN KEY (manager) REFERENCES Employee(emp_id)
);

-- Doctor table
CREATE TABLE Doctor (
    doc_id INT PRIMARY KEY auto_increment,
    first_name VARCHAR(50) not null,
    last_name VARCHAR(50) not null,
    phone VARCHAR(11)  not null unique check(length(phone)=11)
);

-- Patient table
CREATE TABLE Patient (
    patient_id INT PRIMARY KEY auto_increment,
    first_name VARCHAR(50) not null,
    last_name VARCHAR(50) not null,
    street VARCHAR(100),
    city VARCHAR(50),
    country VARCHAR(50)
);

-- Patient Phones table
CREATE TABLE Patient_Phones (
    patient_id INT,
    phone VARCHAR(11) check(length(phone)=11),
    PRIMARY KEY (patient_id, phone),
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)
);

-- Prescription table
CREATE TABLE Prescription (
    pre_id INT PRIMARY KEY auto_increment,
    details TEXT,
    date DATE not null,
    emp_id INT,
    doc_id INT,
    patient_id INT,
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id),
    FOREIGN KEY (doc_id) REFERENCES Doctor(doc_id),
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)
);

-- Doc Treats table
CREATE TABLE Doc_Treats (
    patient_id INT,
    doc_id INT,
    PRIMARY KEY (patient_id, doc_id),
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id),
    FOREIGN KEY (doc_id) REFERENCES Doctor(doc_id)
);

-- Transaction table
CREATE TABLE Transaction (
    t_id INT PRIMARY KEY auto_increment,
    cost DECIMAL(10, 2) not null,
    date DATE not null,
    emp_id INT,
    patient_id INT,
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id),
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)
);

-- Med Prescripted table
CREATE TABLE Med_Prescripted (
    pre_id INT,
    drug_id INT,
    PRIMARY KEY (pre_id, drug_id),
    FOREIGN KEY (pre_id) REFERENCES Prescription(pre_id),
    FOREIGN KEY (drug_id) REFERENCES Medication(drug_id)
);

-- Med Transaction table
CREATE TABLE Med_Transaction (
    drug_id INT,
    t_id INT,
    quantity int not null,
    PRIMARY KEY (drug_id, t_id),
    FOREIGN KEY (drug_id) REFERENCES Medication(drug_id),
    FOREIGN KEY (t_id) REFERENCES Transaction(t_id)
);

-- Inventory table
CREATE TABLE Inventory (
    drug_id INT,
    quantity INT not null,
    exp_date DATE not null,
    reorder INT not null,
    FOREIGN KEY (drug_id) REFERENCES Medication(drug_id)
);

-- Order table
CREATE TABLE Orderr (
    order_id INT PRIMARY KEY auto_increment,
    order_date DATE not null,
    supp_id INT,
    emp_id INT,
    FOREIGN KEY (supp_id) REFERENCES Supplier(supp_id),
    FOREIGN KEY (emp_id) REFERENCES Employee(emp_id)
);

-- Order Line table
CREATE TABLE Order_Line (
    order_id INT,
    drug_id INT,
    quantity INT not null,
    cost DECIMAL(10, 2) not null,
    PRIMARY KEY (order_id, drug_id),
    FOREIGN KEY (order_id) REFERENCES Orderr(order_id),
    FOREIGN KEY (drug_id) REFERENCES Medication(drug_id)
);



