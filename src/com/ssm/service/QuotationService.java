package com.ssm.service;

import java.util.List;

import com.ssm.domain.QuotationAnalysis;

public interface QuotationService {

	QuotationAnalysis findById(Long partNumber);

	void insert(QuotationAnalysis quotation);

	void saveOrUpdate(QuotationAnalysis quotation);

	void deleteByID(Long partNumber);

	List<QuotationAnalysis> findAll();


}
