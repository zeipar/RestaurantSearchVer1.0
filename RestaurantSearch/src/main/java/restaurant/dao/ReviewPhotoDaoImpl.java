package restaurant.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import restaurant.dto.ReviewPhotoDto;

public class ReviewPhotoDaoImpl extends SqlSessionDaoSupport implements ReviewPhotoDao {
	
	public List<ReviewPhotoDto> selectReviewPhotoByReviewIdDetView(Map<String, Object> shopReviewDto) {
		// TODO Auto-generated method stub
		System.out.println("ReviewPhotoDaoImpl>>selectReviewPhotoByReviewIdDetView() is called!!");
		
		return getSqlSession().selectList("selectReviewPhotoByReviewIdDetView", shopReviewDto);
	}
	
	public int getNewReviewPhotoDetView() {
		// TODO Auto-generated method stub
		System.out.println("ReviewPhotoDaoImpl>>getNewReviewPhotoDetView() is called!!");
		
		Integer newPhotoId = getSqlSession().selectOne("getNewReviewPhotoDetView");
		
		if (newPhotoId == null) {
			newPhotoId = 0;
		}
		
		return newPhotoId;
	}

	public void insertReviewPhotoDetView(ReviewPhotoDto reviewPhotoDto) {
		// TODO Auto-generated method stub
		System.out.println("ReviewPhotoDaoImpl>>insertReviewPhotoDetView() is called!!");
		
		int resultByInsert = getSqlSession().insert("insertReviewPhotoDetView", reviewPhotoDto);
		System.out.println("ReviewPhotoDaoImpl>>resultByInsert = " + resultByInsert);
	}
	
	public void deleteReviewPhotoDetView(int reviewId) {
		// TODO Auto-generated method stub
		System.out.println("ReviewPhotoDaoImpl>>deleteReviewPhotoDetView() is called!!");
		
		int resultByDelete = getSqlSession().delete("deleteReviewPhotoDetView", reviewId);
		System.out.println("ReviewPhotoDaoImpl>>resultByDelete = " + resultByDelete);
	}
	
	public List<ReviewPhotoDto> selectReviewPhotoByReviewIdDetViewForDelete(int reviewId) {
		// TODO Auto-generated method stub
		System.out.println("ReviewPhotoDaoImpl>>selectReviewPhotoByReviewIdDetViewForDelete() is called!!");
		
		return getSqlSession().selectList("selectReviewPhotoByReviewIdDetViewForDelete", reviewId);
	}
}
