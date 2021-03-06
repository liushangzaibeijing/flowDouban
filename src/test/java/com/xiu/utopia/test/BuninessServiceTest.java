package com.xiu.utopia.test;

import com.xiu.utopia.UtopiaApplication;
import com.xiu.utopia.busConvert.TagConvert;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * author  Administrator
 * date   2018/10/24
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UtopiaApplication.class)
@WebAppConfiguration
public class BuninessServiceTest {

    @Autowired
    TagConvert tagConvert;

    @Test
    public void test(){
        tagConvert.convertMovieTags();
    }

    @Test
    public void testBook(){
        tagConvert.convertBookTags();
    }

    @Test
    public void testMovie(){
        tagConvert.convertMovie();
    }

    @Test
    public void testConvertBook(){
        tagConvert.convertBook();
    }





}
