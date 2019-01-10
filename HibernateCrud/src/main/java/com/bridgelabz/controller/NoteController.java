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

import com.bridgelabz.model.Note;
import com.bridgelabz.service.NoteService;;

@RequestMapping
@RestController
public class NoteController {
	
	@Autowired
	private NoteService publicationService;

	 
	 
	   
	   @PostMapping("/save")
	   public ResponseEntity<?> save(@RequestBody Note publish) {
		   System.out.println(publish);
	      long id = publicationService.save(publish);
	     
	      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
	   }

	  
	   @GetMapping("/Publication/{id}")
	   public ResponseEntity<Note> get(@PathVariable("id") long id) {
	      Note publish = publicationService.get(id);
	      return ResponseEntity.ok().body(publish);
	   }

	  
	   @GetMapping("/Publication")
	   public ResponseEntity<List<Note>> list() {
	      List<Note> publishs = publicationService.list();
	      return ResponseEntity.ok().body(publishs);
	   }

	  
	   @PutMapping("/Publication/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Note publish) {
	      publicationService.update(id, publish);
	      return ResponseEntity.ok().body("Book has been updated successfully.");
	   }

	  
	   @DeleteMapping("/Publication/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	      publicationService.delete(id);
	      return ResponseEntity.ok().body("Book has been deleted successfully.");
	   }
}
