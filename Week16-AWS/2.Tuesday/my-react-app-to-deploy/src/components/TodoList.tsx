import React, { useState, useEffect } from 'react';
import TodoItem from './TodoItem';
import { addTodo, getTodos, removeTodo, toggleComplete } from '../services/TodoService';
import TodoForm from './TodoForm';
import { thirdPartyApiInstance } from '../helpers/apiInstance';


const TodoList: React.FC = () => {
  const [todos, setTodos] = useState(getTodos());

  useEffect(() => {
    setTodos(getTodos());

  }, []);

  const handleAddTodo = (text: string) => {
    const newTodo = addTodo(text);
    setTodos([...todos, newTodo]);
  };

  const handleToggleComplete = (id: number) => {
    toggleComplete(id);
    setTodos(getTodos());
  };

  const handleRemoveTodo = (id: number) => {
    removeTodo(id);
    setTodos(getTodos());
  };

  return (
<div>
      <TodoForm addTodo={handleAddTodo} />
      {todos.length === 0 ? (
        <p>No to-dos left!</p>
      ) : (
        <ul>
          {todos.map(todo => (
            <TodoItem 
              key={todo.id} 
              id={todo.id} 
              text={todo.text} 
              completed={todo.completed} 
              toggleComplete={handleToggleComplete} 
              removeTodo={handleRemoveTodo} 
            />
          ))}
        </ul>
      )}
    </div>
  );
};

export default TodoList;