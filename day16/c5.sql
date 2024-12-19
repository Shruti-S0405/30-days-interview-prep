Select distinct city from Station 
where lower(substr(city,-1,1)) not in ('a', 'e', 'i', 'o', 'u');