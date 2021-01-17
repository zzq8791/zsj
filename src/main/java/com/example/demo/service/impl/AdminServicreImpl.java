package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Admin;
import com.example.demo.domain.AdminExample;
import com.example.demo.domain.Book;
import com.example.demo.domain.BookCategory;
import com.example.demo.domain.BookCategoryExample;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.BookCategoryMapper;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.IAdminService;

@Service
public class AdminServicreImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private BookMapper bookMapper;

    @Resource
    private BookCategoryMapper bookCategoryMapper;
    @Override
    public boolean adminIsExist(String name) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin=adminMapper.selectByExample(adminExample);
        if(null==admin)
        return false;
        if(admin.size()<1){
            return false;
        }
        return true;
    }

    @Override
    public boolean adminLogin(String name, String password) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin=adminMapper.selectByExample(adminExample);
        if(null==admin){
            return false;
        }
        for(Admin a:admin){
            if(a.getAdminPwd().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addBook(Book book) {
        int n=bookMapper.insert(book);
        if(n>0){
            return true;
        }
        return false;
    }

    @Override
    public List<BookCategory> getBookCategorys() {
        BookCategoryExample bookCategoryExample=new BookCategoryExample();
        return bookCategoryMapper.selectByExample(bookCategoryExample);
    }

    @Override
    public boolean addBookCategory(BookCategory bookCategory) {
        int n=bookCategoryMapper.insert(bookCategory);
        if(n>0){
            return true;
        }
        return false;
    }
}
