package cn.tf.taotao.portal.pojo;

import java.awt.Image;

import cn.tf.taotao.po.TbItem;

public class ItemInfo extends TbItem{
	
	
	public String[] getImages(){
		String image=getImage();
		if(image!=null){
			String[] images=image.split(",");
			return images;
		}
		return null;
	}

}
