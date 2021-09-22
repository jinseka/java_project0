package com.fly.pro2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fly.pro2.DAO.HotelDAO;
import com.fly.pro2.DTO.HotelDTO;

@Controller
public class HotelController {
	
	@Autowired
	HotelDAO dao;
	
	@RequestMapping("key.hotel") //키워드에 해당하는 레코드들 검색
	public void find2(HotelDTO hotelDTO, Model model) {
		System.out.println("컨트롤러>> " + hotelDTO.getKeyword()); //왔는지 찍어보기
		List<HotelDTO> list = dao.list(hotelDTO);
		model.addAttribute("list", list);
		System.out.println("회원 전체수>> "+list.size());

		//전체검색, 1st행 가져와 이미지 컬럼 사용하기
		HotelDTO dto = dao.firstrow(hotelDTO);
		String img = dto.getHimage();
		String img2[] = img.split(","); //{img.jpg,img2.jpg,lam1.jpg,lam2.jpg,lam3.jpg,img3.jpg}
		//dto.setHimage(img2[0]);
		
		//test!!! 새 dto2를 만들어서 모델에 실어야하나?
		//HotelDTO dto2 = new HotelDTO();
		ArrayList<String> list2 = new ArrayList<>();
		String key = hotelDTO.getKeyword();
		for (int i = 0; i < img2.length; i++) {
			if (img2[i].contains(key)) {
				//true면 add
				list2.add(img2[i]);
			} 
		}
		//System.out.println("컨트롤러>> " + dto.getHimage());
		System.out.println("컨트롤러>> " + list2);
//		model.addAttribute("dto", dto);
		model.addAttribute("list2", list2);
	}
	
	
	//1p 전체검색 리스트업
	@RequestMapping("mainlist.hotel")
	public void list(Model model) {
		List<HotelDTO> list = dao.list();
		model.addAttribute("list", list);
		System.out.println("전체 게시글 수>> " + list.size());
	}
	
	
	//admin계정 권한 - 호텔정보 등록, 수정, 삭제
	@RequestMapping("insert.hotel") //요청주소 1개당 메서드 1개
	public void create(HotelDTO hotelDTO) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		System.out.println(hotelDTO);
		dao.create(hotelDTO); //주소가 있으면 메서드 호출 가능
		//리턴으로 특정 jps 호출 안했으니 .fly 절삭하고 
		//views 아래 hotel.jsp를 자동으로 찾아 엶.
	}
	
	@RequestMapping("update.hotel") //요청주소 1개당 메서드 1개
	public void update(HotelDTO hotelDTO) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		System.out.println(hotelDTO);
		dao.update(hotelDTO); //주소가 있으면 메서드 호출 가능
		//리턴으로 특정 jps 호출 안했으니 .fly 절삭하고 
		//views 아래 hotel.jsp를 자동으로 찾아 엶.
	}
	
	@RequestMapping("delete.hotel") //요청주소 1개당 메서드 1개
	public void delete(HotelDTO hotelDTO) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		System.out.println(hotelDTO);
		dao.delete(hotelDTO); //주소가 있으면 메서드 호출 가능
		//리턴으로 특정 jps 호출 안했으니 .fly 절삭하고 
		//views 아래 hotel.jsp를 자동으로 찾아 엶.
	}
	
	
//	@RequestMapping("search.hotel") 1개 검색
//	public void find(HotelDTO hotelDTO, Model model) {
//		System.out.println(hotelDTO.getHid()); //왔는지 찍어보기
//		HotelDTO dto = dao.read(hotelDTO);
//		model.addAttribute("bag", dto);
//	}
	
}
