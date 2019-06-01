package com.zerock.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import com.zerock.command.BoardVO;


@Repository
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	//등록
	@Override
	public void boardInsert(String name, String title, String content) {

		String sql = "insert into board01(name, title, content) values(?,?,?)";

		int result = jdbcTemplate.update(sql, new Object[] {name, title, content});
		System.out.println(result);
	}
	
	
	//조회
	@Override
	public ArrayList<BoardVO> boardSelect() {

		String sql = "select * from board01";

		List<BoardVO> list = jdbcTemplate.query(sql, new Object[] {}, new RowMapper<BoardVO>() {

			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				BoardVO vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				return vo;
			}

			
		});
		
		return (ArrayList<BoardVO>)list;
	}
	
	
	//삭제
	@Override
	public void boardDelete(String num) {
		
		String sql = "delete from board01 where num = ?";
		jdbcTemplate.update(sql, new Object[] {num} );
		
		
	}
}