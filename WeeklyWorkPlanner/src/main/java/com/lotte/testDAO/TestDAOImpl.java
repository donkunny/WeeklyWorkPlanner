package com.lotte.testDAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lotte.testDTO.TestDTO;

@Repository
public class TestDAOImpl implements TestDAO{
	@Inject
	SqlSession session; 
	
	private static String namespace ="com.lotte.mapper.testMapper";

	@Override
	public List<TestDTO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
	
	
}
