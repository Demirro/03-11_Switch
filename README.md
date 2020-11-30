# 03-12_Switch
Übungsaufgabe für das Programmierpraktikum im Wise 20/21 für den 03.12.2020

# Willkommen bei der vierten Übungsaufgabe.

Ihr findet im Download wieder eine Vorlage. Dieses mal etwas ruhiger als die letzte Woche. Mit If-Else-Ausdrücken haben wir ja bereits gearbeitet. Switches allerdings sind da neu. Da Börges Hausaufgabe aber schon sehr gut ist, um den Umgang mit Switches und Ternary-Operatoren (Elvis-Operator), kommt in der Übung diese Woche nur ein bisschen Wiederholung, mit einem kleinen neuen Bauteil in Java.

Wir benutzen diese Woche einen Scanner, der einem die Eingabe in die Konsole ermöglicht. Mit der Eingabe kann man dann im Programm weiterarbeiten. Über die genaue Funktionsweise des Scanners und wie ihr ihn selbst einbaut sprechen wir zu einem späteren Zeitpunkt.

### 📝 Aufgabe:

Wir schreiben heute ein Programm für einen Supermarkt, welches Produkte, die von einem/r Nutzer/in eingegeben werden, darauf überprüft ob sie momentan im Angebot sind. Dazu folgende Liste:

| Artikel          | Status      |
|------------------|-------------|
| Milch            | 10%         |
| Eier             | 10%         |
| Butter           | 20%         |
| Kartoffeln       | 20%         |
| Klopapier        | Ausverkauft |
| Hefe             | Ausverkauft |
| Schokolade       | Normalpreis |
| Apfelsaft        | Normalpreis |

Und da es sich um einen sehr kleinen Supermarkt handelt, ist es alles was dieser momentan führt. Entsprechend sollten alle Nutzer/inneneingaben, die nicht in dieser Liste vorkommen, einen Fehler ausgeben (Bsp: "Produkt nicht gefunden").

Beispiel:
Nach dem Starten des Programms wird *Milch* in die Konsole eingetippt. Das Programm sollte eine Konsolenausgabe zurückgeben, die über das entsprechende Angebot, in diesem Falle 10% Rabatt, informiert.

#### Eure spezifischen Aufgaben sind:
- Ladet euch die Vorlage runter und importiert sie in Eclipse (oder eure IDE)
- Vervollständigt die Methode *checkDeals(String artikel)*, sodass das Programm so funktioniert wie oben beschrieben
- Schreibt einen kurzen JavaDoc zu der Methode *checkDeals*

## Tipps
- Ihr müsst nur an der Methode *checkDeals* tüfteln. Die Main-Methoden solltet ihr auch gar nicht anrühren.
- Überlegt euch wie ihr euren Code so kompakt wie möglich gestaltet, sodass ihr Zeit, Arbeit und Platz spart.
  - Denkt daran welche Funktionsweisen ein Switch hat
- Zur Lösung der Aufgabe kann ein einziger Switch ausreichen.

- Im Projekt befindet sich eine Zip, welche meine Musterlösung beinhaltet
    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Aufzeichnung des Seminars](https://www.ilias.uni-koeln.de/ilias/ilias.php?ref_id=3638292&eid=15a16010-764a-4086-8b69-56d9b3025e7f&cmd=streamVideo&cmdClass=xoctplayergui&cmdNode=wn:os:17u:185&baseClass=ilrepositorygui)
- [📃 Conditionals (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Konditionale.html)
- [📃 Conditionals (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Konditionale.html)

- [📃 Java Naming Conventions](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Naming-Conventions.md)
