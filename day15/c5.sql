Select distinct city 
from Station 
where 
lower(substr(city, -1, 1)) in ('a', 'e', 'i', 'o', 'u') and 
lower(substr(city, 1, 1)) in ('a', 'e', 'i', 'o', 'u');