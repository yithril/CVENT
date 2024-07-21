# Mocking API Calls in React Testing Library

## Introduction

Mocking API calls is essential for testing components that rely on data fetching without making actual network requests. React Testing Library works seamlessly with Jest's mocking capabilities to mock API calls.

## Using `jest.mock`

You can use `jest.mock` to mock modules that handle API calls.

### Example Component

```javascript
// FetchComponent.js
import React, { useState, useEffect } from 'react'
import axios from 'axios'

function FetchComponent() {
  const [data, setData] = useState(null)

  useEffect(() => {
    async function fetchData() {
      const response = await axios.get('/api/data')
      setData(response.data)
    }

    fetchData()
  }, [])

  if (!data) return <div>Loading...</div>
  return <div>Data: {data}</div>
}

export default FetchComponent
```

### Example Test

```javascript
// FetchComponent.test.js
import React from 'react'
import { render, screen, waitFor } from '@testing-library/react'
import '@testing-library/jest-dom/extend-expect'
import axios from 'axios'
import FetchComponent from './FetchComponent'

jest.mock('axios')

test('fetches and displays data', async () => {
  axios.get.mockResolvedValue({ data: 'Hello, World!' })

  render(<FetchComponent />)
  
  await waitFor(() => expect(screen.getByText('Data: Hello, World!')).toBeInTheDocument())
})
```

## Conclusion

Mocking API calls in React Testing Library allows you to test components that rely on data fetching without making actual network requests. This approach ensures your tests are fast, reliable, and independent of external services.
