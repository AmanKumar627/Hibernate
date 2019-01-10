package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.persistence.Note;

public interface NoteDao {
	long save(Note note);

	Note get(long id);

	List<Note> list();

	void update(long id, Note note);

	void delete(long id);

}
