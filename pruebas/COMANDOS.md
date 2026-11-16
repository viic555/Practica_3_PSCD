# Comandos de las pruebas obligatorias

Compila primero tu implementación con Java 25, desde la carpeta que contiene src:

```text
javac -encoding UTF-8 -d out src/*.java
```

## Ejecuciones válidas

Ejecuta **cada comando tres veces**. Cada invocación inicia una JVM y estado nuevos.
El código debe ser cero, stderr debe quedar vacío y stdout debe cumplir el enunciado.

```text
java -cp out Practica3 1 1 1 1
java -cp out Practica3 7 2 3 1
java -cp out Practica3 20 1 4 2
java -cp out Practica3 20 4 1 2
java -cp out Practica3 101 3 4 5
java -cp out Practica3 3 8 8 32
java -cp out Practica3 1000 8 8 1
java -cp out Practica3 1000 8 8 32
```

Comprueba las N líneas de resultados y el resumen, no solo la suma.

## Ejecuciones inválidas

Ejecuta cada uno de estos 14 comandos una vez. Cada línea es una prueba completa;
la primera no tiene argumentos. Se espera stdout vacío, stderr no vacío y código
no cero. El texto concreto del error es libre.

```text
java -cp out Practica3
java -cp out Practica3 3 2 2
java -cp out Practica3 3 2 2 1 9
java -cp out Practica3 abc 2 2 1
java -cp out Practica3 3 2 2 1.5
java -cp out Practica3 999999999999999999999 2 2 1
java -cp out Practica3 0 2 2 1
java -cp out Practica3 1001 2 2 1
java -cp out Practica3 3 0 2 1
java -cp out Practica3 3 9 2 1
java -cp out Practica3 3 2 0 1
java -cp out Practica3 3 2 9 1
java -cp out Practica3 3 2 2 0
java -cp out Practica3 3 2 2 33
```

## Guardar y comprobar los tres resultados

Ejemplo en PowerShell (Windows):

```powershell
java -cp out Practica3 0 2 2 1 1> salida.txt 2> error.txt
$LASTEXITCODE
```

Ejemplo en Bash (Linux o macOS):

```bash
java -cp out Practica3 0 2 2 1 > salida.txt 2> error.txt
echo $?
```

Consulta el código inmediatamente después de java. Conserva los archivos con
nombres distintos para cada ejecución; no sobrescribas evidencias anteriores.
Si un caso no termina y lo detienes manualmente, registra ese hecho y corrige el
programa; no lo anotes como superado.
