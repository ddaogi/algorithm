SELECT ic.INGREDIENT_TYPE, SUM(f.TOTAL_ORDER) as TOTAL_ORDER 
FROM ICECREAM_INFO ic 
JOIN FIRST_HALF f
ON ic.FLAVOR = f.FLAVOR 
GROUP BY ic.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER