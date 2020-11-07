package com.gcl.demo2.controller;

import com.gcl.demo2.config.ConfigResult;
import com.gcl.demo2.entity.Member;
import com.gcl.demo2.service.MemberService;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin    //解决跨域问题的注释
@RequestMapping(value = "/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    /**
     * 查看此人是否重复注册
     *
     * @return
     */
    public boolean find(String number) {
        return memberService.find(number) == null || memberService.find(number).isEmpty();
    }


    @RequestMapping("/findAllByNumber")
    public ResponseEntity<Map<String, Object>> findAllByNumber(@RequestParam String number) {
        //数据库里面不存在此人
        if (find(number)) {
            return ConfigResult.success();
        }
        //数据库里面存在此人
        else {
            return ConfigResult.error();
        }
    }



    /**
     * 此人若是不是重复注册，则保存他的数据
     * @param member
     */
    @PostMapping("/save")
    public ResponseEntity<Map<String,Object>> save(@RequestBody Member member){

        //即数据库里面不存在此人，即保存它进数据库
        if (find(member.getNumber())){

            memberService.save(member);

            //保存成功即返回成功信息
            return ConfigResult.success();

        }
        else{
            //保存失败即返回失败信息
            return ConfigResult.error();

        }
    }



    /**
     * 将数据库里面的报名成员的数据以excel表格的形式打印出来
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/ExcelDownloads")
    public void downloadAllMember(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        //查找所有注册成员的信息
        List<Member> memberList = memberService.findAll();

        //此处文件名字不能设置成中文，否则会出现文件无名字的情况
        String fileName = "members" + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = { "序号", "姓名", "性别", "学号","电话号码","专业班级","分组意向"};
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列，一个成员的数据对应一列
        for (Member member : memberList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(member.getId());
            row1.createCell(1).setCellValue(member.getName());
            row1.createCell(2).setCellValue(member.getSex());
            row1.createCell(3).setCellValue(member.getNumber());
            row1.createCell(4).setCellValue(member.getPhone());
            row1.createCell(5).setCellValue(member.getMajor());
            row1.createCell(6).setCellValue(member.getIntention());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }
}

