package com.lotte.testService;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.lotte.testDAO.TestDAO;
import com.lotte.testDTO.TestDTO;

@Service
public class TestServiceImpl implements TestService{

	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestDTO> listAll() throws Exception {
		return dao.listAll();
	}

	
}
