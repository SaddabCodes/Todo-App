package com.sadcode.todoapp.service;

import com.sadcode.todoapp.dto.TodoDto;

import java.util.List;

public interface TodoService {
    TodoDto addTodo(TodoDto todoDto);
    TodoDto getTodo(Long id);
    List<TodoDto> getAllTodo();
    TodoDto updateTodoDto(TodoDto todoDto,Long id);
    void deleteTodoDto(Long id);
    TodoDto completedTodo(Long id);
    TodoDto inCompleteTodo(Long id);
}
