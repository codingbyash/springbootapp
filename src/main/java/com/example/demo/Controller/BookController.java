package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // Serve the homepage with the list of books
    @GetMapping("/")
    public String homePage(Model model) {
        // Fetch all books from the database
        model.addAttribute("books", bookRepository.findAll());
        return "index";  // Return the Thymeleaf template (index.html)
    }

    // Handle the form submission for adding a new book
    @PostMapping("/api/books")
    public String addBook(@RequestParam String title, @RequestParam String author, @RequestParam double price) {
        // Create a new book object
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);

        // Save the book to the database
        bookRepository.save(book);

        // Redirect back to the homepage to refresh the list of books
        return "redirect:/";
    }
}
