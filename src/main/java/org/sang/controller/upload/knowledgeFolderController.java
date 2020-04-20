package org.sang.controller.upload;

import java.util.Date;
import java.util.List;

import org.sang.bean.Folder;
import org.sang.bean.JobLevel;
import org.sang.bean.RespBean;
import org.sang.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/folder/basic")
public class knowledgeFolderController {
	
	@Autowired
	private FolderService folderServiceImpl;
	
	 @RequestMapping(value = "/insert", method = RequestMethod.POST)
	    public RespBean addFolder(Folder folder) {
		 folder.setId((int)new Date().getTime());
	        boolean result = folderServiceImpl.addFolder(folder);
	        if (result) {
	            return RespBean.ok("添加成功!");
	        }
	        return RespBean.error("添加失败!");
	    }
	 
	 @RequestMapping(value = "/getAllFolder", method = RequestMethod.POST)
	    public RespBean getAllFolder() {
	        List<Folder> list = folderServiceImpl.getAllFolder();
	        return RespBean.ok("success",list);
	    }
	 
	 @RequestMapping(value = "/getChirdFolder", method = RequestMethod.POST)
	    public RespBean getChirdFolder(int parentId) {
	        List<Folder> list = folderServiceImpl.getChirdFolder(parentId);
	        return RespBean.ok("success",list);
	    }

}
