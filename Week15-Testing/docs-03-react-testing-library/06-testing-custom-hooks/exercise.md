# Exercise: Testing Custom Hooks with React Testing Library

## Objective

Practice testing custom hooks in React using the `renderHook` utility.

## Task

1. Create a custom hook and write tests for it using React Testing Library.

## Instructions

1. Create a new custom hook file named `useToggle.js` that manages a boolean state.
2. Create a test file named `useToggle.test.js` and write tests for the `useToggle` hook:
    - Test the initial state of the hook.
    - Test the toggle functionality of the hook.

## Example Implementation (useToggle.js)

```javascript
import { useState } from 'react'

function useToggle(initialValue = false) {
  const [value, setValue] = useState(initialValue)

  const toggle = () => setValue(!value)

  return [value, toggle]
}

export default useToggle
```

## Hints for Tests (useToggle.test.js)

1. Import the necessary functions from `@testing-library/react-hooks`.
2. Use `renderHook` to render the `useToggle` hook.
3. Check the initial state of the hook.
4. Use `act` to invoke the toggle function.
5. Verify the state changes after toggling.

Run your tests using `npm test`.

Ensure that all tests pass and that you understand how to test custom hooks using React Testing Library.
