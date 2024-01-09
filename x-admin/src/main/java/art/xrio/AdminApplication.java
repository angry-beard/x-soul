package art.xrio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author angry_beard
 * @date 2024年01月04日 17:14
 */
@SpringBootApplication(scanBasePackages = {"art.xrio.**"})
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}