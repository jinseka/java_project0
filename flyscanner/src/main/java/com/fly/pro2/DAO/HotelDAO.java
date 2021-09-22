package com.fly.pro2.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fly.pro2.DTO.HotelDTO;

@Repository
public class HotelDAO {

	@Autowired
	SqlSessionTemplate ht;
	// 기능을 처리하는 단위 1개를 메서드 1개로 만듦
	
	// 키워드에 해당하는 레코드들 검색
	public List<HotelDTO> list(HotelDTO hotelDTO) {
		System.out.println("DAO>> " + hotelDTO.getKeyword()); // 왔는지 찍어보기
		List<HotelDTO> list = ht.selectList("hotel.key", hotelDTO);
		return list;
	}

	//전체검색, 1st행 가져와 이미지 컬럼 사용하기
	public HotelDTO firstrow(HotelDTO hotelDTO) {
		System.out.println(hotelDTO);
		HotelDTO dto = ht.selectOne("hotel.first", hotelDTO);
		System.out.println("DAO>> " + dto.getHimage());
		return dto;
	}
	
	//전체검색
	public List<HotelDTO> list() {
		List<HotelDTO> list = ht.selectList("hotel.all");
		return list;
	}

	//admin계정 권한 - CUD
	public void create(HotelDTO hotelDTO) {
		System.out.println(hotelDTO);
		ht.insert("hotel.create", hotelDTO);
	}
	
	public void update(HotelDTO hotelDTO) {
		System.out.println(hotelDTO);
		ht.update("hotel.up", hotelDTO);
	}
	
	public void delete(HotelDTO hotelDTO) {
		System.out.println(hotelDTO);
		ht.delete("hotel.del", hotelDTO);
	}
	
//	public HotelDTO read(HotelDTO hotelDTO) { //1개 검색
//	System.out.println(hotelDTO);
//	HotelDTO dto = ht.selectOne("hotel.one", hotelDTO);
//	return dto;
//	}
	
}
