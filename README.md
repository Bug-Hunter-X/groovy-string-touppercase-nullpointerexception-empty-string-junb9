# Groovy String.toUpperCase() NullPointerException on Empty String

This example demonstrates an unexpected behavior in Groovy when using the `toUpperCase()` method on an empty string.  While `null` is handled correctly, an empty string causes a `NullPointerException`. This differs from Java's behavior.

The `bug.groovy` file shows the problem.  `bugSolution.groovy` offers a solution using a safe null check and handling for empty strings.
