

# Prework Java
> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`.

Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".

Zwróć uwagę, żeby użyć adresu własnego forka, powinien wyglądać zgodnie ze schematem:
`https://github.com/twoj-login/adres_repozytorium`

3. Zaimportuj projekt jako projekt `Maven`, wg poniższych wskazówek:

	* W `IntelliJ` wybieramy: `File –> New –> Project from Existing Sources...`
	* Wskazujemy lokalizację katalogu ze sklonowanym projektem i zatwierdzamy.
	* Następnie w nowym oknie wybieramy: `Import project from external model` i wskazujemy `Maven`
	* Wybieramy opcję: ` Finish`, (w `IntelliJ` przed 2020: `Next –> Next –> Next –> Finish`)

Jeżeli jest to pierwsze uruchomienie `IntelliJ` z ekranem startowym 
([*https://www.jetbrains.com/help/idea/run-for-the-first-time.html#start-project*](https://www.jetbrains.com/help/idea/run-for-the-first-time.html#start-project)) 
wybieramy opcję open.	


## Plan tego repozytorium
    
Tutaj znajdziesz zadania do zajęć. Wrzucaj je systematycznie na Githuba.

* src/main/java/pl/merito/afirstprogram
* src/main/java/pl/merito/bvariablesandoperators
* src/main/java/pl/merito/cflowcontrol
* src/main/java/pl/merito/darrays
* src/main/java/pl/merito/estartupparameters


Poszczególne zadania rozwiązuj w odpowiednich plikach.

Testy do zadań operują na wyświetlanych w metodach komunikatach. Unikaj dodatkowych wywołań, np.:
````java
System.out.println("some message");
````

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

## Uwagi do zadań

Jeśli masz uwagi do zadań, możesz je zgłaszać mailowo na adres: 
 <a href="mailto:<a href='mailto:jozwiak.arek@gmail.com'>jozwiak.arek@gmail.com</a>">arkadiusz.jozwiak@coderslab.pl</a>,
 w temacie wpisując: **Uwagi do zadań**.
 
Aby można było szybko zlokalizować problem i się do niego odnieść, umieść w mailu następujące informacje:

- link do strony z zadaniem
- numer zadania (ewentualnie podpunkt)
- opis problemu
