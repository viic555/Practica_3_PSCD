# Práctica 3 — Material para el alumnado

Curso 2026–2027. Java 25. Dos semanas. Parejas u opción individual.
Contrato: P3-Java-2026-2027-v01.

Empieza por Practica_3_Java_2026_2027_v01.docx. Contiene el enunciado, las pruebas,
la rúbrica y dos anexos introductorios. La fecha de entrega se indicará en Moodle.

El archivo ejemplo/MicroSenal.java es un programa completo de una señal entre dos
hilos. Las carpetas pruebas/COMANDOS.md y pruebas/REGISTRO.md ayudan a ejecutar
las pruebas y registrar las evidencias. El registro no contiene resultados: debes
completarlo con los de tu implementación.

## Ejemplo introductorio

Desde esta carpeta:

```text
javac -encoding UTF-8 -d out_ejemplo ejemplo/MicroSenal.java
java -cp out_ejemplo MicroSenal
```

Resultado esperado en una ejecución normal: `dato=42`.

## Tu implementación

Crea src/Practica3.java y las clases que necesites en src, sin declaración package.
Después, desde la carpeta que contiene src:

```text
javac -encoding UTF-8 -d out src/*.java
java -cp out Practica3 3 2 2 1
```

Consulta el apartado 3 del enunciado para el contrato exacto de salida. Conserva
las salidas de las pruebas y registra también los códigos de salida de los casos
inválidos. Se deben completar 24 ejecuciones válidas y 14 inválidas.

## Entrega

Un ZIP con src/, README, pruebas/ y memoria.pdf. Identifica a los integrantes y
explica la compilación. No incluyas out/, out_ejemplo/ ni carpetas del IDE.
