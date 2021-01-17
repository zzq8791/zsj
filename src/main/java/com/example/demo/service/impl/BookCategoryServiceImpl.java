package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.domain.BookCategory;
import com.example.demo.mapper.BookCategoryMapper;
import com.example.demo.service.IBookCategoryService;
import com.example.demo.utils.page.Page;

@Service
public class BookCategoryServiceImpl implements IBookCategoryService {

    @Resource
    private BookCategoryMapper bookCategoryMapper;
    @Override
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum) {
        Page<BookCategory> page=new Page<>();
        List<BookCategory> list=bookCategoryMapper.selectByPageNum((pageNum-1)*10,10);
        page.setPageSize(10);
        page.setPageNum(pageNum);
        page.setList(list);
        int recordCount=bookCategoryMapper.selectAllCount();
        int pageCount=recordCount/10;
        if(recordCount%10!=0){
            pageCount++;
        }
        page.setPageCount(pageCount);
        return page;
    }

    @Override
    public int deleteBookCategoryById(int bookCategoryId) {
        return bookCategoryMapper.deleteByPrimaryKey(bookCategoryId);
    }
}
