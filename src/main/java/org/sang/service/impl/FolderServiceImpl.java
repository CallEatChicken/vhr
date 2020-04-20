package org.sang.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.sang.bean.Folder;
import org.sang.mapper.FolderMapper;
import org.sang.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FolderServiceImpl implements FolderService{

	@Autowired
	private FolderMapper folderMapper;
	
	@Override
	public boolean addFolder(Folder folder) {
		int i = folderMapper.insert(folder);
		return i>0||false;
	}

	@Override
	public List<Folder> getAllFolder() {
		return folderMapper.getAllFolder();
	}

	@Override
	public List<Folder> getChirdFolder(int parentId) {
		return folderMapper.getChirdFolder(parentId);
	}

}
