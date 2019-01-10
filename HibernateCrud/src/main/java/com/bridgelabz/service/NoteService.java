package com.bridgelabz.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.model.User;
import com.bridgelabz.model.Note;

public interface NoteService {

	long save(Note publish);
	   Note get(long id);
	   List<Note> list();
	   void update(long id, Note publish);
	   void delete(long id);
}