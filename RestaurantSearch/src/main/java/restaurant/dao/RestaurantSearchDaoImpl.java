package restaurant.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import restaurant.dto.RestaurantDto;

public class RestaurantSearchDaoImpl extends SqlSessionDaoSupport implements RestaurantSearchDao {
	public List<RestaurantDto> selectRestaurantSearchByKeyword(HashMap<String, Object> pagingMap) {
		// TODO Auto-generated method stub
		System.out.println("RestaurantSearchDaoImpl>>selectRestaurantSearchByKeyword() is called!!");

		return getSqlSession().selectList("selectRestaurantSearchView", pagingMap);
	}

	public int selectRestaurantSearchTotalCountByKeyWord(List<String> keyword) {
		// TODO Auto-generated method stub
		System.out.println("RestaurantSearchDaoImpl>>selectRestaurantSearchTotalCountByKeyWord() is called!!");
		return getSqlSession().selectOne("selectRestaurantSearchViewCount", keyword);
	}

	public int selectRestaurantSearchTotalCountBySearchOptionHashMap(HashMap<String, Object> searchOptionHashMap) {
		// TODO Auto-generated method stub
		//return 0;

		System.out.println("RestaurantSearchDaoImpl>>selectRestaurantSearchTotalCountBySearchOptionHashMap() is called!!");
		return getSqlSession().selectOne("selectRestaurantSearchViewCountByFilter", searchOptionHashMap);
	}

	public List<RestaurantDto> selectRestaurantSearchBySearchOptionHashMap(
			HashMap<String, Object> searchOptionHashMap) {
		// TODO Auto-generated method stub
		//return null;
		return getSqlSession().selectList("selectRestaurantSearchViewByFilter", searchOptionHashMap);
	}

	public RestaurantDto selectRestaurantSearchById(Integer restaurantId) {
		// TODO Auto-generated method stub
		//selectRestaurantSearchById
		if (restaurantId == null) {
			restaurantId = 0;
		}
		
		return getSqlSession().selectOne("selectRestaurantSearchById", restaurantId);
	}

	public int selectRestaurantSearchTotalCountBySearchOptionHashMapForLikeList(
			HashMap<String, Object> searchOptionHashMap) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("selectRestaurantSearchTotalCountBySearchOptionHashMapForLikeList", searchOptionHashMap);
	}

	public List<RestaurantDto> selectRestaurantSearchBySearchOptionHashMapForLikeList(
			HashMap<String, Object> searchOptionHashMap) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("selectRestaurantSearchBySearchOptionHashMapForLikeList", searchOptionHashMap);
	}
}
