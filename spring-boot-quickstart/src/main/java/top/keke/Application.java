package top.keke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    /**
     * @Author: keke
     * @Date: 2025/9/4
     */

    @SpringBootApplication
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
            System.out.println("http://localhost:8081/hello");
        }
    }
