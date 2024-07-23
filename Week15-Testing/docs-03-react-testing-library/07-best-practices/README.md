# Best Practices for React Testing Library

## Introduction

Adopting best practices when using React Testing Library ensures your tests are reliable, maintainable, and provide valuable feedback. Here are some recommended practices to follow.

## Focus on User Interactions

Write tests that focus on how users interact with your components rather than the implementation details.

### Example

```javascript
// Avoid testing implementation details
test('increments counter', () => {
  const { getByText } = render(<Counter />)
  fireEvent.click(getByText('Increment'))
  expect(getByText('Count: 1')).toBeInTheDocument()
})
```

## Use Descriptive Queries

Prefer using queries like `getByRole`, `getByLabelText`, and `getByPlaceholderText` over `getByTestId` to make your tests more descriptive and accessible.

### Example

```javascript
// Prefer getByRole over getByTestId
const { getByRole } = render(<button data-testid="submit-button">Submit</button>)
expect(getByRole('button')).toBeInTheDocument()
```

## Leverage `screen`

Using `screen` helps reduce the need to destructure queries from `render` and makes your tests easier to read.

### Example

```javascript
// Using screen
render(<Counter />)
fireEvent.click(screen.getByText('Increment'))
expect(screen.getByText('Count: 1')).toBeInTheDocument()
```

## Mock External Dependencies

Mock external services and dependencies to isolate the component under test.

### Example

```javascript
jest.mock('axios')
axios.get.mockResolvedValue({ data: { name: 'John Doe' } })
```

## Clean Up After Each Test

React Testing Library automatically cleans up after each test, but it’s good to know that you can manually clean up if needed.

### Example

```javascript
import { cleanup } from '@testing-library/react'

afterEach(cleanup)
```

## Avoid Overuse of `act`

`act` is typically not needed when using React Testing Library since it wraps most interactions, but use it when you need to manually trigger updates.

### Example

```javascript
import { act } from 'react-dom/test-utils'

act(() => {
  // Trigger state updates
})
```

## Conclusion

Following these best practices will help you write more effective and maintainable tests with React Testing Library. Focus on user interactions, use descriptive queries, and mock external dependencies to ensure your tests are robust.
