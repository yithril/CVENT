# Exercise: Handling Asynchronous Operations in React Testing Library

## Objective

Practice testing asynchronous operations in React components using React Testing Library.

## Task

1. Create a React component that fetches data and write tests for it using asynchronous utilities from React Testing Library.

## Instructions

1. Create a new React component file named `DataFetcher.js` that fetches data from an API and displays it.
2. Create a test file named `DataFetcher.test.js` and write tests for the `DataFetcher` component:
    - Test that a loading indicator is displayed initially.
    - Test that the data is displayed once the fetch is complete.
    - Test that the loading indicator is removed after the data is loaded.

## Example Implementation (DataFetcher.js)

```javascript
import React, { useEffect, useState } from 'react'

function DataFetcher() {
  const [data, setData] = useState(null)
  const [loading, setLoading] = useState(true)

  useEffect(() => {
    setTimeout(() => {
      setData('Fetched Data')
      setLoading(false)
    }, 1000)
  }, [])

  if (loading) {
    return <div>Loading...</div>
  }

  return <div>{data}</div>
}

export default DataFetcher
```

## Hints for Tests (DataFetcher.test.js)

1. Import the necessary functions from React Testing Library and Jest DOM.
2. Render the `DataFetcher` component.
3. Use `screen.getByText` to check for the loading indicator.
4. Use `waitFor` or `findBy` to wait for the data to be displayed.
5. Use `waitForElementToBeRemoved` to verify that the loading indicator disappears.

Run your tests using `npm test`.

Ensure that all tests pass and that you understand how to test asynchronous operations using React Testing Library.
