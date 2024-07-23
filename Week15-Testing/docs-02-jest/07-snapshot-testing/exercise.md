# Exercise: Snapshot Testing in Jest

## Objective

Practice creating and updating snapshots in Jest with JavaScript objects.

## Task

1. Create a JavaScript object and write snapshot tests for it.

## Instructions

1. Create a new file named `data.js` and implement a simple function that returns a user object.
2. Create a test file named `data.test.js` and write snapshot tests for the user object.
3. Run your tests using `npm test`.

## Example Implementation (data.js)

```javascript
function getUser() {
  return {
    name: 'John Doe',
    age: 30,
    address: {
      street: '123 Main St',
      city: 'Anytown',
      country: 'USA',
    },
  }
}

module.exports = getUser
```

## Example Tests (data.test.js)

```javascript
const getUser = require('./data')

test('user snapshot', () => {
  const user = getUser()
  expect(user).toMatchSnapshot()
})
```

Ensure that all tests pass and that you understand how to create and update snapshots in Jest.
