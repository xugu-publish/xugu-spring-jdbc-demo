package com.xugu.springjdbctemplate;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xugu.pojo.Person;
import com.xugu.pojo.PersonMapper;

/**
 * 测试类
 * @author mj
 * @date 2019/01/22
 */
public class AppTest
{
	
   JdbcTemplate template = (JdbcTemplate) new ClassPathXmlApplicationContext("spring.xml").getBean("jdbcTemplate");	
   
   @Test
   public void insert(){
	   String sql = "insert into person values(?,?,?)";
	   System.out.println("插入 "+template.update(sql, 1, "bob", "男")+" 条数据");
   }
   
   @Test
   public void update(){
	   String sql = "update person set name='bob' where id =?";
	   System.out.println("更新 "+template.update(sql,1)+" 条数据");
   }
   
   @Test
   public void select(){
	   String sql = "select * from person";
	   List<Person> persons = template.query(sql, new PersonMapper());
	   for(Person person:persons){
		   System.out.println(person);
	   }
   }
   
   @Test
   public void delete(){
	   String sql = "delete from person where id = ?";
	   System.out.println("删除 "+template.update(sql,1)+" 条数据");
   }
   
   @Test
   public void truncate(){
	   String sql = "truncate table person";
	   template.execute(sql);
	   System.out.println("清空表person");
   }
   
   @Test
   public void dropTable(){
	   String sql = "create table person1(i int)";
	   template.execute(sql);
	   System.out.println("创建表person1");
	   String sql1 = "drop table person1";
	   template.execute(sql1);
	   System.out.println("删除表person1");
   }
   
}
