package com.fly.pro2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fly.pro2.DAO.AirDAO;
import com.fly.pro2.DTO.AirDTO;

@Controller
public class AirController {
	
	@Autowired
	AirDAO dao;
	
	
	@RequestMapping("air")
	public void insert(AirDTO airDTO) {
		System.out.println(airDTO);
		dao.aircreate(airDTO);
		
	}

	@RequestMapping("air2")
	public void air2(AirDTO airDTO,  Model model) {
		System.out.println(airDTO.getTicketno());
		AirDTO dto = dao.read(airDTO);
		//dto의 데이터는 views/one.jsp로 출력되어야 클라이언트에게 보인다.
		//model속성을 이용하면 views 아래까지 데이터를 보내고 , 사라진다.
		model.addAttribute("dto",dto);
		//컨트롤러에서만 모델을 사용가능하다. 다른곳에서 사용 불가능
	}
	

	@RequestMapping("air_list")
	public void list(Model model) {
		List<AirDTO> list = dao.all();
		System.out.println(list.size() + "================");
		model.addAttribute("list", list);
	}

	
}


