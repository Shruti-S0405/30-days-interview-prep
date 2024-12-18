Select distinct CITY from Station 
where lower(substr(city, -1, 1)) in ('a', 'e', 'i', 'o', 'u');