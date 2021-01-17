package com.example.demo.service;

import com.example.demo.domain.BookCategory;
import com.example.demo.utils.page.Page;

public interface IBookCategoryService {

    //图书类别分页查询
    public Page<BookCategory> selectBookCategoryByPageNum(int pageNum);

    int deleteBookCategoryById(int bookCategoryId);
}
