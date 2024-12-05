```groovy
def myMethod(String str) {
  if (str == null || str.isEmpty()) {
    return ""
  }
  return str.toUpperCase()
}

println myMethod(null) // Prints 
println myMethod("")  // Prints 
println myMethod("hello") // Prints HELLO
```