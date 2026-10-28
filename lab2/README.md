# Programmazione ad Oggetti - Laboratorio 02

#### FASE 1 - Principio di incapsulamento


#### Il metodo `toString()`

* Analizzare `AccountHolder` 
* Modella un generico utilizzatore di conto bancario, identificato da un id
* È realizzata applicando i principi di incapsulamento e information hiding (che andranno applicati *sempre* d'ora in poi ad *ogni* classe che costruiremo).
* Si implementi il metodo `String toString()` lasciato incompleto (si ricordi che `String toString()` è il metodo convenzionalmente usato in Java per ottenere la rappresentazione testuale di un oggetto).

#### Costruzione di classi incapsulate

* Si completi la classe `SimpleBankAccount` seguendo le istruzioni riportate nei commenti della medesima
* Si testi l'implementazione utilizzando la classe `TestSimpleBankAccount`.


### FASE 2 - Interfacce

* Si modifichi la classe `SimpleBankAccount` in modo che implementi l'interfaccia `BankAccount` (presente nel package `bank.interfaces`), realizzando solo i metodi necessari affinché l'interfaccia risulti correttamente implementata.
    - Si noti che per SimpleBankAccount non sono previste spese di gestione. Quindi, il metodo `chargeManagementFees()` va definito (in quanto previsto dall'interfaccia) ma avrà corpo vuoto...
* Si implementi in autonomia la classe `StrictBankAccount`, tale che:
    - `StrictBankAccount` implementa `BankAccount`
    - Le operazioni sul conto dovranno essere abilitate solo se lo user id corrisponde a quello a cui il conto è stato associato
    - Non dovrà essere possibile effettuare dei prelievi se l'ammontare da prelevare specificato è superiore alla disponibilità corrente del conto. Se il caso si verifica, le operazioni di prelievo non dovranno fare nulla.
    - Le spese di gestione dovranno essere calcolate come segue: al costo fisso di 5 Euro andrà aggiunto un costo variabile di 0.1 euro per ciascuna transazione effettuata
* Effettura il test di `StrictBankAccount` seguendo le indicazioni fornite ed i commenti in `TestBankAccount` (presente nel package `bank.interfaces`)

### FASE 3 - Composizione

* Si osservi il banale sistema software nel package `acme`.
    - Contiene un sistema per la gestione di appelli d'esame universitari. Gli studenti possono vedere gli esami esistenti, registrarsi, visualizzare i voti degli esami conclusi, visualizzare le statistiche relative ai propri esami. I docenti possono creare nuovi appelli, inserire voti per gli appelli passati, visualizzare statistiche relative agli appelli.
* Si osservi l'interfaccia `User`, che definisce un generico utente del sistema, e la classe `Student` che la implementa.
* Si implementi la classe `Professor`, che implementa `User` e modella un generico docente
    - Campi:
        * `int id`
        * `String name`
        * `String surname`
        * `String password` (nota, in realtà le password non dovrebbero mai esser tenute in chiaro)
        * `String[] courses`
    - Un solo costruttore che richieda i dati necessari ad inizializzare la classe
    - Metodi:
        * `public void replaceCourse(String course, int index)`: sostituisce il corso all'indice `index` con quello fornito in input
        * `public void replaceAllCourses(String[] courses)`: sostituisce tutti i corsi tenuti dal docente
* Si implementi la classe `Exam`, che modella un generico appello d'esame.
    - Campi:
        * `int id`
        * `int maxStudents`
        * `int registeredStudents`
        * `String courseName`
        * `Professor professor`
        * `ExamRoom room` (fornita nei sorgenti)
        * `Student[] students`
    - Un solo costruttore che richieda i dati necessari ad inizializzare la classe. Inizialmente ci dovranno essere zero studenti registrati.
    - Metodi:
        * Opportuni selettori per le proprietà dell'esame
        * `public void registerStudent(Student student)`: iscrive lo studente all'appello. Qualora si sia raggiunto il limite massimo di studenti per l'appello, non fa nulla.
        * Si implementi `toString()` in modo opportuno, utilizzando la funzione di utilità `Arrays.toString()` per ottenere una rappresentazione formato `String` di un array
    - Nota: è possibile creare l'array di studenti fissandone la dimensione al numero massimo di studenti, ed usando il numero di studenti registrati come indice per sapere in che posizione registrare nuovi studenti.
* Si seguano le linee guida in `Testing` per effettuare il test delle classi `Professor` ed `Exam`

