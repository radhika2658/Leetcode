# Write your MySQL query statement below
select e.name, b.bonus from employee e left join Bonus b On e.empId = b.empID where bonus <1000 or bonus is null 