package org.sang.service;

import java.util.List;

import org.sang.bean.Folder;

public interface FolderService {
	
	boolean addFolder(Folder folder);
	
	List<Folder> getAllFolder();
	
	List<Folder> getChirdFolder(int parentId);

}
