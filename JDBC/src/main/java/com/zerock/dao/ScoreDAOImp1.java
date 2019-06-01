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
	
	//전통적인 방식의JDBC
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
	//spring-jdbc template을 사용하는 방법-------------------------------------------------------
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void scoreInsert(ScoreVO vo) {
		
		String sql="insert into score01(name,kor,eng,math) values(?,?,?,?)";
		
		int result=jdbcTemplate.update(sql, new Object[] {vo.getName(),vo.getKor(),vo.getEng(),vo.getMath() });
		System.out.println("성공?:"+result);
		
	}
	
		
	

	@Override
	public ArrayList<ScoreVO> scoreSelect() {
		
		/*
		* query()메서드의 파라미터 의미:
		*sql:sql퀴리(?를 사용하는 pstmt쿼리를 이용)
		*new Object[]{}:?값에 바인딩시킬 값을 전달
		*new RowMapper<Type>():조회결과를 ResultSet에서 읽어서 Type의 데이터로 생성
		
		*/
		
		String sql="select*from score01";
		List<ScoreVO> list=jdbcTemplate.query(sql, new Object[] {},new RowMapper<ScoreVO>() {

			@Override
			public ScoreVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				//rowNum의 개수만큼 반복(rs의 행 개수만큼 반복)
				ScoreVO vo=new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setKor(rs.getString("kor"));
				vo.setEng(rs.getString("eng"));
				vo.setMath(rs.getString("math"));
				vo.setName(rs.getString("name"));
				
				return vo;
			}
			
			
		} );
		return (ArrayList<ScoreVO>)list;//리턴 타입으로 형변환
	}

	@Override
	public void scoreDelete(String num) {
		String sql="delete from score01 where num=?";
		//탬플릿update기능을 사용해서 삭제
		
		jdbcTemplate.update(sql,new Object[] { Integer.parseInt(num) });
		
		
		
	}
	
	
		
	}
	


