package ru.levelup.devops_app.service;

import org.springframework.stereotype.Service;
import ru.levelup.devops_app.model.Book;
import ru.levelup.devops_app.model.Person;

import java.util.List;

@Service
public class BookService {

    public List<Book> findAll() {
        return null;
    }

    public Book findById(Long id) {
        return null;
    }

    public void save(Book item) {

    }

    public void update(Long id, Book item) {
    }

    public void delete(Long id) {
    }

    public Book findByItemName(String name) {
        return null;
    }

    public Book findByOwner(Person owner) {
        return null;
    }

}
