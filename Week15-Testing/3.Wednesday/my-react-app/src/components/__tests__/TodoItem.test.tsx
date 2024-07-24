import TodoItem from '../TodoItem';
import { fireEvent, render, screen } from '@testing-library/react';

test('render the text passed via props', () => {
    render(<TodoItem id={1} text='Learn testing' completed={false}
        toggleComplete={() => {}} removeTodo={() => {}} />
    );

    expect(screen.getByText(/Learn testing/i)).toBeInTheDocument();
});

test('checkbox is checked based on completed', () => {
    const { rerender } = render(<TodoItem id={1} text='Learn testing' completed={false}
        toggleComplete={() => {}} removeTodo={() => {}} /> );

    expect(screen.getByRole('checkbox')).not.toBeChecked();

    rerender(<TodoItem id={1} text='Learn testing' completed={true}
        toggleComplete={() => {}} removeTodo={() => {}} />);

    expect(screen.getByRole('checkbox')).toBeChecked();
});

test('clicking the checkbox calls toggleComplete', () => {
    const toggleCompleteMock = jest.fn();

    render(<TodoItem id={1} text='Learn testing' completed={true}
        toggleComplete={toggleCompleteMock} removeTodo={() => {}} />);

    fireEvent.click(screen.getByRole('checkbox'));

    expect(toggleCompleteMock).toHaveBeenCalledWith(1);
});