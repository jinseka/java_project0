package com.fly.pro2.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fly.pro2.DTO.AirDTO;

@Repository
public class AirDAO {
	
	@Autowired
	
	SqlSessionTemplate plan;
	
	//기능별로 메서드로 정의한다.
	public  void aircreate(AirDTO airDTO) {
		System.out.println(airDTO);
		int result = plan.insert("air.add",airDTO);
		System.out.println(result);
	}
	
	public  AirDTO read(AirDTO airDTO) {
		AirDTO dto = plan.selectOne("air.air2",airDTO);
		return dto;
		}
	
	public  void update() {
		
	}
	
	public  void delete() {
		
	}
	
	public List<AirDTO> all() {
		return plan.selectList("air.all");
	}
	
	
}//class
