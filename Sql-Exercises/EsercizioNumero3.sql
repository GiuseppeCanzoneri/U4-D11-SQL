SELECT EXTRACT(YEAR FROM "DataFattura") AS "AnnoFatturazione", COUNT(*) AS "NumeroFatture", SUM("Importo") AS "TotaleImporti"
FROM public."Fattura"
GROUP BY EXTRACT(YEAR FROM "DataFattura")
ORDER BY "AnnoFatturazione";
