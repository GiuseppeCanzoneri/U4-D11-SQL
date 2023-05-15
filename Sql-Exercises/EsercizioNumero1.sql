SELECT "Nome", "Cognome"
FROM public."Clienti"
WHERE EXTRACT(YEAR FROM "DataNascita") = 1982;
