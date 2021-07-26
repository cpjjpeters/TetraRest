package com.example.tetra.TetraRestDemo.service;
import java.util.List;

import com.example.tetra.TetraRestDemo.model.Todo;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
