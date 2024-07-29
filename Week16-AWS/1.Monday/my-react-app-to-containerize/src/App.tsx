import { useState } from 'react'
import './App.css'
import TodoList from './components/TodoList'
import './styles.css';

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <h1>Todo List</h1>
      <TodoList />
    </div>
  )
}

export default App
