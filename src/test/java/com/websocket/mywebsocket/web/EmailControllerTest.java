package com.websocket.mywebsocket.web;

import com.websocket.mywebsocket.MywebsocketApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MywebsocketApplication.class)
class EmailControllerTest {
    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    void mail() throws Exception {
        MvcResult mvcResult = mockMvc
                .perform(// 1
                        MockMvcRequestBuilders.get("/") // 2
                        //.param("name","getList")        // 3
                )
                .andReturn();// 4

        int status = mvcResult.getResponse().getStatus(); // 5
        String responseString = mvcResult.getResponse().getContentAsString(); // 6

        Assert.assertEquals("请求错误", 200, status); // 7
        Assert.assertEquals("返回结果不一致", "/demoPage/listPage", responseString); // 8


    }
}