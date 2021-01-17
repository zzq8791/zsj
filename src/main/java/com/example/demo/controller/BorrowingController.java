package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Vo.BorrowingBooksVo;
import com.example.demo.service.IBorrowingBooksRecordService;
import com.example.demo.utils.page.Page;

@Controller
public class BorrowingController {

    @Resource
    private IBorrowingBooksRecordService borrowingBooksRecordService;
    /**
     * 返回所有用户借书记录页面
     * @return
     */
    @RequestMapping("/allBorrowBooksRecordPage")
    public String allBorrowingBooksRecordPage(Model model, @RequestParam("pageNum") int pageNum){
        Page<BorrowingBooksVo> page=borrowingBooksRecordService.selectAllByPage(pageNum);
        model.addAttribute("page",page);
        return "admin/allBorrowingBooksRecord";
    }
}
