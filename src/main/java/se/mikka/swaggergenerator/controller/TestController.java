package se.mikka.swaggergenerator.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/tests")
@Api(value = "Test API", tags = "Test API")
public class TestController {

  @GetMapping(value = "/{testId}")
  @ApiOperation(value = "Get a specific test Id", nickname = "getTest")
  public TestData getTestData(@PathVariable(value = "testId") String testId) {
    TestData testData = new TestData();
    testData.setId(testId);
    testData.setName("Name0340328402");
    return testData;
  }
}
