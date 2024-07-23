# Testing Asynchronous Code in Jest

## Introduction

Asynchronous code can be tricky to test due to its non-blocking nature. Jest provides several methods to handle asynchronous tests, ensuring that your tests properly wait for asynchronous operations to complete.

## Testing Promises

### Using `.resolves` and `.rejects`

Jest allows you to test promises using `.resolves` and `.rejects`.

```javascript
function fetchData() {
  return Promise.resolve('peanut butter')
}

test('the data is peanut butter', () => {
  return expect(fetchData()).resolves.toBe('peanut butter')
})

function fetchWithError() {
  return Promise.reject('error')
}

test('the fetch fails with an error', () => {
  return expect(fetchWithError()).rejects.toMatch('error')
})
```

## Using `async`/`await`

Jest also supports `async`/`await` for more readable asynchronous tests.

```javascript
test('the data is peanut butter', async () => {
  const data = await fetchData()
  expect(data).toBe('peanut butter')
})

test('the fetch fails with an error', async () => {
  try {
    await fetchWithError()
  } catch (e) {
    expect(e).toMatch('error')
  }
})
```

## Testing Callbacks

For functions that use callbacks, Jest's `done` parameter can be used to signal the end of the test.

```javascript
function fetchData(callback) {
  setTimeout(() => {
    callback('peanut butter')
  }, 1000)
}

test('the data is peanut butter', done => {
  function callback(data) {
    expect(data).toBe('peanut butter')
    done()
  }

  fetchData(callback)
})
```

## Conclusion

Testing asynchronous code in Jest can be done using promises, `async`/`await`, and callbacks. Understanding these methods ensures that your asynchronous operations are tested correctly.
