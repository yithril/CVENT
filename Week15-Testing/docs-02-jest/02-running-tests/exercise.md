# Exercise: Setting Up and Running Tests with Jest

## Objective

Learn how to set up Jest in a project and write a simple test.

## Task

1. Set up a new JavaScript project with Jest.
2. Write a simple function and a corresponding test for it.
3. Run the test using Jest.

## Instructions

1. Create a new directory for your project and navigate into it.
2. Initialize the project with `npm init -y`.
3. Install Jest using `npm install --save-dev jest`.
4. Add a test script to your `package.json`:

```json
{
  "scripts": {
    "test": "jest"
  }
}
```

5. Create a file named `multiply.js` and implement a function that multiplies two numbers:

```javascript
function multiply(a, b) {
  return a * b
}
module.exports = multiply
```

6. Create a test file named `multiply.test.js` and write a test for the `multiply` function:

```javascript
const multiply = require('./multiply')

test('multiplies 2 * 3 to equal 6', () => {
  expect(multiply(2, 3)).toBe(6)
})
```

7. Run your tests using `npm test`.

Ensure that your tests pass and that you understand the process of setting up and running tests with Jest.
