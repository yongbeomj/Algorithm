-- 코드를 입력하세요
SELECT
    WAREHOUSE_ID,
    WAREHOUSE_NAME,
    ADDRESS,
    NVL (FREEZER_YN, 'N')
FROM
    FOOD_WAREHOUSE
WHERE
    ADDRESS LIKE '경기도%'
ORDER BY
    WAREHOUSE_ID ASC;