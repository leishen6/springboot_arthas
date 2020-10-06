package com.lyl.controller;

import com.lyl.util.Request;
import com.lyl.util.Response;
import com.lyl.util.ResponseCode;
import com.lyl.util.StringUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.lyl.controller
 * @ClassName: TestController
 * @Description:
 * @Date: 2020-10-04 20:52
 **/
@RestController
@RequestMapping(value = "/v1/api")
public class TestController {

    /**
     *  模拟的测试服务接口
     * @param request
     * @return
     */
    @PostMapping("/test/process")
    public Response<String> process(@RequestBody Request<String> request){
        // test1 方法执行时耗时是正常，里面代码逻辑正常
        StringUtil.test1(request.getData());
        // test2 方法执行时耗时会比较长，因为里面有代码故意写错了
        StringUtil.test2(request.getData());

        Response<String> response = new Response<String>("process success!", ResponseCode.SUCCESS.code(),
                ResponseCode.SUCCESS.message());

        return response;
    }
}
