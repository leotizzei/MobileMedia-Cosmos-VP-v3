
package br.unicamp.ic.sed.mobilemedia.filesystemmgr_mobilephonemgr.impl;

import javax.microedition.lcdui.Image;

import br.unicamp.ic.sed.mobilemedia.main.spec.dt.IImageData;
import br.unicamp.ic.sed.mobilemedia.mobilephonemgr.spec.req.IFilesystem;

class IFileSystemAdapter implements IFilesystem{

	private Manager manager;

	public IFileSystemAdapter(Manager mgr) {
		this.manager = mgr; 
	}
 
	public IImageData[] getImages ( String albumName ) {

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
		
		return filesystem.getImages(albumName);
		
	} 

	public void addNewPhotoToAlbum ( String imageName, String imagePath, String albumName ) {

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
		
		filesystem.addNewPhotoToAlbum(imageName, imagePath, albumName);
		
		
	}

	public void deleteImage ( String imageName, String albumName ){

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
	
		filesystem.deleteImage(imageName, albumName);
		
	}

	public Image getImageFromRecordStore ( String albumName, String imageName ){

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
		
		return filesystem.getImageFromRecordStore(albumName, imageName);
		
	}

	public String[] getAlbumNames (  ) {

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");		
	
		return filesystem.getAlbumNames();
	}

	public void resetImageData (  ){

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");

		filesystem.resetImageData();
	}

	public void createNewPhotoAlbum ( String albumName ) {

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
	
		filesystem.createNewPhotoAlbum(albumName);
	
	}

	public void deletePhotoAlbum ( String albumName ){

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
	
		filesystem.deletePhotoAlbum(albumName);
	
	}

	public IImageData getImageInfo(String imageName){

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
	 
		return filesystem.getImageInfo(imageName);
	}

	public boolean updateImageInfo(IImageData oldData, IImageData newData)
			{

		br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem filesystem;
		filesystem = (br.unicamp.ic.sed.mobilemedia.filesystemmgr.spec.prov.IFilesystem)manager.getRequiredInterface("IFilesystem");
	
		filesystem.updateImageInfo(oldData , newData);
		

		return false; 
	}

}