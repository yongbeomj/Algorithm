-- 코드를 입력하세요
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE 1=1
AND TO_CHAR(JOINED, 'YYYYMMDD') LIKE '2021%'
AND AGE BETWEEN 20 AND 29;
