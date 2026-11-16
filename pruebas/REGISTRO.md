# Registro de pruebas de P3

Integrantes:

Versión de Java (`java -version`):

Fecha:

## Ejecuciones válidas

En cada repetición indica el archivo de salida, código de salida y resultado de
la comprobación. Conserva las salidas, aunque varias ejecuciones sean iguales.

| Caso | N P W C | Repetición 1 | Repetición 2 | Repetición 3 | Observaciones |
|---|---|---|---|---|---|
| V1 | 1 1 1 1 | | | | |
| V2 | 7 2 3 1 | | | | |
| V3 | 20 1 4 2 | | | | |
| V4 | 20 4 1 2 | | | | |
| V5 | 101 3 4 5 | | | | |
| V6 | 3 8 8 32 | | | | |
| V7 | 1000 8 8 1 | | | | |
| V8 | 1000 8 8 32 | | | | |

## Ejecuciones inválidas

| Caso | Argumentos | stdout vacío | stderr con error | Código de salida | Evidencia |
|---|---|---|---|---|---|
| I1 | (sin argumentos) | | | | |
| I2 | 3 2 2 | | | | |
| I3 | 3 2 2 1 9 | | | | |
| I4 | abc 2 2 1 | | | | |
| I5 | 3 2 2 1.5 | | | | |
| I6 | 999999999999999999999 2 2 1 | | | | |
| I7 | 0 2 2 1 | | | | |
| I8 | 1001 2 2 1 | | | | |
| I9 | 3 0 2 1 | | | | |
| I10 | 3 9 2 1 | | | | |
| I11 | 3 2 0 1 | | | | |
| I12 | 3 2 9 1 | | | | |
| I13 | 3 2 2 0 | | | | |
| I14 | 3 2 2 33 | | | | |

## Errores y conclusiones

- Errores encontrados y correcciones realizadas:
- Propiedades comprobadas con las salidas:
- Propiedades justificadas con el diseño y el código:
- Limitaciones de las pruebas:
