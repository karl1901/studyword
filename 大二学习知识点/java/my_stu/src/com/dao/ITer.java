package com.dao;

import java.util.List;

import com.entity.Teacher;

public interface ITer {

	public abstract int addTer(Teacher ter);

	public abstract int delTer(int tid);

	public abstract int updateTer(int tid, Teacher ter);

	public abstract List<Teacher> getTer(String tname, String sex);

	public abstract Teacher Login(String tername, String terpwd);

}
