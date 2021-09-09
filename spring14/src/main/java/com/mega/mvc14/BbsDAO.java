package com.mega.mvc14;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	
	@Autowired
	SqlSessionTemplate my;
	

	public List<BbsDTO> list() {
		List<BbsDTO> list =my.selectList("bbs.all");
		return list;
	}
	
	
	//기능별로 메서드로 정의한다.
	public  void create(BbsDTO bbsDTO) {
		System.out.println(bbsDTO);
		int result = my.insert("bbs.add", bbsDTO);
		System.out.println(result);
	}
	
	public BbsDTO read(BbsDTO bbsDTO) {
		BbsDTO dto = my.selectOne("bbs.one1", bbsDTO);
		return dto;
		}

	
	public  void update() {
		
	}
	
	public  void delete() {
		
	}
	

	
	
}//class
