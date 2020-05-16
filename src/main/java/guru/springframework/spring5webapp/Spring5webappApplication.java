package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Spring5webappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hi Dustin!");
		// looks like John has not connected things to a database just yet.
		// you can see that with CommandLineRunner, the run method executes after
		// the Spring Boot application has started.
		Book book = new Book();
		book.setTitle("Eloquent JavaScript 3rd Edition");
		Author marijn = new Author();
		marijn.setLastName("Haverbeke");
		marijn.setFirstName("Marijn");
		Set<Book> books = new HashSet<>();
		books.add(book);
		marijn.setBooks(books);
		Set<Author> authors = new HashSet<>();
		authors.add(marijn);
		book.setAuthors(authors);
		for (Book b: books) {
			System.out.println(b);
		}
	}
}
