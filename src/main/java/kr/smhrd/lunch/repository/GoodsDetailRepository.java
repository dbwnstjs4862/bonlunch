package kr.smhrd.lunch.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.entity.GoodsDetail;

public interface GoodsDetailRepository extends JpaRepository<GoodsDetail, Integer>{

//	Optional<Goods> findById(int id);

}