package top.keke.Service;

import enums.ResultStatus;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.transform.Result;

// 检查 MailService 接口中的方法签名
public interface MailService {
    ResultStatus sendSimpleMail(top.keke.model.Mail mail);
    ResultStatus sendHTMLMail(top.keke.model.Mail mail);
    ResultStatus sendAttachmentsMail(top.keke.model.Mail mail, MultipartFile[] files);
    // 确保包路径正确
}
