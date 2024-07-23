# Testing Custom Hooks with React Testing Library

## Introduction

Custom hooks are an essential part of modern React applications, encapsulating reusable logic. Testing these hooks ensures that they work as expected in various scenarios. React Testing Library provides utilities to help test custom hooks.

## Example Custom Hook

Let's create a simple custom hook that manages a counter:

```javascript
// useCounter.js
import { useState } from 'react'

function useCounter() {
  const [count, setCount] = useState(0)

  const increment = () => setCount(count + 1)
  const decrement = () => setCount(count - 1)

  return { count, increment, decrement }
}

export default useCounter
```

## Testing the Custom Hook

To test the hook, you can use the `renderHook` utility from `@testing-library/react-hooks`.

### Example Test

```javascript
// useCounter.test.js
import { renderHook, act } from '@testing-library/react-hooks'
import useCounter from './useCounter'

test('should use counter', () => {
  const { result } = renderHook(() => useCounter())

  expect(result.current.count).toBe(0)

  act(() => {
    result.current.increment()
  })

  expect(result.current.count).toBe(1)

  act(() => {
    result.current.decrement()
  })

  expect(result.current.count).toBe(0)
})
```

## Conclusion

Testing custom hooks ensures that the logic encapsulated in the hooks works correctly. React Testing Library's `renderHook` utility makes it straightforward to test hooks in isolation.
