package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.Stu_class;
import com.util.DBhelp;

public class Stu_classDao implements IStu_class {

	@Override
	public List<Stu_class> getAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Stu_class> myl = new ArrayList<Stu_class>();
		try {
			con = DBhelp.getcon();
			String sql = "select * from stuclass";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Stu_class sc = new Stu_class();
				sc.setSid(rs.getInt(1));
				sc.setSname(rs.getString(2));
				sc.setAge(rs.getInt(3));
				sc.setSex(rs.getString(4));
				sc.setCname(rs.getString(5));
				myl.add(sc);
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}
}
