package com.fh.mybatis.dao;

import com.fh.mybatis.config.Select;

public interface CardDao {

	@Select("select * from demo")
	void list(String mess);
}
