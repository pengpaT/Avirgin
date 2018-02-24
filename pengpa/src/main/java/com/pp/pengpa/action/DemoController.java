package com.pp.pengpa.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pp.pengpa.entity.Tusers;
import com.pp.pengpa.service.Userservice;




@RestController
@SpringBootApplication
@RequestMapping("/demo")
public class DemoController {
	/*
	 * 在配置类上添加以上注解，可以扫描dao包中的所有接口，替代在每个dao中写@Mapper注解,不过这样会提高耦合度。
	 * 而@Mapper可以与dao自成一体，与@Controller、@Service遥相呼应，整体结构更优雅
	 */
@Resource
private Userservice userserviceImpl;
@RequestMapping("/getDemo")
public Tusers hello(){
	Tusers bean = new Tusers();
	bean.setId(1L);
	bean.setUsername("张三2");
	bean.setPhones("111111111");
	System.out.println(1111);
	return bean;
}
//required=false 意思是必须赋值
	@GetMapping("/getTusers3")
	public Tusers getTusers3(@RequestParam(value="id",required=true) String id,@RequestParam(value="username",required=true) String username){
		Tusers tusers = new Tusers();
		tusers.setId(Long.valueOf(id));
		tusers.setUsername(username);
		tusers=userserviceImpl.queryUser(tusers);
		return tusers;
	}
	@RequestMapping("/getTusersList4")
	public List<Tusers> getTusersList4(Tusers user){
		
		List<Tusers> tusers = userserviceImpl.queryUserList2(user);
		return tusers;
	}
@RequestMapping("/getTusersList")
public List<Tusers> getTusersList(Tusers user){
	user.setStart(0);
	user.setEnd(1);
	List<Tusers> tusers = userserviceImpl.queryUserList(user);
	return tusers;
}
}
