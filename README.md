# Java Stream API Exercises

Este proyecto contiene ejercicios prácticos organizados por niveles de dificultad para dominar la API de Streams de Java.

## Requisitos

- Java 25 (con preview features habilitadas)
- Maven 3.6+

## Estructura del Proyecto

```
stream25/
├── src/
│   ├── main/java/exercises/
│   │   ├── easy/          # 19 ejercicios básicos
│   │   ├── medium/        # 8 ejercicios intermedios
│   │   └── hard/          # 8 ejercicios avanzados
│   └── test/java/exercises/
│       ├── easy/          # Tests para ejercicios básicos
│       ├── medium/        # Tests para ejercicios intermedios
│       └── hard/          # Tests para ejercicios avanzados
└── pom.xml
```

## Niveles de Dificultad

### 🟢 Easy (19 ejercicios)
Ejercicios básicos que practican operaciones individuales de streams:
- FilterEvenNumbers, CountGreaterThan, ToUpperCase, SumNumbers
- FindMax, FindMin, RemoveDuplicates, SortNumbers
- FirstNElements, SkipElements, SquareNumbers, AllPositive
- AnyNegative, NoneZero, FindFirstEven, AverageOfNumbers
- FlattenLists, ProductOfNumbers, GroupByLength, PartitionByParity

### 🟡 Medium (8 ejercicios)
Ejercicios que combinan múltiples operaciones de streams:
- **CountFrequency** - Contar frecuencia de elementos (groupingBy + counting)
- **TopNLargest** - Top N elementos más grandes (sorted + limit)
- **FilterAndTransform** - Filtrar por rango y transformar (filter + map)
- **UniqueWords** - Palabras únicas de oraciones (flatMap + distinct + sorted)
- **SumByParity** - Sumar por paridad (partitioningBy + summingInt)
- **LongestString** - String más largo (max con comparador personalizado)
- **DistinctAndSortDesc** - Únicos ordenados descendente (distinct + sorted)
- **FibonacciSequence** - Generar Fibonacci (Stream.iterate)

### 🔴 Hard (8 ejercicios)
Ejercicios complejos que requieren pensamiento avanzado y combinaciones sofisticadas:
- **MostFrequentElement** - Elemento más frecuente (groupingBy + counting + max)
- **GroupByDigitSum** - Agrupar por suma de dígitos (groupingBy con lógica personalizada)
- **FindAnagrams** - Encontrar grupos de anagramas (groupingBy + filter)
- **RunningSum** - Suma acumulativa (operaciones con estado)
- **FindPairsWithSum** - Pares que suman objetivo (flatMap + filter complejo)
- **GroupStatistics** - Estadísticas por grupo (partitioningBy + collectors múltiples)
- **MergeSortedLists** - Fusionar listas ordenadas (flatMap + sorted)
- **TransposeMatrix** - Transponer matriz (IntStream + transformaciones complejas)


## Gestión de Soluciones

Este proyecto incluye un sistema para ocultar/mostrar las soluciones, ideal para practicar:

### Usando scripts (Recomendado)

Más fácil y rápido, sin comandos largos:

```bash
# Windows CMD
manage.bat hide
manage.bat show

# PowerShell
./manage.ps1 hide
./manage.ps1 show
```

### Usando Maven directamente

Si prefieres usar Maven:

```bash
# 🎯 Modo práctica
mvn compile exec:java "-Dexec.args=hide"

# 📚 Mostrar soluciones
mvn compile exec:java "-Dexec.args=show"
```

> **Nota**: Al ocultar las soluciones, se genera un archivo `.solutions.dat` con las soluciones codificadas (no legibles). Este archivo es necesario para restaurar las soluciones.

---

## Ejecutar Tests

```bash
# Todos los tests
mvn test

# Solo tests de nivel easy
mvn test -Dtest="exercises.easy.*"

# Solo tests de nivel medium
mvn test -Dtest="exercises.medium.*"

# Solo tests de nivel hard
mvn test -Dtest="exercises.hard.*"

# Un test específico
mvn test -Dtest=CountFrequencyTest
```

## Compilar el Proyecto

```bash
mvn clean compile
```

## Operaciones de Stream Practicadas

### Operaciones Intermedias
- `filter()` - Filtrado de elementos
- `map()` - Transformación de elementos
- `flatMap()` - Aplanamiento de streams
- `distinct()` - Eliminación de duplicados
- `sorted()` - Ordenamiento
- `limit()` - Limitación de elementos
- `skip()` - Saltar elementos

### Operaciones Terminales
- `collect()` - Recolección de resultados
- `count()` - Conteo de elementos
- `forEach()` - Iteración
- `reduce()` - Reducción
- `min()` / `max()` - Valores extremos
- `findFirst()` / `findAny()` - Búsqueda
- `allMatch()` / `anyMatch()` / `noneMatch()` - Verificación

### Collectors Avanzados
- `toList()` - Convertir a lista
- `groupingBy()` - Agrupar elementos
- `partitioningBy()` - Particionar en dos grupos
- `counting()` - Contar elementos
- `summingInt()` - Sumar valores

## Roadmap de Aprendizaje

1. **Nivel Easy**: Domina las operaciones básicas individuales
2. **Nivel Medium**: Aprende a combinar operaciones
3. **Nivel Hard**: Resuelve problemas complejos con múltiples transformaciones
4. **Nivel Expert**: (Próximamente) Optimización, parallel streams y casos avanzados
