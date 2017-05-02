/**
 * 
 */
package hyj.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hyj.dao.VehicleModelInfoMapper;
import hyj.model.VehicleModelInfo;



/**
 * @ClassName: HttpController
 * @Description: TODO()
 * @author yejie.huang
 * @date 2017年4月24日 上午10:18:50
 *
 */
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

}
