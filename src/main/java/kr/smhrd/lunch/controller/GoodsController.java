package kr.smhrd.lunch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.service.GoodsService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@GetMapping("/goods_list/{id}")
	public GoodsDTO geGoodDetail(@PathVariable("id") int id) {
		System.out.println("디테일 요청 받음"+id); 
		return goodsService.getGoodsDetail(id);
	}
	
	
	@GetMapping("/goods_list")
	public List<GoodsDTO> getGoodsList() {
		System.out.println("[list 출력 컨트롤러]");
	
		// 2Step -> Service -> Repository
		
		return goodsService.getGoodsList();	
	}
}