import { Todo } from "../models/Todo";

let todos: Todo[] = [];

export const getTodos = (): Todo[] => {
  return [...todos];
};

export const addTodo = (text: string): Todo => {
  const newTodo = { id: Date.now(), text, completed: false };
  todos.push(newTodo);
  return newTodo;
};

export const toggleComplete = (id: number): Todo | undefined => {
  const todo = todos.find(todo => todo.id === id);
  if (todo) {
    todo.completed = !todo.completed;
  }
  return todo;
};

export const removeTodo = (id: number): void => {
  todos = todos.filter(todo => todo.id !== id);
};