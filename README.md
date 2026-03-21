# 🎸 Banda Musical Aleatoria

Proyecto en Java que simula una banda musical donde amigos se unen de forma aleatoria y tocan diferentes instrumentos.

---

## 🧠 Descripción

La banda invita músicos (amigos) de manera aleatoria.  
Cada amigo tiene un instrumento, el cual debe afinar antes de tocar.  

Se aplican conceptos de:
- Programación orientada a objetos
- Herencia
- Polimorfismo
- Interfaces
- Factory Method

---

## 📊 Diagrama UML

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

    class Guitarra
    class Piano
    class Violin
    class Bajo

    Banda "1" o-- "0..*" Musico
    Musico <|.. Amigo
    Amigo --> Instrumento
    Instrumento <|-- Guitarra
    Instrumento <|-- Piano
    Instrumento <|-- Violin
    Instrumento <|-- Bajo
