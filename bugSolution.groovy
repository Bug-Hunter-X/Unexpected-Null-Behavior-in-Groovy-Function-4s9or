```groovy
def calculate(a, b) {
  def aVal = a ?: 0 // Use elvis operator for null handling
  def bVal = b ?: 0 // Use elvis operator for null handling
  return aVal + bVal
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 3
println calculate(5, null) // Output: 5
println calculate(null, null) // Output: 0
```