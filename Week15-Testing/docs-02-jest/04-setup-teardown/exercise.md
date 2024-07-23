# Exercise: Setup and Teardown in Jest

## Objective

Practice using setup and teardown functions in Jest to manage test environments.

## Task

1. Write tests for a simple function that requires setup and teardown.
2. Use `beforeAll`, `beforeEach`, `afterEach`, and `afterAll` to manage the test environment.

## Instructions

1. Create a new file named `arrayUtils.js` and implement the following functions:
    - `addToArray(arr, value)`: Adds a value to an array.
    - `removeFromArray(arr, value)`: Removes a value from an array.

2. Create a test file named `arrayUtils.test.js` and write tests for these functions. Use setup and teardown functions to manage the array state:
    - Use `beforeAll` to initialize an empty array.
    - Use `beforeEach` to reset the array before each test.
    - Use `afterEach` to log the array state after each test (for learning purposes).
    - Use `afterAll` to clear the array.

3. Run your tests using `npm test`.

## Example Implementation (arrayUtils.js)

```javascript
function addToArray(arr, value) {
  arr.push(value)
}

function removeFromArray(arr, value) {
  const index = arr.indexOf(value)
  if (index > -1) {
    arr.splice(index, 1)
  }
}

module.exports = { addToArray, removeFromArray }
```

Ensure that all tests pass and that you understand how to use setup and teardown functions in Jest.
