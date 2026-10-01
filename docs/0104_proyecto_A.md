# Plantilla: propuesta del Proyecto A

---

## 0 · Datos

| | |
|---|---|
| **Nombre de la app** | | SCP Idle
| **Autor/a** | | Jacobo Ramiro Cadilla
| **Fecha** | | 30/09/2026

---
[boceto proyecto A.pdf](res/boceto%20proyecto%20A.pdf)
## 1 · La idea en una frase

> Qué hace tu app y para quién, en una sola frase.
>
> Fórmula: «Una app que permite a [quién] hacer [qué] para [para qué].»
Un juego incremental que permite a jugadores contener entidades SCP que huyen de su contención, repitiendo en cada vida acciones que cada vez se completan más rápido, permitiéndote hacer más acciones para contener a las entidades
---

## 2 · El problema

> ¿Qué problema resuelve? ¿Cómo se resuelve hoy sin tu app?
Muchos juegos de móvil exigen atención continua y gameplay prolongados, algo que no encaja con los ratos libres de la vida adulta, que en ocasiones tiene ratos libres cortos en vez de jornadas de horas seguidas jugando

Los juegos idle/incremental satisfacen bastante bien esos ratos libres porque dan una sensación de progreso sin tener que invertir demasiado tiempo activo. Este juego busca satisfacer esa necesidad, tu le programas acciones a tu personaje, y este las repite solo, aunque no estés jugando, subiendo niveles para progresar cada vez más

La temática es de un mundo de ficción con comunidad amplia y contenido bajo licencia libre, por lo que puede usarse el contenido dando crédito a los autores originales
---

## 3 · Personas usuarias

> ¿Quién la va a usar? Describe a una persona concreta: edad, soltura con la
> tecnología, cuándo y dónde abre la app, cuánto tiempo le dedica y qué pasa
> si le falla.
Jose, de 21 años, estudiante. Conoce la fundación SCP por videos de youtube y le gusta la temática de terror, pero por sus estudios apenas tiene tiempo para jugar. Como sube al Cuvi en bus, tiene mucho tiempo para jugar en su móvil, al viajar en bus, comer en la facultad y esperar entre clases

Si la app falla, el mayor riesgo es perder el contenido guardado, que si era mucho tiempo invertido, dejaría de jugar, pero se puede solucionar con cloud save
---

## 4 · Funcionalidades
Cada vida es un turno de un guardia de seguridad de bajo nivel y se produce una brecha de contención. El jugador programa una serie de acciones disponibles en un orden concreto y estas tardan un tiempo en completarse que depende el nivel de esa skill. Una barra de amenaza sube mientras la entidad se acerca. Hay acciones que si se completan a tiempo reducen la barra de amenaza, pero si se llena del todo, la entidad te mata.

Una parte de las estadísticas que subes en cada vida se conserva en la siguiente vida, de modo que la mecánica principal es que en cada vida haces cada acción más rápido, hasta poder contener a la entidad. Luego, habrá otra brecha de contención con otra entidad más difícil de contener
### Imprescindibles (sin esto la app no tiene sentido)

| # | Funcionalidad |
|---|---------------|
| F1 | | Empezar una vida y configurar una cola de acciones que se completan solas
| F2 | | Ganar experiencia en la skill usada en cada acción
| F3 | | Consultar experientes de las entidades, que haría una llamada a la wiki para mostrar la ficha completa de la misma (o una resumida)
### Opcionales (si sobra tiempo)

| # | Funcionalidad |
|---|---------------|
| O1 | | En ocasiones, detectar a la entidad moviendo el movil con el scanner, y que vibre con más fuerza cuando se apunta hacia ella (elemento inmersivo/terror)
| O2 | | Logros y registro de récords

---

## 5 · Pantallas

| Pantalla | Para qué sirve | Se llega desde |
|----------|----------------|----------------|
| Inicio | Empezar una vida nueva, ver estadísticas | (arranque) | Muerte
| Partida | Cola de acciones, acciones disponibles, barra de amenaza, estadísticas actuales | Inicio |
| Expediente | Leer la wiki de la entidad | Partida (usando skill de hacking en un computador) |
| Fin de vida | Resumen: Logros, stats subidas, en qué acción y sala morista | Partida |

---

## 6 · Bocetos

> Dibuja las pantallas principales. A mano y fotografiado es válido.
> Pega aquí las imágenes o indica el nombre de los archivos adjuntos.

---

## 7 · Qué datos guarda la app

| Tipo de dato | Campos | Ejemplo |
|--------------|--------|---------|
| Estadística | Nivel, experiencia, logros | Informatica nivel 3 (180/250), Entidades contenidas: SCP106 |
| Vida | Numero, fecha, duracion | Vida 4, 30/09, 16 minutos |
| Accion en cola | ID, skill asociada, progreso 1 | hacking01b, Hacking,  3046/4000 |
---

## 8 · Encaje con los requisitos del módulo

> Apartado obligatorio: ninguna casilla puede quedar vacía.

| Requisito | Dónde encaja en tu app | Tema |
|-----------|------------------------|------|
| **Persistencia de datos** — la información sobrevive al cerrar la app | | 4 |
Niveles de las estadísticas entre vidas, vida en curso y cola de acciones, entidades descubiertas e historial de vidas
| **Servicio web** — la app consulta datos por internet | | 5 |
Consulta a la wiki o a algún repositorio en json de github, ya sea propio, hecho por mí, o ajeno porque la comunidad es enorme
| **Sensor o localización** | | 6 |
El jugador gira el móvil para localizar la entidad, con vibración como respuesta, y si lo hace suficientemente rápido puede conseguir espantar a la entidad (según cuál sea)
| **Contenido multimedia** — foto, audio, vídeo o animación | | 7 |
Sonidos de alarma y ambiente, animación de texto de terminal, parpadeo de luces en la brecha y barras animadas
---

## 9 · Riesgos

| Lo que me preocupa | Plan B |
|--------------------|--------|
| Equilibrar la progresión para que no sea ni demasiado lenta ni demasiado rápida | Empezar con 3 estadísticas y fórmulas sencillas; ajustar los valores probando |
| Que el JSON online no esté disponible | Hacer el json por mi cuenta (usando LLM para resumir la ficha y rehacerla en json) |
| Probar el escáner en el emulador | Probar a compilar la apk, moverla al movil y probar |
| Sobreextender el juego (muchas acciones o entidades) | Limitarse a 2 entidades primero y 3 skills distintas, no más |


---

## Antes de entregar

- [x] La idea cabe en una frase.
- [x] El público es una persona concreta, no «todo el mundo».
- [x] Hay **3 o 4** funcionalidades imprescindibles, no diez.
- [x] Cada funcionalidad imprescindible tiene su pantalla.
- [x] Hay bocetos de las pantallas principales.
- [x] **Las cuatro casillas del apartado 8 están rellenas.**
- [x] Está identificado al menos un riesgo con su plan B.
