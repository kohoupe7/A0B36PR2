Grafická kalkulačka
========

Semestrální práce do předmětu A0B36PR2

Cílem práce je vytvořit kalkulačku, která bude schopna kreslit grafy zadaných funkcí. 
Kalkulačka bude umět operace jako +,-,*,/,mocnina,odmocnina,goniometrické funkce, logaritmus 
a bude dodržovat prioritu operátorů. 

Vykreslený graf funkce bude možné uložit do souboru, přibližovat, posouvat a odečítat hodnotu 
funkce pomocí ukazatele myši.

Program je rozdělen do třech balíčků. Balíček s názvem GUI bude obsahovat veškeré uživatelské 
rozhraní s vyjímkou zobrazení grafu. Třídy týkající se vykreslování grafu jsou umístěny v balíčku graf.
Posledním balíčkem je balíček calc. V tomto balíčku budou třídy vykonávající matematické operace na zadaném 
výrazu. Tento balíček také obsahuje třídu Vyraz, ve které je uložen zadaný výraz.
