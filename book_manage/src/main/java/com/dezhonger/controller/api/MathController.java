package com.dezhonger.controller.api;

import com.dezhonger.util.PE66;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dezhonger on 2017/2/13.
 */
@Controller
@RequestMapping("/math")
public class MathController {

	@RequestMapping(value = {"/pell"})
	public String pell(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		String str = request.getParameter("D");
		int D = Integer.parseInt(str);
		String[] ans = new PE66(D).solve();
		modelMap.put("x", ans[0]);
		modelMap.put("y", ans[1]);
		modelMap.put("D", D);
		return "math/pell";
	}
}
