package com.cg.onlineeyeclinic.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineeyeclinic.exception.TestIdNotFoundException;
import com.cg.onlineeyeclinic.model.Tests;
import com.cg.onlineeyeclinic.repository.ITestRepository;

@Service("name= testService")
@Transactional
public class TestServiceImpl implements ITestService {

	private static final String ERROR_MESSAGE = "Test ID Not Found";

	@Autowired
	private ITestRepository testRepository;

	@Override
	public Tests addTest(Tests tests) {
		return testRepository.save(tests);
	}

	@Override
	public Tests updateTest(Tests tests) throws TestIdNotFoundException {
		Integer testId = tests.getTestId();
		Optional<Tests> test = testRepository.findById(testId);
		if (test.isEmpty())
			throw new TestIdNotFoundException(ERROR_MESSAGE);
		return testRepository.save(tests);
	}

	@Override
	public Tests removeTest(Integer testId) throws TestIdNotFoundException {
		Optional<Tests> test = testRepository.findById(testId);
		if (test.isEmpty())
			throw new TestIdNotFoundException(ERROR_MESSAGE);
		testRepository.deleteById(testId);
		return null;
	}

	@Override
	public Optional<Tests> viewTest(Integer testId)  throws TestIdNotFoundException {
		Optional<Tests> test = testRepository.findById(testId);
		if (test.isEmpty())
			throw new TestIdNotFoundException(ERROR_MESSAGE);
		return test;

	}

	@Override
	public List<Tests> viewTestsList() {
		return testRepository.findAll();
	}

}