package com.sh.jdbctemp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addBook(Book b) {
		String sql = "INSERT INTO BOOKS(ID,NAME,AUTHOR,SUBJECT,PRICE) VALUES(?,?,?,?,?)";
		Object params[] = new Object[] {
			b.getBookid(),
			b.getName(),
			b.getAuthor(),
			b.getSubject(),
			b.getPrice()
		};
		jdbcTemplate.update(sql, params);
	}

	@Override
	public Book getBook(int id) {
		String sql = "SELECT ID,NAME,AUTHOR,SUBJECT,PRICE FROM BOOKS WHERE ID=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BookRowMapper()); 
	}

	@Override
	public List<Book> getAllBooks() {
		String sql = "SELECT ID,NAME,AUTHOR,SUBJECT,PRICE FROM BOOKS";
		List<Book> list = new ArrayList<>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> map : rows) {
			Book b = new Book();
			b.setBookid((Integer)map.get("ID"));
			b.setName((String)map.get("NAME"));
			b.setAuthor((String)map.get("AUTHOR"));
			b.setSubject((String)map.get("SUBJECT"));
			b.setPrice((Double)map.get("PRICE"));
			list.add(b);
		}
		return list;
	}
	
	@Override
	public List<Book> getAllTest() {
		String sql = "SELECT ID,NAME,AUTHOR,SUBJECT,PRICE FROM BOOKS";
		List<Book> list = jdbcTemplate.query(sql, new Object[]{}, new BookRowMapper());
		return list;
	}
}
