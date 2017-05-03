/**
 * 
 */
package hyj.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hyj.dao.VehicleModelInfoMapper;
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
	VehicleModelInfoMapper dao;
	static Log log =LogFactory.getLog(HttpController.class);
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Object QueryModel() {
		VehicleModelInfo info = dao.findById(1);
		System.out.println(info.getVehicleId());
		System.out.println("request into ----");
		System.out.println(info.getFactoryName());
		log.info("dddddd");
		return null;
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
	                return "You successfully uploaded " + name + " into " + name + "-uploaded !";  
	            } catch (Exception e) {  
	                return "You failed to upload " + name + " => " + e.getMessage();  
	            }  
	        } else {  
	            return "You failed to upload " + name + " because the file was empty.";  
	        }  
	    }  

}
