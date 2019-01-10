package com.bridgelabz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;

@RequestMapping
@RestController
public class UserController {

	@Autowired
	private UserService bookService;

	@RequestMapping(value = "/")
	public String wellcome() {
		return "aman";
	}

	@PostMapping("/book")
	public ResponseEntity<?> save(@RequestBody User book) {
		System.out.println(book);
		long id = bookService.save(book);

		return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
	}

	@GetMapping("/book/{id}")
	public ResponseEntity<User> get(@PathVariable("id") long id) {
		User book = bookService.get(id);
		return ResponseEntity.ok().body(book);
	}

	@GetMapping("/book")
	public ResponseEntity<List<User>> list() {
		List<User> books = bookService.list();
		return ResponseEntity.ok().body(books);
	}

	@PutMapping("/book/{id}")
	public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody User book) {
		bookService.update(id, book);
		return ResponseEntity.ok().body("Book has been updated successfully.");
	}

	/*---Delete a book by id---*/
	@DeleteMapping("/book/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		bookService.delete(id);
		return ResponseEntity.ok().body("Book has been deleted successfully.");
	}
}