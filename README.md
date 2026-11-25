# androidrepo

A collection of Kotlin learning examples, ranging from first programs and language fundamentals to object-oriented patterns, collections, and coroutines. The repository is organized as standalone `.kt` examples rather than a single configured Android application.

## Repository contents

- **`KotlinHelloWorld/`** — introductory examples for `main` functions, printing, functions, maps, lists, and basic control flow. `Main.kt` combines several of these topics.
- **`KotlinBasics/`** — focused examples covering Kotlin fundamentals and more advanced language features, including variables, classes and constructors, collections, generics, sealed classes, function overloading, and coroutines. Several topics also have corresponding `*Test.kt` files.

Browse the source files in each directory; each example is intended to illustrate a particular concept.

## Requirements

- Kotlin compiler (`kotlinc`) and a Java runtime.
- For coroutine examples, the `kotlinx-coroutines-core` library is also required.

## Compile and run an example

From the repository root, compile a standalone example and run the resulting JAR:

```bash
kotlinc KotlinHelloWorld/Main.kt -include-runtime -d hello.jar
java -jar hello.jar
```

You can use the same pattern with other standalone files, for example:

```bash
kotlinc KotlinBasics/ListWithMethods.kt -include-runtime -d lists.jar
java -jar lists.jar
```

Coroutine examples import `kotlinx.coroutines`; compile them with the coroutines library on the classpath. The repository does not currently provide a root Gradle build, so dependency setup and running the test examples may require configuring a Kotlin project or IDE.

## Learning path

1. Start with `KotlinHelloWorld/Main.kt` and the numbered samples in `KotlinHelloWorld/`.
2. Explore basic values, functions, classes, and collections in `KotlinBasics/`.
3. Continue to examples involving sealed classes, variance, reified types, and coroutines.
4. Check for a related `*Test.kt` file when one is present.

## Language

The repository is written in Kotlin.
