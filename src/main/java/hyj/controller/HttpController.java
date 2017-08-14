/**
 * 
 */
package hyj.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;

import hyj.dao.PhoneMapper;
import hyj.dao.VehicleModelInfoMapper;
import hyj.model.PhoneTest;
import hyj.model.VehicleModelInfo;



/**
 * @ClassName: HttpController
 * @Description: TODO()
 * @author yejie.huang
 * @date 2017年4月24日 上午10:18:50
 *
 */
@Controller
@RestController
public class HttpController {
	@Autowired
	PhoneMapper dao;
	static Log log =LogFactory.getLog(HttpController.class);
	/*@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Object QueryModel() {qq 33
		VehicleModelInfo info = dao.findById(1);
		System.out.println(info.getVehicleId());
		System.out.println("request into ----");
		System.out.println(info.getFactoryName());
		log.info("dddddd");
		return null;
	}*/
	@RequestMapping(value = "/testDB", method = RequestMethod.GET)
	public Object testDB() {
		List<PhoneTest> pt = dao.findAll();
		log.info("pt-->"+JSON.toJSONString(pt));
		return pt;
	}
	@RequestMapping(value = "/testPost", method = RequestMethod.POST)
	public Object testPost(@RequestParam String data) {
		System.out.println("data--->"+data);
		return "你好！";
	}
	 @RequestMapping(value="/upload", method=RequestMethod.POST)  
	    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,  
	            @RequestParam("file") MultipartFile file){  
	        if (!file.isEmpty()) {  
	            try {  
	                byte[] bytes = file.getBytes();  
	                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(name)));  
	                stream.write(bytes);  
	                stream.close();
	                return "文件上传成功，保存到工程目录下,文件名： " + name + " into " + name + "-uploaded !";  
	            } catch (Exception e) {  
	                return "文件上传失败 " + name + " => " + e.getMessage();  
	            }  
	        } else {  
	            return "文件上传失败 ：" + name + " 文件为空.";  
	        }  
	    }  

}
