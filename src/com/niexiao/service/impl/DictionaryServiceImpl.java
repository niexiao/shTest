package com.niexiao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niexiao.base.service.impl.BaseServiceImpl;
import com.niexiao.dao.DictionaryDao;
import com.niexiao.entity.Dictionary;
import com.niexiao.service.DictionaryService;

@Service
public class DictionaryServiceImpl extends BaseServiceImpl<Dictionary, String>
		implements DictionaryService {
	@Autowired
	protected void setDictionaryDao(DictionaryDao dictionaryDao) {
		setBaseDao(dictionaryDao);
	}
}
