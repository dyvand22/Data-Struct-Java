select
em.unique_id,
e.name
from Employees as e
  LEFT JOIN EmployeeUNI as em
  on e.id=em.id
  