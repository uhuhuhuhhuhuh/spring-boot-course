package top.keke.model;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.keke.model.Team;

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
    assertEquals("xym99", team.getLeader());
  }
}