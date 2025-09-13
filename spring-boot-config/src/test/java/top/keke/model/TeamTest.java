package top.keke.model;
import top.keke.Service.MailService;// 根据实际包路径调整

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import top.keke.model.Team;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TeamTest {
  @Resource
  private Team team;
  @Test
  void textTeam1() {
    log.info("team: {}", team);
    assertEquals("keke", team.getLeader());
  }

  @Test
  void textTeam2() {
    assertEquals("keke", team.getLeader());
  }

}