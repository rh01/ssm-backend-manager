package com.ssm.dao;

import com.ssm.domain.QuotationAnalysis;
import com.ssm.domain.QuotationAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotationAnalysisMapper {
    int countByExample(QuotationAnalysisExample example);

    int deleteByExample(QuotationAnalysisExample example);

    int deleteByPrimaryKey(Long partNumber);

    int insert(QuotationAnalysis record);

    int insertSelective(QuotationAnalysis record);

    List<QuotationAnalysis> selectByExample(QuotationAnalysisExample example);

    QuotationAnalysis selectByPrimaryKey(Long partNumber);

    int updateByExampleSelective(@Param("record") QuotationAnalysis record, @Param("example") QuotationAnalysisExample example);

    int updateByExample(@Param("record") QuotationAnalysis record, @Param("example") QuotationAnalysisExample example);

    int updateByPrimaryKeySelective(QuotationAnalysis record);

    int updateByPrimaryKey(QuotationAnalysis record);

	List<QuotationAnalysis> findAll();

	//List<QuotationAnalysis> findAll(Long id);
}