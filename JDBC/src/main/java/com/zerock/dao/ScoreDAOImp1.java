package com.zerock.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zerock.command.ScoreVO;

@Repository("scoreDAO")
public class ScoreDAOImp1 implements ScoreDAO {
	
	//�������� �����JDBC
	/*private String url="jdbc:mysql:/localhost:3306/spring?serverTimezone=Asia/Seoul";
	private String uid="spring";
	private String upw="spring";
	
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;

	@Override
	public void scoreInsert(ScoreVO vo) {
		
		String sql="insert into score01(name,kor,eng,math)values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, uid, upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getEng());
			pstmt.setString(4, vo.getMath());
			
			pstmt.executeUpdate();
			
			}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstmt != null)conn.close();
				if(rs !=null)rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		
		}
		}*/
	//spring-jdbc template�� ����ϴ� ���-------------------------------------------------------
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void scoreInsert(ScoreVO vo) {
		
		String sql="insert into score01(name,kor,eng,math) values(?,?,?,?)";
		
		int result=jdbcTemplate.update(sql, new Object[] {vo.getName(),vo.getKor(),vo.getEng(),vo.getMath() });
		System.out.println("����?:"+result);
		
	}
	
		
	

	@Override
	public ArrayList<ScoreVO> scoreSelect() {
		
		/*
		* query()�޼����� �Ķ���� �ǹ�:
		*sql:sql����(?�� ����ϴ� pstmt������ �̿�)
		*new Object[]{}:?���� ���ε���ų ���� ����
		*new RowMapper<Type>():��ȸ����� ResultSet���� �о Type�� �����ͷ� ����
		
		*/
		
		String sql="select*from score01";
		List<ScoreVO> list=jdbcTemplate.query(sql, new Object[] {},new RowMapper<ScoreVO>() {

			@Override
			public ScoreVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				//rowNum�� ������ŭ �ݺ�(rs�� �� ������ŭ �ݺ�)
				ScoreVO vo=new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setKor(rs.getString("kor"));
				vo.setEng(rs.getString("eng"));
				vo.setMath(rs.getString("math"));
				vo.setName(rs.getString("name"));
				
				return vo;
			}
			
			
		} );
		return (ArrayList<ScoreVO>)list;//���� Ÿ������ ����ȯ
	}

	@Override
	public void scoreDelete(String num) {
		String sql="delete from score01 where num=?";
		//���ø�update����� ����ؼ� ����
		
		jdbcTemplate.update(sql,new Object[] { Integer.parseInt(num) });
		
		
		
	}
	
	
		
	}
	


