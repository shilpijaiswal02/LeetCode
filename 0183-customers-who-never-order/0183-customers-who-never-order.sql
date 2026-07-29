# Write your MySQL query statement below
select  c.name As Customers from Customers c where c.id not in(select o.customerId from orders o ) 