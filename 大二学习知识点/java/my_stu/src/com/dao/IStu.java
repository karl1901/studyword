package com.dao;

import java.util.List;

import com.entity.Stu;

public interface IStu {
	
	public abstract int addStu(Stu stu);

	public abstract int delStu(int sid);

	public abstract int updateStu(int sid, Stu stu);

	public abstract Stu getSid(int sid);

	public abstract List<Stu> getStu(String sname, String sex);

}
