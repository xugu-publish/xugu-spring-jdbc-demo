package com.xugu.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * 结果集mapper
 * @author mj
 * @date 2019/01/22
 */
public class PersonMapper implements RowMapper<Person>
{
	public Person mapRow(ResultSet rs, int rows) throws SQLException{
    	Person person = new Person();
    	person.setId(rs.getLong(1));
    	person.setName(rs.getString(2));
    	person.setSex(rs.getString(3));
    	return person;
    }
}
