package com.bridgelabz.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bridgelabz.persistence.Note;
import com.bridgelabz.service.NoteService;

public class NoteController {

	@Autowired
	private NoteService noteService;

	 
	 
	   
	   @PostMapping("/save")
	   public ResponseEntity<?> save(@RequestBody Note note) {
		   System.out.println(note);
	      long id = noteService.save(note);
	     
	      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
	   }

	  
	   @GetMapping("/Publication/{id}")
	   public ResponseEntity<Note> get(@PathVariable("id") long id) {
	      Note note = noteService.get(id);
	      return ResponseEntity.ok().body(note);
	   }

	  
	   @GetMapping("/Publication")
	   public ResponseEntity<List<Note>> list() {
	      List<Note> notes = noteService.list();
	      return ResponseEntity.ok().body(notes);
	   }

	  
	   @PutMapping("/Publication/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Note publish) {
	      noteService.update(id, publish);
	      return ResponseEntity.ok().body("Book has been updated successfully.");
	   }

	  
	   @DeleteMapping("/Publication/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
	      noteService.delete(id);
	      return ResponseEntity.ok().body("Book has been deleted successfully.");
	   }
}
