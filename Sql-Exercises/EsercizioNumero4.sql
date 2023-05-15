SELECT *
FROM public."Prodotto"
WHERE EXTRACT(YEAR FROM "DataAttivazione") = 2017
AND ("inProduzione" = true OR "inCommercio" = true);
