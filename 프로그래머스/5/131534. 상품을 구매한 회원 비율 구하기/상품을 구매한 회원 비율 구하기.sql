-- 코드를 입력하세요
SELECT DATE_FORMAT(O.SALES_DATE, '%Y') AS YEAR, 
DATE_FORMAT(O.SALES_DATE, '%m') AS MONTH, 
COUNT(DISTINCT U.USER_ID) AS PUCHASED_USERS, 
ROUND(COUNT(DISTINCT U.USER_ID)/
      (SELECT COUNT(*) FROM USER_INFO WHERE joined LIKE '2021%'), 1) AS PUCHASED_RATIO
FROM ONLINE_SALE AS O JOIN USER_INFO AS U
ON O.USER_ID = U.USER_ID
WHERE YEAR(JOINED) = 2021
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH