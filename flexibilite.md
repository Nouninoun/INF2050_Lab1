# Critère Flexibilité

## Description
La flexibilité d'un outil de build est détérminée par sa capacité de subvenir facilement aux besoins de l'usager. Le nombre de fonctionnalités, les commandes du terminal, son adaptabilité aux situations différentes, le temps que prend l'outil pour construire un build et la capacité de modifier les tâches automatisées sont tous des facons d'évaluer sa flexibilité. Un outil qui est capable de gérer plusieurs tâches avancées est considéré flexible.

## Pourquoi ce critère est important?
Ce critère est l'un des plus importants chez les développeurs dans leurs choix d'outil car dépendamment des besoins, certains outils sont préférables à d'autres.
Par exemple, Google a choisi **Gradle** comme outil de build officiel pour **Android** parce que Gradle est modelé d'une facon qui est extensible. 
Source: Gradle(https://gradle.org/maven-vs-gradle/)
Le model Gradle peut être utilisé pour du développement de C/C++ et peut être étendu à n'importe quel écosystème.

## Gradle vs Maven
L'outil qui a une meilleure fléxibilité entre Maven et Gradle est:  **Gradle**
Voici Pourquoi:
    1.  Gradle a une meilleure capacité d'automatisation des tâches
    2.  Gradle est conçu pour les usagers responsables
    3.  Flexible car il est basé sur un script.
    4.  Plus facile à utiliser les builds sur mesure
    5.  Les scripts de Gradle sont plus propres que les scripts de Maven
    6.  Permet de structurer les builds
    7.  Supporte les builds multi-projets
    8.  Choix de 2 languages: Gradle ou Kotlin
    9.  Logiciel libre qui se concentre sur la flexibilité et la performance
    10. Aucun XML
    11. Code court et simple à écrire. Par exemple: `plugins {
        id 'java'
    }` Ce petit bout de code ajoute plus de 20 tâches à utiliser
    12. Syntax courte et facile à comprendre
    13. Seul Gradle offre la convention et la création de commandes simultanément
    14. fichier de build `build.gradle` très facile à comprendre et modifier
    15. Utilise un style/design minimaliste
    16. Favorable aux plugins
    17.  Le langage Kotlin permet d'adapter l'outil aux besoins de l'usager et est plus flexible que le XML

Toutes ces raisons sont pourquoi **Gradle** est le meilleur outil en termes de *flexibilité*.
