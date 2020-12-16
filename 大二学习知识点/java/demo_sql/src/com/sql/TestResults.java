package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestResults {

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
			String sql = "select * from results";
			// 3.ResultSet�࣬������Ż�ȡ�Ľ��������
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("----------------------------------------------");
			System.out.println("ִ�н��������ʾ:");
			System.out.println("----------------------------------------------");
			System.out.println("���" + "\t| " + "����" + "\t| " + "�Ա�" + "\t| "
					+ "����" + "\t| " + "��ѧ" + "\t| " + "Ӣ��");
			System.out.println("----------------------------------------------");

			String sid = null;
			String sname = null;
			String sex = null;
			String chinese = null;
			String math = null;
			String english = null;
			while (rs.next()) {
				// ��ȡ����(��)
				sid = rs.getString("sid");
				sname = rs.getString("sname");
				sex = rs.getString("sex");
				chinese = rs.getString("chinese");
				math = rs.getString("math");
				english = rs.getString("english");

				// ������
				System.out.println(sid + "\t| " + sname + "\t| " + sex + "\t| "
						+ chinese + "\t| " + math + "\t| " + english);
			}
			System.out.println("----------------------------------------------");
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
