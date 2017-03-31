/**
 * 데이터 접근 오브젝트 인터페이스
 * @author 김동혁
 */
package com.lotte.testDAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lotte.testDTO.TestDTO;


public interface TestDAO {
	public List<TestDTO> listAll() throws Exception;
}
