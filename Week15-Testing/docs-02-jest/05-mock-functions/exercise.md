# Exercise: Mock Functions in Jest

## Objective

Practice using mock functions in Jest to test interactions between functions.

## Task

1. Create functions that interact with each other and write tests using mock functions to isolate and test their behavior.

## Instructions

1. Create a new file named `calculator.js` and implement the following functions:
    - `add(a, b)`: Returns the sum of two numbers.
    - `subtract(a, b)`: Returns the difference between two numbers.
    - `calculate(operation, a, b)`: Takes an operation function and two numbers, then returns the result of the operation.

2. Create a test file named `calculator.test.js` and write tests for these functions. Use mock functions to test the interactions:
    - Mock the `add` and `subtract` functions when testing the `calculate` function.

3. Run your tests using `npm test`.

## Example Implementation (calculator.js)

```javascript
function add(a, b) {
  return a + b
}

function subtract(a, b) {
  return a - b
}

function calculate(operation, a, b) {
  return operation(a, b)
}

module.exports = { add, subtract, calculate }
```

Ensure that all tests pass and that you understand how to use mock functions in Jest.
