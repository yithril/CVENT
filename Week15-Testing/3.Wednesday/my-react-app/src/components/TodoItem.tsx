import React from 'react';

interface TodoItemProps {
  id: number;
  text: string;
  completed: boolean;
  toggleComplete: (id: number) => void;
  removeTodo: (id: number) => void;
}

const TodoItem: React.FC<TodoItemProps> = ({ id, text, completed, toggleComplete, removeTodo }) => {
  return (
    <li>
      <input 
        type="checkbox" 
        checked={completed} 
        onChange={() => toggleComplete(id)} 
      />
      <span style={{ textDecoration: completed ? 'line-through' : 'none' }}>
        {text}
      </span>
      <button onClick={() => removeTodo(id)}>Delete</button>
    </li>
  );
};

export default TodoItem;