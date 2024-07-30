import { Todo } from '../../models/Todo';
import * as TodoService from '../../services/TodoService';
import {  render, screen } from '@testing-library/react';
import TodoList from '../TodoList';

jest.mock('../../services/TodoService');

test('renders correct number of todo items', () => {
    const todos:Todo[] = [
      { id: 1, text: 'Learn testing', completed: false },
      { id: 2, text: 'Learn moar testing', completed: true }    
    ];

    (TodoService.getTodos as jest.Mock).mockReturnValue(todos);
    render(<TodoList />)

    expect(screen.getAllByRole('listitem')).toHaveLength(2);
});