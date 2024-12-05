```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  }
  return str.toUpperCase()
}

println myMethod(null) // Prints Null String
println myMethod("")  // Throws NullPointerException
```