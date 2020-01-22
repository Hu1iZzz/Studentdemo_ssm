package com.ssmdemo.controller;
;
import com.ssmdemo.model.cUser;
import com.ssmdemo.service.IcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cuser")
public class cUserController {

    @Autowired
    private IcUserService cUserService;

    @RequestMapping(value="/login",method =RequestMethod.POST)
    public ModelAndView loginUser( cUser cuser) throws Exception {
        ModelAndView mv = new ModelAndView();
        cUser compcUser = cUserService.selectcUser(cuser.getUserid());
        String msg = "";
        if (compcUser != null) {
            if (compcUser.getPassword().equals(cuser.getPassword())) {
                msg = "登陆成功";
            } else {
                msg = "密码错误或类型错误";
            }
        }else {
            msg = "无此账号资料";
        }
        mv.addObject("msg",msg );
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("/create")
    public ModelAndView createcUser(@RequestParam(value="cuser") cUser cuser) throws Exception {
        ModelAndView mv = new ModelAndView();
        boolean flag = cUserService.creatcUser(cuser);
        String msg = "";
        if (flag){
            msg = "创建成功";
        }else {
            msg = "创建失败";
        }
        mv.addObject("msg",msg );
        mv.setViewName("createcUser");
        return mv;
    }
}
