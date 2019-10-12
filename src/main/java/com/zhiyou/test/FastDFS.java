package com.zhiyou.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class FastDFS {
	/*
	 * 1.依赖
	 * 2.FastDFS配置文件
	 * 3.javaAPI
	 * 		加载配置文件
	 * 
	 * 		创建Tracker客户端
	 * 		通过Tracker客户端得到Tracker对象
	 * 		通过Tracker得到Storage客户端
	 * 		创建文件属性存储对象
	 * 		通过客户端执行上传
	 * 
	 */
	@Test
	public void upload() throws IOException, MyException {
		// 1. 加载配置文件
		ClientGlobal.init("E:\\JAVA项目\\Hospital\\src\\test\\java\\fastdfs-client.properties");
		// 2. 创建管理端对象
		TrackerClient trackerClient = new TrackerClient();
		// 3. 通过管理端对象获取连接
		TrackerServer connection = trackerClient.getConnection();
		// 4. 创建存储端对象
		StorageClient1 storageClient = new StorageClient1(connection, null);
		//创建文件属性存储对象
		NameValuePair[] list = new NameValuePair[1];
		list[0] = new NameValuePair("fileName", "5.png");
		
		String file = storageClient.upload_file1("C:\\Users\\Administrator\\Desktop\\图片\\5.png", "png", list);
		System.out.println(file);
		System.out.println("wancheng");
		
	}
	
	
	@Test
	public void download() throws IOException, MyException {
		String fid ="group1/M00/00/00/wKhTgF2IsrOAX4sBAABWkUja3Jk027.png";
		// 1. 加载配置文件
		ClientGlobal.init("E:\\JAVA项目\\Hospital\\src\\test\\java\\fastdfs-client.properties");
		// 2. 创建管理端对象
		TrackerClient trackerClient = new TrackerClient();
		// 3. 通过管理端对象获取连接
		TrackerServer connection = trackerClient.getConnection();
		// 4. 创建存储端对象
		StorageClient1 storageClient = new StorageClient1(connection, null);
			
		byte[] file1 = storageClient.download_file1(fid);
		OutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\图片\\11.png");
		out.write(file1);
		out.close();
		System.out.println("下载成功");
	}
	
	
}
