/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tien.mathutil.test;

import com.tien.mathutil.core.MathUtil;
import org.junit.Test;    //JUnit 4
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author AN515
 */

//biến class chứa code của mình trở thành 1 member/implement
//cái Interface Parameterized, tham số hóa, biến data cụ thể
//thành tham số/đặt tên biến, sau đó nhồi từ từ tham số
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //0! -> 1
    //1! -> 1
    //2! -> 2
    //3! ->6
    //dữ liệu để test/test case/test data
    //0,1   [2]
    //1,1   [2]
    //2,2   [2]
    //3,6   [2]
    //4,24  [2]
    //5,120 [2]
    //6,720 [2]
    //   [7][2]
    
    //1.Tạo mảng chứa data. Framework/Tool mà có UnitTest xịn
    //hỗ trợ kết nối với file .csv, table trong Database, file Excel
    //để trong mảng, trong code được luôn
    
    //trả về mảng 2 chiều, [7][2], kiểu Object/dùng Wrapper class
    //Integer, Double, Long, Float, Character, Boolean, Short, Byte
    @Parameters
    public static Object[][] initData(){
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {6, 720}
        };
    }
    
    //có bộ data rồi, ta trích từng cặp ra và test như cách xanh đỏ cũ!
    
    @Parameter(value = 0)   //gắn biến này với cột 0
    public int input;    //n, ứng với cột 0          map vào mảng 6!
    
    @Parameter(value = 1)   //gắn biến này với cột 1
    public long expected;   //ứng với cột 1 giá trị của n!        720

    @Test   //trích xuất data được rồi, nhồi vào assertEquals()
    public void testFactorialGivenValidArgumentReturnsWell(){
            
        
        assertEquals(expected, MathUtil.getFactorial(input));
    }

}
