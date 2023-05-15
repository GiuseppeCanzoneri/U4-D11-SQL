SELECT EXTRACT(YEAR FROM "DataFattura") AS "AnnoFattura", COUNT(*) AS "NumeroFatture"
FROM public."Fattura"
WHERE "Iva" = 20
GROUP BY EXTRACT(YEAR FROM "DataFattura")
ORDER BY "AnnoFattura";
