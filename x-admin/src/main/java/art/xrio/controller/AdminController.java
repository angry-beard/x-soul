package art.xrio.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author angry_beard
 * @date 2022/8/8 15:14
 */
@Slf4j
@RequestMapping("admin")
@RestController
@AllArgsConstructor
public class AdminController {

    @GetMapping("hello")
    public String test(String name) {
        return "大哥 你好 world";
    }
}
