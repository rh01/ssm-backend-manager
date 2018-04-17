package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.QuotationAnalysisMapper;
import com.ssm.domain.QuotationAnalysis;
import com.ssm.service.QuotationService;

@Service
public class QuotationServiceImpl implements QuotationService {

	@Resource
	private QuotationAnalysisMapper quotationAnalysisMapper;


	public QuotationAnalysis findById(Long partNumber) {
		
		QuotationAnalysis quotation=quotationAnalysisMapper.selectByPrimaryKey(partNumber);
		
		return quotation;
	}


	public void insert(QuotationAnalysis quotation) {
		quotationAnalysisMapper.insert(quotation);
		
	}


	public void saveOrUpdate(QuotationAnalysis quotation) {
		quotationAnalysisMapper.updateByPrimaryKey(quotation);
		
	}


	@Override
	public void deleteByID(Long partNumber) {
		quotationAnalysisMapper.deleteByPrimaryKey(partNumber);
		
	}


	@Override
	public List<QuotationAnalysis> findAll() {
		List<QuotationAnalysis> list=quotationAnalysisMapper.findAll();
		return list;
	}


	

}
