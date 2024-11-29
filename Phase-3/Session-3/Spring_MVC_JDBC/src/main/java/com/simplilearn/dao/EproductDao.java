package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Eproduct;

@Repository
public class EproductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Eproduct> getAllProducts(){
		return  jdbcTemplate.query("select * from eproduct", new RowMapper<Eproduct>() {

			@Override
			public Eproduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
			Eproduct obj=new Eproduct();
			obj.setId(rs.getLong(1));
			obj.setName(rs.getString(2));
			obj.setPrice(rs.getBigDecimal(3));
			obj.setDate_added(rs.getTimestamp(4));
			return obj;
			}
			
		});
	}

}
