package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.BrowsingHistory;

public interface BrowsingHistoryDao {
	int deleteByPrimaryKey(Long id);

	int insert(BrowsingHistory record);

	int insertSelective(BrowsingHistory record);

	BrowsingHistory selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(BrowsingHistory record);

	int updateByPrimaryKey(BrowsingHistory record);

	List<BrowsingHistory> selectAll();
}