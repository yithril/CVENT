# Setup and Teardown in Jest

## Introduction

Setup and teardown functions are used in testing to prepare the environment before running tests and clean up afterward. Jest provides several built-in functions for this purpose.

## Setup Functions

### `beforeEach`

`beforeEach` runs before each test in a test suite. It is useful for setting up common conditions.

```javascript
beforeEach(() => {
  // Code to set up test conditions
})
```

### `beforeAll`

`beforeAll` runs once before all the tests in a test suite. It is useful for one-time setup.

```javascript
beforeAll(() => {
  // Code to set up initial conditions
})
```

## Teardown Functions

### `afterEach`

`afterEach` runs after each test in a test suite. It is useful for cleaning up after tests.

```javascript
afterEach(() => {
  // Code to clean up after tests
})
```

### `afterAll`

`afterAll` runs once after all the tests in a test suite. It is useful for one-time cleanup.

```javascript
afterAll(() => {
  // Code to clean up after all tests
})
```

## Example Usage

```javascript
let database

beforeAll(() => {
  // Initialize database connection
  database = initializeDatabase()
})

afterAll(() => {
  // Close database connection
  database.close()
})

beforeEach(() => {
  // Seed database with test data
  database.seedTestData()
})

afterEach(() => {
  // Clean up test data
  database.cleanTestData()
})

test('database test', () => {
  // Perform test using database
  expect(database.query('SELECT * FROM test')).toBeDefined()
})
```

## Conclusion

Using setup and teardown functions in Jest helps ensure that tests run in a consistent and isolated environment. This improves the reliability and maintainability of your tests.
