package com.zjq.template.jdbc;

import com.zjq.template.jdbc.dao.MemberDao;

import java.util.List;

public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
