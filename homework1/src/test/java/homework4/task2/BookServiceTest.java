package homework4.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void findBookById() {
//        Создаем мок BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

//        Создаем объект BookService, передавая мок BookRepository
        BookService bookService = new BookService(bookRepository);

//        Задаем ожидаемый результат
        String expectedBookId = "1";
        String expectedTitle = "Book 1 title";
        String expectedAuthor = "Author 1";
//        Устанавливаем ожидание вызова метода findById с bookId
//        и возвращаем ожидаемый объект Book
        when(bookRepository.findById(expectedBookId))
                .thenReturn(new Book(expectedBookId, expectedTitle, expectedAuthor));

//        Вызываем метод findBookById и проверяем, что результат
//        соответствует ожиданиям
        Book book = bookService.findBookById(expectedBookId);
        assertEquals(expectedTitle, book.getTitle());

//        Проверяем, что метод findById был вызван ровно 1 раз
//        с правильными аргументами
        verify(bookRepository, times(1)).findById(expectedBookId);
    }

    @Test
    void findAllBooks() {
//        Создаем мок BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

//        Создаем объект BookService, передавая мок BookRepository
        BookService bookService = new BookService(bookRepository);

//        Задаем ожидаемый результат
        List<Book> expectedBooks = new ArrayList<>();
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");

        expectedBooks.add(book1);
        expectedBooks.add(book2);

//        Устанавливаем ожидание вызова метода findAll
//        и возвращаем ожидаемый объект
        when(bookRepository.findAll())
                .thenReturn(expectedBooks);

//        Вызываем метод findAllBook и проверяем, что результат
//        соответствует ожиданиям
        List<Book> books = bookService.findAllBooks();
        assertEquals(expectedBooks.get(0), books.get(0));

//        Проверяем, что метод findAll был вызван ровно 1 раз
//        с правильными аргументами
        verify(bookRepository, times(1)).findAll();
    }
}