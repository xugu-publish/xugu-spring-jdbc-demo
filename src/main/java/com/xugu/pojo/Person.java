package com.xugu.pojo;

/**
 * entity
 * @author mj
 * @date 2019/01/22
 */
public class Person
{
	private Long id;
	private String name;
	private String sex;
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	@Override
	public String toString()
	{
		return "{id = "+id+", name = "+name+", sex = "+sex+"}";
	}
	
}
