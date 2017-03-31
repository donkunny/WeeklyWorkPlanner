package com.lotte.testService;

import java.util.List;

import com.lotte.testDTO.TestDTO;


public interface TestService {
	public List<TestDTO> listAll() throws Exception;
}
