package com.ims.config.oss.aliyun;

import java.io.InputStream;

import com.aliyun.oss.OSS;
import com.ims.config.oss.OSSManager;
import com.ims.config.oss.OSSProperties;
import com.ims.config.oss.OSSManager;
import com.ims.config.oss.OSSProperties;
import com.ims.config.oss.OSSManager;
import com.ims.config.oss.OSSProperties;

/**
 * Object Storage Service of AliYun.
 */
public class AliYunOSSManager implements OSSManager {

	private OSS client;

	private OSSProperties properties;

	AliYunOSSManager(OSS client, OSSProperties properties) {
		this.client = client;
		this.properties = properties;
	}

	@Override
	public void upload(String fileName, InputStream inputStream) {
		this.client.putObject(this.properties.getBucketName(), fileName, inputStream);
	}

	@Override
	public void delete(String fileName) {
		this.client.deleteObject(this.properties.getBucketName(), fileName);
	}

}
