package top.keke.Controller;

import api.ApiResponse;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import enums.ResultStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangke
 * @Date: 2025/9/13
 * @Version: 1.0
 */
@RestController
@RequestMapping("/api/http")
public class HttpController {

    @GetMapping("/get")
    public ResponseEntity<ApiResponse<ResultStatus>> httpGet(@RequestParam String url) {
        if (StrUtil.isBlank(url)) {
            String errorMsg = ResultStatus.FAIL.getInfo() + "：请求URL不能为空";
            return ResponseEntity.badRequest().body(ApiResponse.error(errorMsg));
        }

        try {
            // 调用Hutool的HttpUtil发送GET请求
            String response = HttpUtil.get(url);
            // 若请求成功，返回SUCCESS枚举及对应info
            return ResponseEntity.ok(
                    ApiResponse.success(ResultStatus.SUCCESS.getInfo(), ResultStatus.SUCCESS)
            );
        } catch (Exception e) {
            // 失败时拼接错误信息
            String errorMsg = ResultStatus.FAIL.getInfo() + "：" + e.getMessage();
            return ResponseEntity.badRequest().body(ApiResponse.error(errorMsg));
        }
    }
}