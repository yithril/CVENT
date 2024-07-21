# Exercise: Using Matchers in Jest

## Objective

Practice using various Jest matchers to write meaningful tests.

## Task

1. Implement several functions and write tests for them using different Jest matchers.

## Instructions

1. Create a new file named `functions.js` and implement the following functions:
    - `add(a, b)`: Returns the sum of two numbers.
    - `subtract(a, b)`: Returns the difference between two numbers.
    - `isNull()`: Returns null.
    - `checkValue(x)`: Returns the given value.
    - `createUser()`: Returns an object with `firstName` and `lastName` properties.

2. Create a test file named `functions.test.js` and write tests for each function using appropriate matchers:
    - Test that `add(1, 2)` equals `3` using `toBe`.
    - Test that `subtract(2, 1)` equals `1` using `toBe`.
    - Test that `isNull()` returns `null` using `toBeNull`.
    - Test that `checkValue(0)` returns a falsy value using `toBeFalsy`.
    - Test that `checkValue(1)` returns a truthy value using `toBeTruthy`.
    - Test that `createUser()` returns an object with `firstName` and `lastName` properties equal to `John` and `Doe` respectively using `toEqual`.

3. Run your tests using `npm test`.

## Example Implementation (functions.js)

```javascript
function add(a, b) {
  return a + b
}

function subtract(a, b) {
  return a - b
}

function isNull() {
  return null
}

function checkValue(x) {
  return x
}

function createUser() {
  return {
    firstName: 'John',
    lastName: 'Doe'
  }
}

module.exports = { add, subtract, isNull, checkValue, createUser }
```

Ensure that all tests pass and that you understand how to use various Jest matchers.
