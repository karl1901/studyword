package com.test;

import java.util.List;

import com.dao.IStu;
import com.dao.StuDao;
import com.entity.Stu;

public class Test {

	public static void main(String[] args) {

		// System.out.println(DBhelp.getcon());

		IStu is = new StuDao();

		// // add stu
		// Stu stu = new Stu(3, "鲍勃", 15, "男", "baobo", "ptptpt", "2021-01-01",
		// "2022-02-09");
		// int n = is.addStu(stu);
		// System.out.println(n);

		// // delete stu
		// int n = is.delStu(6);
		// System.out.println(n);

		// // update stu
		// Stu stu =new Stu();
		// stu.setSname("karl");
		// stu.setAge(17);
		// stu.setSex("男");
		// stu.setUsername("karl");
		// stu.setPassword("karl2020");
		// stu.setRtime("2019-01-01");
		// stu.setBtime("2027-09-17");
		// int n = is.updateStu(1, stu);
		// System.out.println(n);

		// // get stu
		// List<Stu> myl = is.getStu(null, "女");
		// for (Stu stu : myl) {
		// System.out.println(stu.toString());
		// }

	}

}
