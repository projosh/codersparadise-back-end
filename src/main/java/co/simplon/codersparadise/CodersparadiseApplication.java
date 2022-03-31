package co.simplon.codersparadise;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodersparadiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodersparadiseApplication.class, args);
	}
	
	@GetMapping("/testing")
	public String testing() {
		return "testing...";
	}

	@GetMapping("/books")
	public ArrayList<Book> books() {
		ArrayList<Book> books = new ArrayList<>();
		Book book1 = new Book("Java book","I am an author",12.99);
		Book book2 = new Book("Another Java book","I am an another author",129.99);
		books.add(book1);
		books.add(book2);
		return books;
	}

}
