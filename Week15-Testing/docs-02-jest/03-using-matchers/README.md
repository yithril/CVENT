# Using Matchers in Jest

## Introduction

Matchers are functions in Jest that allow you to assert that values meet certain conditions. Jest provides a rich set of matchers to help you write meaningful tests.

## Basic Matchers

### `toBe`

`toBe` is used to test primitive values:

```javascript
test('two plus two is four', () => {
  expect(2 + 2).toBe(4)
})
```

### `toEqual`

`toEqual` is used to test the equality of objects or arrays:

```javascript
test('object assignment', () => {
  const data = {one: 1}
  data['two'] = 2
  expect(data).toEqual({one: 1, two: 2})
})
```

## Truthiness Matchers

### `toBeNull`

```javascript
test('null', () => {
  const n = null
  expect(n).toBeNull()
})
```

### `toBeUndefined`

```javascript
test('undefined', () => {
  let n
  expect(n).toBeUndefined()
})
```

### `toBeDefined`

```javascript
test('defined', () => {
  const n = 1
  expect(n).toBeDefined()
})
```

### `toBeTruthy` and `toBeFalsy`

```javascript
test('truthy and falsy', () => {
  const n = 1
  expect(n).toBeTruthy()
  expect(0).toBeFalsy()
})
```

## Number Matchers

### `toBeGreaterThan`, `toBeGreaterThanOrEqual`, `toBeLessThan`, `toBeLessThanOrEqual`

```javascript
test('numeric comparisons', () => {
  const value = 2 + 2
  expect(value).toBeGreaterThan(3)
  expect(value).toBeGreaterThanOrEqual(4)
  expect(value).toBeLessThan(5)
  expect(value).toBeLessThanOrEqual(4)
})
```

## String Matchers

### `toMatch`

```javascript
test('string matching', () => {
  expect('team').not.toMatch(/I/)
  expect('Christoph').toMatch(/stop/)
})
```

## Array and Iterable Matchers

### `toContain`

```javascript
test('array contains', () => {
  const shoppingList = ['diapers', 'kleenex', 'trash bags', 'paper towels', 'milk']
  expect(shoppingList).toContain('milk')
})
```

## Exception Matchers

### `toThrow`

```javascript
function compileAndroidCode() {
  throw new Error('you are using the wrong JDK')
}

test('compiling android goes as expected', () => {
  expect(compileAndroidCode).toThrow()
  expect(compileAndroidCode).toThrow('you are using the wrong JDK')
})
```

## Conclusion

Matchers in Jest provide powerful ways to assert that values meet specific conditions, helping you write comprehensive tests.
