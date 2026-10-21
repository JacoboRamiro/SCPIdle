# Propuesta del Proyecto A

---

## 0 · Datos

| Campo | Valor |
|---|---|
| **Nombre de la app** | SCP Idle |
| **Autor/a** | Jacobo Ramiro Cadilla |
| **Fecha** | 30/09/2026 |

---

## 1 · La idea en una frase

Un juego incremental por turnos que permite a jugadores contener entidades SCP que huyen de su contención, mejorando en cada vida las skills que usan para poder hacer más acciones y llegar más lejos

---

## 2 · El problema

Muchos juegos de móvil exigen atención continua y gameplay prolongados, algo que no encaja con los ratos libres de la vida adulta, que en ocasiones tiene ratos libres cortos en vez de jornadas de horas seguidas jugando

Los juegos idle/incremental satisfacen bastante bien esos ratos libres porque dan una sensación de progreso sin tener que invertir demasiado tiempo activo. Este juego busca satisfacer esa necesidad, eliges las acciones que va a hacer tu personaje en el turno, le das a un botón para que se procesen y ves el resultado, y lo puedes dejar en cualquier momento y seguir luego

La temática es de un mundo de ficción con comunidad amplia y contenido bajo licencia libre, por lo que puede usarse el contenido dando crédito a los autores originales

---

## 3 · Personas usuarias

Jose, de 21 años, estudiante. Conoce la fundación SCP por videos de youtube y le gusta la temática de terror, pero por sus estudios apenas tiene tiempo para jugar. Como sube al Cuvi en bus, tiene mucho tiempo para jugar en su móvil, al viajar en bus, comer en la facultad y esperar entre clases

Si la app falla, el mayor riesgo es perder el progreso de las skills, que si era mucho tiempo invertido, dejaría de jugar, por eso se guarda todo en el móvil después de cada turno

---

## 4 · Funcionalidades

Cada vida es un turno de un guardia de seguridad de bajo nivel y se produce una brecha de contención. En cada turno el jugador elige de una lista las acciones que quiere hacer y le da al botón de procesar turno, y se resuelven todas de golpe, no hay nada en tiempo real. Cada turno sube la amenaza de la entidad, hay acciones que la bajan, pero si llega a 100 la entidad te mata.

Las skills que subes en cada vida se conservan en la siguiente, de modo que cada vez llegas más lejos hasta poder contener a la entidad. Luego, habrá otra brecha de contención con otra entidad más difícil de contener

### Imprescindibles (sin esto la app no tiene sentido)

| # | Funcionalidad |
|---|---|
| F1 | Empezar una vida, elegir las acciones del turno y procesarlo con un botón |
| F2 | Ver las skills y su nivel, que se conserva entre vidas |
| F3 | Consultar la lista de entidades descubiertas y el expediente de cada una, que se descarga de internet |
| F4 | Ver el historial de vidas y el resumen de cada una |

### Opcionales (si sobra tiempo)

| # | Funcionalidad |
|---|---|
| O1 | Logros y registro de récords |
| O2 | Más entidades y más acciones |

---

## 5 · Pantallas

| Pantalla | Para qué sirve | Se llega desde |
|---|---|---|
| Inicio | Lista de skills con su nivel, últimas vidas y empezar una vida nueva | (arranque), Resumen de vida |
| Turno | Lista de acciones del turno, amenaza y botón de procesar turno | Inicio |
| Resumen de vida | Turnos que aguantaste, entidad, de qué moriste y experiencia ganada | Turno (al morir), Inicio (tocando una vida) |
| Archivo | Lista de entidades descubiertas | Inicio |
| Expediente | Ficha de la entidad: clase, descripción, cómo contenerla y créditos | Archivo, Turno (acción investigar) |

---

## 6 · Bocetos

Bocetos de la primera versión: [boceto proyecto A.pdf](res/boceto%20proyecto%20A.pdf). Inicio, Expediente y Fin de vida (ahora Resumen de vida) siguen valiendo, Turno y Archivo los rehago con el diseño nuevo

---

## 7 · Qué datos guarda la app

| Tipo de dato | Campos | Ejemplo |
|---|---|---|
| Skill | Nombre, nivel, experiencia | Hacking nivel 3 (180/250) |
| Vida | Numero, fecha, turnos, entidad, causa de la muerte | Vida 4, 30/09, 12 turnos, SCP-173, corriendo por el pasillo B |
| Accion del turno | Tipo, skill asociada, orden | Hackear terminal, Hacking, 2 |
| Entidad | Codigo, nombre, clase, descripcion, como contenerla, autor, enlace | SCP-173, Euclid, vigilancia constante |

---

## 8 · Encaje con los requisitos del módulo

| Requisito | Dónde encaja en tu app | Tema |
|---|---|---|
| **Persistencia de datos** | Niveles de las skills entre vidas, vida en curso, historial de vidas y entidades descubiertas | 4 |
| **Servicio web** | Los expedientes se descargan de un json en mi github | 5 |
| **Sensor o localización** | La acción detectar pide apuntar el móvil hacia un punto cardinal y lee la brújula una vez, si coincide encuentras a la entidad | 6 |
| **Contenido multimedia** | Sonido de alarma cuando sube la amenaza y animación de texto de terminal al abrir un expediente | 7 |

---

## 9 · Riesgos

| Lo que me preocupa | Plan B |
|---|---|
| Equilibrar la progresión para que no sea ni demasiado lenta ni demasiado rápida | Empezar con 3 skills y fórmulas sencillas; ajustar los valores probando |
| Que el json online no esté disponible | Guardar una copia del json en la app y usarla si falla |
| Probar la brújula en el emulador | Probar a compilar la apk, moverla al movil y probar |
| Sobreextender el juego (muchas acciones o entidades) | Limitarse a 2 entidades primero y 3 skills distintas, no más |
