package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStu {

	public static void main(String[] args) {
		// ����Connection����
		Connection con;
		// ����������
		String driver = "com.mysql.jdbc.Driver";
		// URLָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/test";
		// MySQL����ʱ���û���
		String user = "root";
		// MySQL����ʱ������
		String password = "010928";
		// ������ѯ�����
		try {
			// ������������
			Class.forName(driver);
			// 1.getConnection()����������MySQL���ݿ⣡��
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			// 2.����statement���������ִ��SQL��䣡��
			Statement statement = con.createStatement();
			// Ҫִ�е�SQL���
			String sql = "select * from stu";
			// 3.ResultSet�࣬������Ż�ȡ�Ľ��������
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("-----------------------------");
			System.out.println("ִ�н��������ʾ:");
			System.out.println("-----------------------------");
			System.out.println("���"+"\t| "+"����" + "\t| " + "ְ��"+"\t| "+"����");
			System.out.println("-----------------------------");

			String sex = null;
			String id = null;
			String sid=null;
			String age=null;
			while (rs.next()) {
				// ��ȡstuname��������
				sex = rs.getString("sex");
				// ��ȡstuid��������
				id = rs.getString("sname");
				// ��ȡѧ��sid����
				sid = rs.getString("sid");
				// ��ȡѧ��age����
				age=rs.getString("age");

				// ������
				System.out.println(sid+"\t| "+id + "\t| " + sex+"\t| "+age);
			}
			System.out.println("-----------------------------");
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// ���ݿ��������쳣����
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// ���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("���ݿ����ݳɹ���ȡ����");
		}

	}

}
