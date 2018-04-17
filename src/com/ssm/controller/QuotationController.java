package com.ssm.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.domain.QuotationAnalysis;
import com.ssm.service.QuotationService;

@Controller       
@RequestMapping("/QuotationAnalysis")
public class QuotationController {
	
	@Resource
	private QuotationService quotationService;
	
	@RequestMapping("list")
	public String list(){
		return "submit";
	}
	@RequestMapping("insert")
	public String insert(QuotationAnalysis quotation){
		quotationService.insert(quotation);
		return "redirect: http://127.0.0.1:8080/volvo_demo/test.jsp";
	}
	
	
	@RequestMapping("listfind")//方法
	public String listfind(){
		return "find";//jsp页面
	}
	
	@RequestMapping("/find")//方法  
	public String find(Long partNumber,Model model)
	{
		System.out.println(partNumber);
		QuotationAnalysis quotation=quotationService.findById(partNumber);
	    if(quotation==null){
	    	return "redirect:listfind.do";//重定向
	    }
		model.addAttribute("edit", quotation);
		return "edit";//jsp页面
	}
	
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(QuotationAnalysis quotation){
		
		quotationService.saveOrUpdate(quotation);
		
		return "redirect:http://127.0.0.1:8080/volvo_demo/test.jsp";
	}
	
	//根据Id进行删除
	@RequestMapping("deleteById")
	public String deleteByID(Long partNumber) {
		quotationService.deleteByID(partNumber);
		return "redirect: listfind.do";
	}
	
	@RequestMapping(value="/findAll")//方法 
	public @ResponseBody List<QuotationAnalysis> findAll()
	{
		List<QuotationAnalysis> list=quotationService.findAll();
	    /*if(list==null){
	    	return "redirect:listfind.do";//重定向
	    }*/
		//model.addAttribute("quotationList", list);
		//return "quotationList";//jsp页面
		return list; 
	}

}
