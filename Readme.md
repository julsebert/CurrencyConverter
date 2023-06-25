# Currency Converter

Der SDR-Währungsumrechner ist ein praktisches Tool, das es ermöglicht, den Wert verschiedener Währungen in Bezug auf den Sonderziehungsrechtskorb (SDR) zu berechnen. SDR ist eine internationale Reservewährung, die vom Internationalen Währungsfonds (IWF) verwendet wird und aus einem Korb von wichtigen Währungen besteht. Mit diesem Währungsumrechner können Benutzer den aktuellen Wechselkurs zwischen SDR und anderen Währungen ermitteln, was ihnen ermöglicht, den Wert ihres Geldes in SDR oder umgekehrt zu verstehen.
Der SDR-Währungsumrechner ist benutzerfreundlich und intuitiv gestaltet. Durch die Angabe einer Eingangswährung und einer Ausgangswährung kann das Tool einen bestimmten Betrag in die ausgewählte Ausgangswährung umrechnen.


# How to use

Das Programm startet mit einem Menü welches folgenden Optionen zur Auswahl stellt: 
      
      0: Select currency to buy
      1: Select currency to sell
      2: Choose amount to be converted

1. Durch Auswahl der Menüpunkte '0' oder '1' kann der Benutzer die Eingangs- oder Ausgangswährung festlegen. 
   Eine integrierte Suchfunktion ermöglicht es dem Benutzer, nur einen Teil des Währungsnamens in die Konsole einzugeben. 
   Bei mehreren passenden Währungen wird dem Benutzer eine Liste der Währungsnamen angezeigt, aus der er die richtige 
   Währung auswählen kann. Nach Eingabe aller Werte wird der Benutzer wieder ins Menü zurückgeleitet. 

3. Durch Auswahl des Menüpunktes '2' kann der Betrag festgelegt werden, der in die Ausgangswährung umgerechnet werden soll. 
   Bei   Eingabe eines negativen Betrags oder einer Zeichenfolge aus Buchstaben wird dem Benutzer eine Fehlermeldung angezeigt, 
   und die Eingabe kann erneut erfolgen.

4. Dank der interaktiven Gestaltung des Tools können alle Werte beliebig oft neu gesetzt werden. Dies bedeutet, dass Benutzer 
   die Möglichkeit haben, ihre Eingangs- und Ausgangswährungen, sowie den Betrag, so oft wie gewünscht anzupassen.

5. Wenn sich der Benutzer im Menü befindet, kann das Programm durch die Eingabe des Buchstabens 'x' in der Konsole beendet werden.


# Autoren

- Malena Böckmann (Matrikelnummer: 46083)
- Elisabeth Götz (Matrikelnummer: 45827)
- Julia Ebert (Matrikelnummer: 45877)


# Maven Java project archetype


This archetype is based on the
[Maven Archetype Quickstart ](https://mvnrepository.com/artifact/org.apache.maven.archetypes/maven-archetype-quickstart/1.4)
providing the following updates / enhancements:

* Updated [JUnit » 4.x](https://mvnrepository.com/artifact/junit/junit) version.
* [Apache Log4j Core » 2.x](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core)
* [Apache Maven Compiler Plugin » 3.x](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-compiler-plugin)
   setting Java 15 language level.
* [Apache Maven Javadoc Plugin » 3.x](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-javadoc-plugin)
* [Apache Maven Shade Plugin » 3.x](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-shade-plugin) 


This archetype is available from [HdM / MI](https://maven.mi.hdm-stuttgart.de/nexus/service/rest/repository/browse/mi-maven/de/hdm_stuttgart/mi/mi-maven-archetype-quickstart/2.2)
to be used by Maven. This requires configuring access to the MI Nexus server by editing file `~/.m2/settings.xml`
with `~` denoting your home folder:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <profiles>
    <profile>
      <id>development</id>
      <repositories>
        <repository>
          <id>archetypeMI</id>
	      <name>Supplementary MI archetypes and artifacts</name>
          <url>https://maven.mi.hdm-stuttgart.de/nexus/repository/mi-maven</url>
          <releases><enabled>true</enabled></releases>
          <snapshots><enabled>true</enabled></snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <activeProfiles>
    <activeProfile>development</activeProfile>
  </activeProfiles>

</settings>
```
Caution to Windows users: Creating `settings.xml` might result in actually creating `settings.xml.txt`
due to  Microsoft's infameous default »Hide extensions for known file types« setting. You are strongly
advised to [turn this off](https://www.thewindowsclub.com/show-file-extensions-in-windows).



```shell
mvn --batch-mode -e archetype:generate -DgroupId=de.hdm_stuttgart.mi.sd1 \
  -DartifactId=first -Dversion=0.9 -DarchetypeGroupId=de.hdm_stuttgart.mi \
  -DarchetypeArtifactId=mi-maven-archetype-quickstart -DarchetypeVersion=2.2
```


```shell
mvn javadoc:javadoc
```

The resulting `target/site/apidocs/index.html` entry file may be viewed by any reasonable web browser.


The `pom.xml` contains:

```xml
...
<manifestEntries>
  <Main-Class>$package.App</Main-Class>
  <Multi-Release>true</Multi-Release>
</manifestEntries>
...
```

`App.java` is supposed to contain a `main(...)` method to be executed. Invoking `mvn package` results in:

```shell
> mvn clean package
[INFO] Scanning for projects...
...
[INFO] Building jar: /home/goik/tmp/first/target/first-0.9.jar
...
[INFO] Replacing /home/goik/tmp/first/target/first-0.9.jar with /home/goik/tmp/first/target/first-0.9-shaded.jar
...
```
This generated jar is ready to be executed:

```shell
> java -jar target/first-0.9.jar 
Hi there,
 let's have
         fun learning Java!
2022-12-17 22:56:34,478 DEBUG [main] sd1.App (App.java:38) - You may configure 'src/main/resources/log4j2.xml' 
2022-12-17 22:56:34,480 DEBUG [main] sd1.App (App.java:39) - for adapting both console and 'A1.log' file output
```


Three sample classes and one corresponding Junit test class are being provided:


Featuring a Junit test and logging by log4j.


Featuring [highlight.js](https://highlightjs.org) for code highlighting being configured in the`pom.xml`
section `maven-javadoc-plugin`.


Demonstrating LaTeX based formulas to be rendered by [MathJax](https://www.mathjax.org) being configured
in the `pom.xml` section `maven-javadoc-plugin`.
