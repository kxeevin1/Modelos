# Banda Musical Aleatoria

Kevin Jhoan Carreño Patiño - 20242020308
Daniel Felipe Santamaria Duran - 20242020023

## Diagrama UML

```mermaid
classDiagram

    class Banda {
        -String nombre
        -ArrayList~Musico~ integrantes
        +invitarMusicos(int cantidad)
        +afinarBanda()
        +tocarBanda()
        -generarMusico() Musico
    }

    class Musico {
        <<interface>>
        +tocar()
        +afinar()
    }

    class Amigo {
        -String nombre
        -Instrumento instrumento
        +tocar()
        +afinar()
    }

    class Instrumento {
        <<abstract>>
        +tocar()*
        +afinar()*
    }

    class Guitarra {
        +tocar()
        +afinar()
    }

    class Piano {
        +tocar()
        +afinar()
    }

    class Violin {
        +tocar()
        +afinar()
    }

    class Bajo {
        +tocar()
        +afinar()
    }

    %% Relaciones
    Banda "1" o-- "0..*" Musico : tiene
    Musico <|.. Amigo : implementa
    Amigo "1" --> "1" Instrumento : usa

    Instrumento <|-- Guitarra
    Instrumento <|-- Piano
    Instrumento <|-- Violin
    Instrumento <|-- Bajo

    Banda ..> Amigo : crea
    Banda ..> Instrumento : genera
