package com.xiongbeer.filter.bloom;

import com.xiongbeer.Configuration;
import com.xiongbeer.MD5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by shaoxiong on 17-4-11.
 */
public class RamBloomTableTest {
    RamBloomTable bloom = new RamBloomTable();
    MD5 url1 = new MD5("https://www.baidu.com");
    MD5 url2 = new MD5("http://www.baidu.com");
    MD5 url3 = new MD5("www.zhihu.com");
    MD5 url4 = new MD5("1");
    MD5 url5 = new MD5("2");

    @Test
    public void addAndExistTest(){
        bloom.add(url1.getMD5());
        assertEquals(bloom.exist(url1.getMD5()), true);
        assertEquals(bloom.exist(url2.getMD5()), false);
        bloom.add(url2.getMD5());
        assertEquals(bloom.exist(url2.getMD5()), true);
        assertEquals(bloom.exist(url3.getMD5()), false);
        bloom.add(url3.getMD5());
        assertEquals(bloom.exist(url3.getMD5()), true);
        bloom.add(url4.getMD5());
        assertEquals(bloom.exist(url4.getMD5()), true);
        bloom.add(url5.getMD5());
        assertEquals(bloom.exist(url5.getMD5()), true);
    }
}