package top.keke.model;

/**
 * @Author: zhangke
 * @Date: 2025/9/12
 * @Version: 1.0
 */
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class Mail {
    @NotBlank
    @Email
    private String to;

    @NotBlank
    private String subject;

    @NotBlank
    private String content;
}