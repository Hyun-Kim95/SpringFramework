package hello.core.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.core.common.MyLogger;

@Controller
public class LogDemoController {
	private final LogDemoService logDemoService;
	private final MyLogger myLogger;

	@Autowired
	public LogDemoController(LogDemoService logDemoService, MyLogger myLogger) {
		this.logDemoService = logDemoService;
		this.myLogger = myLogger;
	}

	@RequestMapping("log-demo")
	@ResponseBody
	public String logDemo(HttpServletRequest request) {
		String requestURL = request.getRequestURL().toString();
		
		System.out.println("myLogger = " + myLogger.getClass());
		myLogger.setRequestURL(requestURL);
		
		myLogger.log("controller test");
		logDemoService.logic("testId");
		return "OK";
	}
} 