package com.sh.jdbctemp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMapper implements RowMapper<Book> {
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("CONVERTING ROW : " + rowNum);
		Book b = new Book();
		b.setBookid(rs.getInt("ID"));
		b.setName(rs.getString("NAME"));
		b.setAuthor(rs.getString("AUTHOR"));
		b.setSubject(rs.getString("SUBJECT"));
		b.setPrice(rs.getDouble("PRICE"));
		return b;
	}
}

