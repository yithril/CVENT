# Exercise: Testing Asynchronous Code in Jest

## Objective

Practice testing asynchronous functions in Jest using different methods.

## Task

1. Implement asynchronous functions and write tests for them using promises and `async`/`await`.

## Instructions

1. Create a new file named `asyncFunctions.js` and implement the following functions:
    - `fetchData()`: Returns a promise that resolves with the string "peanut butter" after 1 second.
    - `fetchWithError()`: Returns a promise that rejects with the string "error" after 1 second.

2. Create a test file named `asyncFunctions.test.js` and write tests for these functions:
    - Test `fetchData` using `.resolves`.
    - Test `fetchWithError` using `.rejects`.
    - Test `fetchData` using `async`/`await`.
    - Test `fetchWithError` using `async`/`await`.

3. Run your tests using `npm test`.

## Example Implementation (asyncFunctions.js)

```javascript
function fetchData() {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve('peanut butter')
    }, 1000)
  })
}

function fetchWithError() {
  return new Promise((_, reject) => {
    setTimeout(() => {
      reject('error')
    }, 1000)
  })
}

module.exports = { fetchData, fetchWithError }
```

Ensure that all tests pass and that you understand how to test asynchronous code in Jest.
