use pharmacy;
select * from employee;
select * from supplier;
select * from doctor;
UPDATE employee SET phone = '01207651310' WHERE emp_id = 1;
DELETE FROM Employee WHERE emp_id = 4 ;
UPDATE Doctor SET first_name = 'Ali', last_name = 'Hassan' WHERE doc_id = 1;
ALTER TABLE Employee ADD COLUMN salary DECIMAL(10, 2);
DELETE FROM Supplier WHERE supp_id = 4;
SELECT CONCAT(drug_name, ' - $', price) AS drug_info FROM Medication;
SELECT DISTINCT country FROM Patient; 
SELECT Prescription.pre_id, Prescription.details, Doctor.first_name AS doctor_first_name, Doctor.last_name AS doctor_last_name
FROM Prescription
INNER JOIN Doctor ON Prescription.doc_id = Doctor.doc_id;

select drug_id,drug_name,dosage,price,manufacture 
from Medication
where price>20
and manufacture like '%pharco%';

select emp_id,first_name,last_name,street,city,country,phone
from employee
where first_name like'%omar%'
or street like '%el nasr street%';

select drug_id,quantity,exp_date,reorder
from Inventory 
where quantity >700
or reorder >120;

select  drug_id,drug_name,dosage,price,manufacture 
from medication 
where manufacture
not in('pharco','medico');

SELECT *FROM Medication WHERE price < 30;
SELECT MAX(price) AS max_price FROM Medication;
SELECT * FROM Patient LIMIT 1;
SELECT * FROM Employee WHERE first_name = 'omar' AND last_name = 'amir';
SELECT *FROM Supplier WHERE company_name = 'medico';



select drug_id,drug_name,dosage,price,manufacture 
from Medication
order by price;

select drug_id,drug_name,dosage,price,manufacture 
from Medication
order by price desc;

ALTER TABLE medication modify description varchar(240);
ALTER TABLE patient drop column country;

SELECT supplier.supp_id, medication.drug_name,medication.price,medication.description
FROM medication
LEFT JOIN supplier on medication.supp_id=supplier.supp_id
ORDER BY medication.drug_name;

SELECT employee.emp_id,Prescription.pre_id,prescription.details,prescription.date
FROM prescription
RIGHT JOIN employee ON prescription.emp_id=employee.emp_id
ORDER BY prescription.pre_id;

SELECT Transaction.t_id,employee.first_name
FROM Transaction
CROSS JOIN employee;