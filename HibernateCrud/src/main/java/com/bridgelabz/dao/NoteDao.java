package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.User;
import com.bridgelabz.model.Note;

public interface NoteDao {
	 long save(Note publish);

	  Note get(long id);

	   List<Note> list();

	   void update(long id, Note publish);

	   void delete(long id);

	

	}


