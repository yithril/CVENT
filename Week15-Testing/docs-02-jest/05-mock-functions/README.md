# Mock Functions in Jest

## Introduction

Mock functions are used to simulate the behavior of real functions in a controlled way. They are useful for isolating the code under test and avoiding side effects.

## Creating Mock Functions

Jest provides a built-in function `jest.fn()` to create mock functions.

```javascript
const mockFunction = jest.fn()
```

## Using Mock Functions

Mock functions can be used to test how a function interacts with other functions or modules.

### Basic Example

```javascript
function forEach(items, callback) {
  for (let index = 0; index < items.length; index++) {
    callback(items[index])
  }
}

test('mock function example', () => {
  const mockCallback = jest.fn()
  forEach([0, 1], mockCallback)
  
  // The mock function is called twice
  expect(mockCallback.mock.calls.length).toBe(2)

  // The first argument of the first call to the function was 0
  expect(mockCallback.mock.calls[0][0]).toBe(0)

  // The first argument of the second call to the function was 1
  expect(mockCallback.mock.calls[1][0]).toBe(1)
})
```

## Mock Return Values

Mock functions can be configured to return specific values using `mockReturnValue` and `mockReturnValueOnce`.

```javascript
const myMock = jest.fn()
myMock.mockReturnValue(42)

test('mock return value example', () => {
  expect(myMock()).toBe(42)
})
```

## Mock Implementations

You can provide custom implementations for mock functions using `mockImplementation`.

```javascript
const myMock = jest.fn().mockImplementation(scalar => scalar * 2)

test('mock implementation example', () => {
  expect(myMock(2)).toBe(4)
})
```

## Mocking Modules

Jest allows you to mock entire modules using `jest.mock`.

```javascript
jest.mock('./moduleToMock')
const moduleToMock = require('./moduleToMock')
moduleToMock.functionToMock.mockReturnValue('mocked value')

test('mock module example', () => {
  expect(moduleToMock.functionToMock()).toBe('mocked value')
})
```

## Conclusion

Mock functions in Jest are powerful tools for isolating and testing code. They provide control over function behavior and allow you to test interactions between components.
